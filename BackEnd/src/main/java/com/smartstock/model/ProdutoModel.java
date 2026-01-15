package com.smartstock.model;

import java.time.LocalDateTime;
import jakarta.persistence.*;

@Entity
@Table(name = "produto")
public class ProdutoModel {

    // 1. ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "id_usuario", nullable = false)
    private Long idUsuario;
    
    @Column(name = "nome", nullable = false, length = 200)
    private String nome;
    
    @Column(name = "categoria", length = 100)
    private String categoria;
    
    @Column(name = "preco_atual", nullable = false)
    private Double precoAtual;
    
    @Column(name = "percentual_reposicao")
    private Double percentualReposicao;
    
    @Column(name = "percentual_ajuste_preco")
    private Double percentualAjustePreco;
    
    @Column(name = "status", nullable = false, length = 30)
    private String status;
    
    @Column(name = "data_cadastro", nullable = false)
    private LocalDateTime dataCadastro;

    // 2. CONSTRUTOR VAZIO
    public ProdutoModel() {
    }

    // 3. CONSTRUTOR COM PARÂMETROS
    public ProdutoModel(Long id, Long idUsuario, String nome, String categoria, Double precoAtual, 
                       Double percentualReposicao, Double percentualAjustePreco, String status, LocalDateTime dataCadastro) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.categoria = categoria;
        this.precoAtual = precoAtual;
        this.percentualReposicao = percentualReposicao;
        this.percentualAjustePreco = percentualAjustePreco;
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

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getPrecoAtual() {
        return precoAtual;
    }

    public void setPrecoAtual(Double precoAtual) {
        this.precoAtual = precoAtual;
    }

    public Double getPercentualReposicao() {
        return percentualReposicao;
    }

    public void setPercentualReposicao(Double percentualReposicao) {
        this.percentualReposicao = percentualReposicao;
    }

    public Double getPercentualAjustePreco() {
        return percentualAjustePreco;
    }

    public void setPercentualAjustePreco(Double percentualAjustePreco) {
        this.percentualAjustePreco = percentualAjustePreco;
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