package io.github.parzival.authapi.dtos;

import io.github.parzival.authapi.enums.RoleEnum;

public record UsuarioDto(
        String nome,
        String login,
        String senha,
        RoleEnum role
) {
}
