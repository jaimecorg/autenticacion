package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jaimecorg.autenticacion.model.Usuario;
import com.jaimecorg.autenticacion.services.UsuarioService;

@RestController
public class UsuarioController {
    
    @Autowired
    UsuarioService service;

    @RequestMapping("/buscar")
    Usuario findByusername(@RequestParam String username, @RequestParam String password) {
        return service.findByusername(username, password);
    }
}
