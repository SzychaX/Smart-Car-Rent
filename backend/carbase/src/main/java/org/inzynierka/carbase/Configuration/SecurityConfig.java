package org.inzynierka.carbase.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // Wyłączenie CSRF dla REST API
                .authorizeHttpRequests(auth -> auth
                        .anyRequest().permitAll() // Zezwolenie na wszystkie żądania
                );
        return http.build();
    }
}

