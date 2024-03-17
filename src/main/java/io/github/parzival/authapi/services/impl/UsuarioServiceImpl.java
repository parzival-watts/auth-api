package io.github.parzival.authapi.services.impl;

import io.github.parzival.authapi.dtos.UsuarioDto;
import io.github.parzival.authapi.models.Usuario;
import io.github.parzival.authapi.repositories.UsuarioRepository;
import io.github.parzival.authapi.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UsuarioDto salvar(UsuarioDto usuarioDto) {
        Usuario entity = new Usuario(usuarioDto.nome(),usuarioDto.login(),usuarioDto.senha());

        Usuario novoUsuario = usuarioRepository.save(entity);

        return new UsuarioDto(novoUsuario.getNome(), novoUsuario.getLogin(),novoUsuario.getSenha());
    }
}
