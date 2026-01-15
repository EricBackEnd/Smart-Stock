package com.smartstock.model;

import jakarta.persistence.*;

@Entity
@Table(name = "item_venda")
public class ItemVendaModel {

    // 1. ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "id_venda", nullable = false)
    private Long idVenda;
    
    @Column(name = "id_produto", nullable = false)
    private Long idProduto;
    
    @Column(name = "quantidade", nullable = false)
    private Integer quantidade;
    
    @Column(name = "preco_unitario", nullable = false)
    private Double precoUnitario;

    // 2. CONSTRUTOR VAZIO
    public ItemVendaModel() {
    }

    // 3. CONSTRUTOR COM PARÂMETROS
    public ItemVendaModel(Long id, Long idVenda, Long idProduto, Integer quantidade, Double precoUnitario) {
        this.id = id;
        this.idVenda = idVenda;
        this.idProduto = idProduto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    // 4. GETTERS E SETTERS
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(Long idVenda) {
        this.idVenda = idVenda;
    }

    public Long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(Double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    // 5. MÉTODOS DE NEGÓCIO
    public Double getSubtotal() {
        return this.quantidade * this.precoUnitario;
    }
}