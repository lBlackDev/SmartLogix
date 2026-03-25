package com.smartlogix.gateway.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public GroupedOpenApi authApi() {
        return GroupedOpenApi.builder()
                .group("1. auth-service")
                .pathsToMatch("/api/auth/**")
                .build();
    }

    @Bean
    public GroupedOpenApi inventarioApi() {
        return GroupedOpenApi.builder()
                .group("2. servicio-inventario")
                .pathsToMatch("/api/inventario/**")
                .build();
    }

    @Bean
    public GroupedOpenApi ordenApi() {
        return GroupedOpenApi.builder()
                .group("3. servicio-orden")
                .pathsToMatch("/api/orden/**")
                .build();
    }

    @Bean
    public GroupedOpenApi pedidosApi() {
        return GroupedOpenApi.builder()
                .group("4. servicio-pedidos")
                .pathsToMatch("/api/pedidos/**")
                .build();
    }

    @Bean
    public GroupedOpenApi bffApi() {
        return GroupedOpenApi.builder()
                .group("5. bff-service")
                .pathsToMatch("/api/bff/**")
                .build();
    }
}
