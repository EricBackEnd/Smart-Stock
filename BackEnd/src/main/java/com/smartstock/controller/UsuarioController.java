package com.smartstock.controller;

import com.smartstock.model.UsuarioModel;
import com.smartstock.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<UsuarioModel> listarTodos() {
        return usuarioService.listarTodos();
    }

    @PostMapping
    public UsuarioModel criarUsuario(@RequestBody UsuarioModel usuario) {
        return usuarioService.criarUsuario(
                usuario.getNome(),
                usuario.getEmail(),
                usuario.getSenha(),
                usuario.getRole()
        );
    }
}