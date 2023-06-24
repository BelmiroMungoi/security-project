package com.bbm.securityproject;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SecurityProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityProjectApplication.class, args);
    }

    /**@Bean
    public CommandLineRunner commandLineRunner(AuthenticationService service) {
        return args -> {
            var admin = RegisterRequest.builder()
                    .firstname("Admin")
                    .lastname("Second")
                    .email("admin@mail.com")
                    .password("admin")
                    .role(ADMIN)
                    .build();
            System.out.println("Admin token: " + service.register(admin).getToken());

            var manager = RegisterRequest.builder()
                    .firstname("Manager")
                    .lastname("Third")
                    .email("manager@mail.com")
                    .password("manager")
                    .role(MANAGER)
                    .build();
            System.out.println("Manager token: "+ service.register(manager).getToken());
        };
    }*/

}
