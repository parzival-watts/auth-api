package io.github.parzival.authapi.services;

import io.github.parzival.authapi.dtos.AuthDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface AutenticacaoService extends UserDetailsService {

    public String obterToken(AuthDto authDto);

    public String validaTokenJwt(String token);
}
