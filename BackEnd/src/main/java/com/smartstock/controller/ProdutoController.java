package com.smartstock.controller;

import com.smartstock.model.ProdutoModel;
import com.smartstock.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<ProdutoModel> listarTodos() {
        return produtoService.listarTodos();
    }

    @PostMapping
    public ProdutoModel criarProduto(@RequestBody ProdutoModel produto) {
        return produtoService.criarProduto(
                produto.getIdUsuario(),
                produto.getNome(),
                produto.getCategoria(),
                produto.getPrecoAtual(),
                produto.getPercentualReposicao(),
                produto.getPercentualAjustePreco()
        );
    }
}