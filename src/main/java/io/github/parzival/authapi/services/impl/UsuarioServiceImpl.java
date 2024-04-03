package io.github.parzival.authapi.services.impl;

import io.github.parzival.authapi.dtos.UsuarioDto;
import io.github.parzival.authapi.models.Usuario;
import io.github.parzival.authapi.repositories.UsuarioRepository;
import io.github.parzival.authapi.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UsuarioDto salvar(UsuarioDto usuarioDto) {

        Usuario usuarioExiste = usuarioRepository.findByLogin(usuarioDto.login());

        if (usuarioExiste != null){
            throw new RuntimeException("Usuario ja existe");
        }

        var passwordHash = passwordEncoder.encode(usuarioDto.senha());

        Usuario entity = new Usuario(usuarioDto.nome(),usuarioDto.login(),passwordHash,usuarioDto.role());

        Usuario novoUsuario = usuarioRepository.save(entity);

        return new UsuarioDto(novoUsuario.getNome(), novoUsuario.getLogin(),novoUsuario.getSenha(),novoUsuario.getRole());
    }
}
