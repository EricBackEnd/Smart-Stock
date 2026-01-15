package com.smartstock.model;

import java.time.LocalDateTime;
import jakarta.persistence.*;

@Entity
@Table(name = "estoque")
public class EstoqueModel {

    // 1. ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "id_produto", nullable = false, unique = true)
    private Long idProduto;
    
    @Column(name = "quantidade_atual", nullable = false)
    private Integer quantidadeAtual;
    
    @Column(name = "quantidade_minima", nullable = false)
    private Integer quantidadeMinima;
    
    @Column(name = "ultima_atualizacao", nullable = false)
    private LocalDateTime ultimaAtualizacao;

    // 2. CONSTRUTOR VAZIO
    public EstoqueModel() {
    }

    // 3. CONSTRUTOR COM PARÂMETROS
    public EstoqueModel(Long id, Long idProduto, Integer quantidadeAtual, Integer quantidadeMinima, LocalDateTime ultimaAtualizacao) {
        this.id = id;
        this.idProduto = idProduto;
        this.quantidadeAtual = quantidadeAtual;
        this.quantidadeMinima = quantidadeMinima;
        this.ultimaAtualizacao = ultimaAtualizacao;
    }

    // 4. GETTERS E SETTERS
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
    }

    public Integer getQuantidadeAtual() {
        return quantidadeAtual;
    }

    public void setQuantidadeAtual(Integer quantidadeAtual) {
        this.quantidadeAtual = quantidadeAtual;
    }

    public Integer getQuantidadeMinima() {
        return quantidadeMinima;
    }

    public void setQuantidadeMinima(Integer quantidadeMinima) {
        this.quantidadeMinima = quantidadeMinima;
    }

    public LocalDateTime getUltimaAtualizacao() {
        return ultimaAtualizacao;
    }

    public void setUltimaAtualizacao(LocalDateTime ultimaAtualizacao) {
        this.ultimaAtualizacao = ultimaAtualizacao;
    }

    // 5. MÉTODOS DE NEGÓCIO
    public boolean isEstoqueBaixo() {
        return this.quantidadeAtual <= this.quantidadeMinima;
    }
}