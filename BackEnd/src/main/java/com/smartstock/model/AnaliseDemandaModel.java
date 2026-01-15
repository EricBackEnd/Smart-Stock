package com.smartstock.model;

import java.time.LocalDateTime;
import jakarta.persistence.*;

@Entity
@Table(name = "analise_demanda")
public class AnaliseDemandaModel {

    // 1. ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "id_produto", nullable = false)
    private Long idProduto;
    
    @Column(name = "periodo", nullable = false, length = 20)
    private String periodo;
    
    @Column(name = "quantidade_vendida", nullable = false)
    private Integer quantidadeVendida;
    
    @Column(name = "media_historica")
    private Double mediaHistorica;
    
    @Column(name = "variacao_percentual")
    private Double variacaoPercentual;
    
    @Column(name = "tendencia", length = 20)
    private String tendencia;
    
    @Column(name = "sugestao", length = 500)
    private String sugestao;
    
    @Column(name = "data_referencia", nullable = false)
    private LocalDateTime dataReferencia;
    
    @Column(name = "data_calculo", nullable = false)
    private LocalDateTime dataCalculo;

    // 2. CONSTRUTOR VAZIO
    public AnaliseDemandaModel() {
    }

    // 3. CONSTRUTOR COM PARÂMETROS
    public AnaliseDemandaModel(Long id, Long idProduto, String periodo, Integer quantidadeVendida, 
                              Double mediaHistorica, Double variacaoPercentual, String tendencia, 
                              String sugestao, LocalDateTime dataReferencia, LocalDateTime dataCalculo) {
        this.id = id;
        this.idProduto = idProduto;
        this.periodo = periodo;
        this.quantidadeVendida = quantidadeVendida;
        this.mediaHistorica = mediaHistorica;
        this.variacaoPercentual = variacaoPercentual;
        this.tendencia = tendencia;
        this.sugestao = sugestao;
        this.dataReferencia = dataReferencia;
        this.dataCalculo = dataCalculo;
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

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public Integer getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public void setQuantidadeVendida(Integer quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }

    public Double getMediaHistorica() {
        return mediaHistorica;
    }

    public void setMediaHistorica(Double mediaHistorica) {
        this.mediaHistorica = mediaHistorica;
    }

    public Double getVariacaoPercentual() {
        return variacaoPercentual;
    }

    public void setVariacaoPercentual(Double variacaoPercentual) {
        this.variacaoPercentual = variacaoPercentual;
    }

    public String getTendencia() {
        return tendencia;
    }

    public void setTendencia(String tendencia) {
        this.tendencia = tendencia;
    }

    public String getSugestao() {
        return sugestao;
    }

    public void setSugestao(String sugestao) {
        this.sugestao = sugestao;
    }

    public LocalDateTime getDataReferencia() {
        return dataReferencia;
    }

    public void setDataReferencia(LocalDateTime dataReferencia) {
        this.dataReferencia = dataReferencia;
    }

    public LocalDateTime getDataCalculo() {
        return dataCalculo;
    }

    public void setDataCalculo(LocalDateTime dataCalculo) {
        this.dataCalculo = dataCalculo;
    }
}