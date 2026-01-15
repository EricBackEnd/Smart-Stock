package com.smartstock.service;

import com.smartstock.model.ProdutoModel;
import com.smartstock.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public ProdutoModel criarProduto(Long idUsuario, String nome, String categoria, Double precoAtual, 
                                     Double percentualReposicao, Double percentualAjustePreco) {
        // 1. Criar novo produto
        ProdutoModel novoProduto = new ProdutoModel();
        novoProduto.setIdUsuario(idUsuario);
        novoProduto.setNome(nome);
        novoProduto.setCategoria(categoria);
        novoProduto.setPrecoAtual(precoAtual);
        novoProduto.setPercentualReposicao(percentualReposicao);
        novoProduto.setPercentualAjustePreco(percentualAjustePreco);
        novoProduto.setStatus("ATIVO");
        novoProduto.setDataCadastro(LocalDateTime.now());

        // 2. Salvar no banco
        return produtoRepository.save(novoProduto);
    }

    public Optional<ProdutoModel> buscarPorId(Long id) {
        return produtoRepository.findById(id);
    }

    public List<ProdutoModel> listarTodos() {
        return produtoRepository.findAll();
    }
}