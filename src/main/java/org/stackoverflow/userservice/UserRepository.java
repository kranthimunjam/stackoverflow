package org.stackoverflow.userservice;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.data.jpa.repository.Query;
import org.stackoverflow.user.service.User;

public interface UserRepository extends JpaRepository<User, Long> {
    public UserDetails findByLogin(String login);
}
