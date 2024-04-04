package io.github.parzival.authapi.controllers;

import io.github.parzival.authapi.dtos.UsuarioDto;
import io.github.parzival.authapi.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    private UsuarioDto salvar(@RequestBody UsuarioDto usuarioDto){

        return usuarioService.salvar(usuarioDto);
    }

    @GetMapping("/admin")
    private String getAdmin(){
        return "Permissão de administrador";
    }

    @GetMapping("/user")
    private String getUser(){
        return "Permissão de usuario";
    }

}
