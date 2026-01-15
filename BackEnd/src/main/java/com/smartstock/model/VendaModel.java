package com.smartstock.model;

import java.time.LocalDateTime;
import jakarta.persistence.*;

@Entity
@Table(name = "venda")
public class VendaModel {

    // 1. ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "id_usuario", nullable = false)
    private Long idUsuario;
    
    @Column(name = "data_venda", nullable = false)
    private LocalDateTime dataVenda;
    
    @Column(name = "valor_total", nullable = false)
    private Double valorTotal;

    // 2. CONSTRUTOR VAZIO
    public VendaModel() {
    }

    // 3. CONSTRUTOR COM PARÂMETROS
    public VendaModel(Long id, Long idUsuario, LocalDateTime dataVenda, Double valorTotal) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.dataVenda = dataVenda;
        this.valorTotal = valorTotal;
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

    public LocalDateTime getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDateTime dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }
}