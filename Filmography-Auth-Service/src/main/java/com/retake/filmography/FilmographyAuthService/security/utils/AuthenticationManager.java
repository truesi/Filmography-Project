package com.retake.filmography.FilmographyAuthService.security.utils;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

public interface AuthenticationManager {
    org.springframework.security.core.Authentication authenticate(Authentication var1) throws AuthenticationException;
}
