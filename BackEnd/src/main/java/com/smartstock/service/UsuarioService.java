package com.smartstock.service;

import com.smartstock.model.UsuarioModel;
import com.smartstock.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public UsuarioModel criarUsuario(String nome, String email, String senha, String role) {
        if (usuarioRepository.existsByEmail(email)) {
            throw new RuntimeException("Email já cadastrado");
        }

        UsuarioModel novoUsuario = new UsuarioModel();
        novoUsuario.setNome(nome);
        novoUsuario.setEmail(email);
        novoUsuario.setSenha(senha);
        novoUsuario.setRole(role);
        novoUsuario.setStatus("ATIVO");
        novoUsuario.setDataCadastro(LocalDateTime.now());

        return usuarioRepository.save(novoUsuario);
    }

    public Optional<UsuarioModel> buscarPorEmail(String email) {
        return usuarioRepository.findByEmail(email);
    }

    public List<UsuarioModel> listarTodos() {
        return usuarioRepository.findAll();
    }
}
