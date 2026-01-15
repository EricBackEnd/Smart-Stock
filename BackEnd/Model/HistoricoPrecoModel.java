package com.smartstock.model;

import java.time.LocalDateTime;
import jakarta.persistence.*;

@Entity
@Table(name = "historico_preco")
public class HistoricoPrecoModel {

    // 1. ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "id_produto", nullable = false)
    private Long idProduto;
    
    @Column(name = "preco_anterior", nullable = false)
    private Double precoAnterior;
    
    @Column(name = "preco_novo", nullable = false)
    private Double precoNovo;
    
    @Column(name = "data_alteracao", nullable = false)
    private LocalDateTime dataAlteracao;

    // 2. CONSTRUTOR VAZIO
    public HistoricoPrecoModel() {
    }

    // 3. CONSTRUTOR COM PARÂMETROS
    public HistoricoPrecoModel(Long id, Long idProduto, Double precoAnterior, Double precoNovo, LocalDateTime dataAlteracao) {
        this.id = id;
        this.idProduto = idProduto;
        this.precoAnterior = precoAnterior;
        this.precoNovo = precoNovo;
        this.dataAlteracao = dataAlteracao;
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

    public Double getPrecoAnterior() {
        return precoAnterior;
    }

    public void setPrecoAnterior(Double precoAnterior) {
        this.precoAnterior = precoAnterior;
    }

    public Double getPrecoNovo() {
        return precoNovo;
    }

    public void setPrecoNovo(Double precoNovo) {
        this.precoNovo = precoNovo;
    }

    public LocalDateTime getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(LocalDateTime dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }

    // 5. MÉTODOS DE NEGÓCIO
    public Double getVariacaoPercentual() {
        return ((precoNovo - precoAnterior) / precoAnterior) * 100;
    }
}