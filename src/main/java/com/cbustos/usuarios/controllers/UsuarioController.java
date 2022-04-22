package com.cbustos.usuarios.controllers;

import com.cbustos.usuarios.models.UsuarioModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cbustos.usuarios.services.UsuarioService;

import java.util.ArrayList;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping(value = "/getUsuarios", produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<UsuarioModel> getUsuarios(){
        return usuarioService.getUsers();
    }

    @PostMapping(value = "/saveUsuario", produces = MediaType.APPLICATION_JSON_VALUE)
    public UsuarioModel saveUsuario(UsuarioModel usuarioModel){
        return usuarioService.saveUser(usuarioModel);
    }

}
