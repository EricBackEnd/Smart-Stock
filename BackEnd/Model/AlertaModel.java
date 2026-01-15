package com.smartstock.model;

import java.time.LocalDateTime;
import jakarta.persistence.*;

@Entity
@Table(name = "alerta")
public class AlertaModel {

    // 1. ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "id_usuario", nullable = false)
    private Long idUsuario;
    
    @Column(name = "id_produto", nullable = false)
    private Long idProduto;
    
    @Column(name = "tipo", nullable = false, length = 50)
    private String tipo;
    
    @Column(name = "mensagem", nullable = false, length = 500)
    private String mensagem;
    
    @Column(name = "severidade", nullable = false, length = 20)
    private String severidade;
    
    @Column(name = "lido", nullable = false)
    private Boolean lido;
    
    @Column(name = "data_criacao", nullable = false)
    private LocalDateTime dataCriacao;

    // 2. CONSTRUTOR VAZIO
    public AlertaModel() {
    }

    // 3. CONSTRUTOR COM PARÂMETROS
    public AlertaModel(Long id, Long idUsuario, Long idProduto, String tipo, String mensagem, 
                      String severidade, Boolean lido, LocalDateTime dataCriacao) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idProduto = idProduto;
        this.tipo = tipo;
        this.mensagem = mensagem;
        this.severidade = severidade;
        this.lido = lido;
        this.dataCriacao = dataCriacao;
    }

    // 4. GETTERS E SETTERS
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getSeveridade() {
        return severidade;
    }

    public void setSeveridade(String severidade) {
        this.severidade = severidade;
    }

    public Boolean getLido() {
        return lido;
    }

    public void setLido(Boolean lido) {
        this.lido = lido;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}