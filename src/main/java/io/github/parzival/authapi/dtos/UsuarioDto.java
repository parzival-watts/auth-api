package io.github.parzival.authapi.dtos;

public record UsuarioDto(
        String nome,
        String login,
        String senha
) {
}
