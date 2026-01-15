package com.smartstock.service;

import com.smartstock.model.EstoqueModel;
import com.smartstock.repository.EstoqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class EstoqueService {

    @Autowired
    private EstoqueRepository estoqueRepository;

    public EstoqueModel criarEstoque(Long idProduto, Integer quantidadeAtual, Integer quantidadeMinima) {
        // 1. Criar novo estoque
        EstoqueModel novoEstoque = new EstoqueModel();
        novoEstoque.setIdProduto(idProduto);
        novoEstoque.setQuantidadeAtual(quantidadeAtual);
        novoEstoque.setQuantidadeMinima(quantidadeMinima);
        novoEstoque.setUltimaAtualizacao(LocalDateTime.now());

        // 2. Salvar no banco
        return estoqueRepository.save(novoEstoque);
    }

    public Optional<EstoqueModel> buscarPorId(Long id) {
        return estoqueRepository.findById(id);
    }

    public List<EstoqueModel> listarTodos() {
        return estoqueRepository.findAll();
    }
}