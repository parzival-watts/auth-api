package io.github.parzival.authapi.services;

import io.github.parzival.authapi.dtos.AuthDto;
import io.github.parzival.authapi.dtos.TokenResponseDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface AutenticacaoService extends UserDetailsService {

    public TokenResponseDto obterToken(AuthDto authDto);

    public String validaTokenJwt(String token);

    TokenResponseDto obterRefreshToken(String s);
}
