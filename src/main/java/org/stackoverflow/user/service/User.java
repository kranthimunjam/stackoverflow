package org.stackoverflow.user.service;

import java.util.Collection;
import java.util.List;


import org.stackoverflow.user.util.UserRole;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "users")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique=true)
    private String login;

    private String password;

    @Enumerated(EnumType.STRING)
    private UserRole userRole;

    public User(String login, String password, UserRole type) {
        this.login = login;
        this.password = password;
        this.userRole = type;
    }

    // @Override
    // public Collection<? extends GrantedAuthority> getAuthorities() {
    //     if (this.userRole == UserRole.ADMIN) {
    //         return List.of(new SimpleGrantedAuthority("ROLE_ADMIN"), new SimpleGrantedAuthority("ROLE_USER"));
    //     }
    //     return List.of(new SimpleGrantedAuthority("ROLE_USER"));
    // }

    // @Override
    // public String getPassword() {
    //     return password;
    // }

    // @Override
    // public String getUsername() {
    //     return login;
    // }

    // @Override
    // public boolean isAccountNonExpired() {
    //     return true;
    // }

    // @Override
    // public boolean isAccountNonLocked() {
    //     return true;
    // }

    // @Override
    // public boolean isCredentialsNonExpired() {
    //     return true;
    // }

    // @Override
    // public boolean isEnabled() {
    //     return true;
    // }
}
