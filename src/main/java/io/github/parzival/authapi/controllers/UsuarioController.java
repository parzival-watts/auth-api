package io.github.parzival.authapi.controllers;

import io.github.parzival.authapi.dtos.UsuarioDto;
import io.github.parzival.authapi.services.UsuarioService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @Operation(
                summary = "Cadastrar",
                description = "Rota para cadastrar um novo usuario",
                responses = {
                        @ApiResponse(
                                description = "Seccess",
                                responseCode = "200"),
                }
            )
    @PostMapping
    private UsuarioDto salvar(@RequestBody UsuarioDto usuarioDto) {

        return usuarioService.salvar(usuarioDto);
    }

    @Operation(
            summary = "Testar ADMIN",
            description = "Rota para testar a permissao de administrador",
            responses = {
                    @ApiResponse(
                            description = "Seccess",
                            responseCode = "200"
                    ),
                    @ApiResponse(
                            description = "Unauthorized / Invalid token",
                            responseCode = "403"
                    ),
            }
    )
    @GetMapping("/admin")
    private String getAdmin() {
        return "Permissão de administrador";
    }

    @Operation(
            summary = "Testar USER",
            description = "Rota para testar a permissao de usuario",
            responses = {
                @ApiResponse(
                        description = "Seccess",
                        responseCode = "200"
                ),
                @ApiResponse(
                        description = "Unauthorized / Invalid token",
                        responseCode = "403"
                ),
            }
    )
    @GetMapping("/user")
    private String getUser() {
        return "Permissão de usuario";
    }

}
