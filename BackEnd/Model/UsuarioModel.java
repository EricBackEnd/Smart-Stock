package com.smartstock.model;

import java.time.LocalDateTime;
import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class UsuarioModel {

    // 1. ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nome", nullable = false, length = 150)
    private String nome;
    
    @Column(name = "email", nullable = false, unique = true, length = 150)
    private String email;
    
    @Column(name = "senha", nullable = false, length = 255)
    private String senha;
    
    @Column(name = "role", nullable = false, length = 50)
    private String role;
    
    @Column(name = "status", nullable = false, length = 30)
    private String status;
    
    @Column(name = "data_cadastro", nullable = false)
    private LocalDateTime dataCadastro;

    // 2. CONSTRUTOR VAZIO
    public UsuarioModel() {
    }

    // 3. CONSTRUTOR COM PARÂMETROS
    public UsuarioModel(Long id, String nome, String email, String senha, String role, String status, LocalDateTime dataCadastro) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.role = role;
        this.status = status;
        this.dataCadastro = dataCadastro;
    }

    // 4. GETTERS E SETTERS
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    // 5. MÉTODOS DE NEGÓCIO
    public boolean isAtivo() {
        return "ATIVO".equalsIgnoreCase(this.status);
    }
}