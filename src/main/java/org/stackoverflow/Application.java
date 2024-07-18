package org.stackoverflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
@EnableJpaRepositories(basePackages = "org.stackoverflow.userservice")
@SpringBootApplication
// @PropertySource("file:${user.dir}/.env")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}