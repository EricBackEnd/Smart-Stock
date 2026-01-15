package com.smartstock.service;

import com.smartstock.model.ItemVendaModel;
import com.smartstock.repository.ItemVendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ItemVendaService {

    @Autowired
    private ItemVendaRepository itemVendaRepository;

    public ItemVendaModel criarItemVenda(Long idVenda, Long idProduto, Integer quantidade, Double precoUnitario) {
        // 1. Criar novo item de venda
        ItemVendaModel novoItemVenda = new ItemVendaModel();
        novoItemVenda.setIdVenda(idVenda);
        novoItemVenda.setIdProduto(idProduto);
        novoItemVenda.setQuantidade(quantidade);
        novoItemVenda.setPrecoUnitario(precoUnitario);

        // 2. Salvar no banco
        return itemVendaRepository.save(novoItemVenda);
    }

    public Optional<ItemVendaModel> buscarPorId(Long id) {
        return itemVendaRepository.findById(id);
    }

    public List<ItemVendaModel> listarTodos() {
        return itemVendaRepository.findAll();
    }
}