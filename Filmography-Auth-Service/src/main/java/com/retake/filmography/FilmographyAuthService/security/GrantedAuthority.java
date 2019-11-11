package com.retake.filmography.FilmographyAuthService.security;

import java.io.Serializable;

public interface GrantedAuthority extends Serializable {
    String getAuthority();
}