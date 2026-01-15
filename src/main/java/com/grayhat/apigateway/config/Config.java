package com.grayhat.apigateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
public class Config {
    
    @Bean
    SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http){
        return http
                .csrf(ServerHttpSecurity.CsrfSpec::disable).authorizeExchange(ex -> ex
                        .pathMatchers("/actuator/health","/actuator/info").permitAll()
                        .pathMatchers("/api/v1/users/ping").permitAll()
                        .anyExchange().authenticated()
                ).oauth2ResourceServer(oauth2 -> oauth2.jwt(jwt -> {})).build();
    }
    
}
