package com.smartlogix.gateway.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/auth")
@Tag(name = "Auth Servicio", description = "Autenticacion y gestion de usuarios")
public class AuthController {

    @Operation(summary = "Login", description = "Autenticar usuario y obtener JWT")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Login exitoso, retorna JWT"),
            @ApiResponse(responseCode = "401", description = "Credenciales invalidas",
                content = @Content)
    })
    @PostMapping("/login")
    public Mono<Void> login(){
        return Mono.empty();
    }

    @Operation(summary = "Validar token", description = "Verificar si un JWT es válido")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Token válido"),
            @ApiResponse(responseCode = "401", description = "Token inválido o expirado",
                    content = @Content)
    })
    @GetMapping("/validate")
    public Mono<Void> validateToken() {
        return Mono.empty();
    }
}
