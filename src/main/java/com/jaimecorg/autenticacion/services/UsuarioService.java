package com.jaimecorg.autenticacion.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jaimecorg.autenticacion.model.Usuario;

import repositories.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository uRepository;

    public Usuario findByusername(String username, String password) {
        //para comprobar que con la contraseña tmb funciona
        //return uRepository.findByNameAndPassword(username, password);
        return uRepository.findByName(username);
    }
}
