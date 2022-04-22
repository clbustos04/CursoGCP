package com.cbustos.usuarios.services;

import com.cbustos.usuarios.models.UsuarioModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cbustos.usuarios.repositories.UsuarioRepository;

import java.util.ArrayList;


@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<UsuarioModel> getUsers(){
       return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }

    public UsuarioModel saveUser(UsuarioModel usuarioModel){
        return usuarioRepository.save(usuarioModel);
    }
}
