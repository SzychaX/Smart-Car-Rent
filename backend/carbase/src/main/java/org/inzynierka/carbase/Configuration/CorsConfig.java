package org.inzynierka.carbase.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
public class CorsConfig {

    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.addAllowedOrigin("http://localhost:8085"); // Zezwolenie na frontend
        configuration.addAllowedMethod("*"); // Zezwolenie na wszystkie metody (GET, POST, itd.)
        configuration.addAllowedHeader("*"); // Zezwolenie na wszystkie nagłówki
        configuration.setAllowCredentials(true); // Zezwolenie na uwierzytelnianie po stronie klienta

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration); // Zastosowanie konfiguracji do wszystkich endpointów
        return source;
    }
}
