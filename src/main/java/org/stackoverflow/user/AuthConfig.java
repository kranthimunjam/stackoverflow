package org.stackoverflow.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.stackoverflow.user.service.SecurityFilter;

// @Configuration
// @EnableWebSecurity
public class AuthConfig {
    // @Autowired
    // SecurityFilter securityFilter;

    // @Bean
    // SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
    //     return httpSecurity
    //             .csrf(csrf -> csrf.disable())
    //             .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
    //             .authorizeHttpRequests(authorize -> authorize
    //                     .requestMatchers(HttpMethod.POST, "/api/v1/auth/signup").permitAll()
    //                     .requestMatchers(HttpMethod.POST, "/comment/v1/books")
    //                     .hasRole("ADMIN")
    //                     .anyRequest().authenticated())
    //             .addFilterBefore(securityFilter, UsernamePasswordAuthenticationFilter.class)
    //             .build();
    // }

    // @Bean
    // AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration)
    //         throws Exception {
    //     return authenticationConfiguration.getAuthenticationManager();
    // }

    // @Bean
    // PasswordEncoder passwordEncoder() {
    //     return new BCryptPasswordEncoder();
    // }
}
