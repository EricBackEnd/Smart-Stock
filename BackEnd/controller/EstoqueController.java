package com.smartstock.controller;

import com.smartstock.model.EstoqueModel;
import com.smartstock.service.EstoqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/estoques")
public class EstoqueController {

    @Autowired
    private EstoqueService estoqueService;

    @GetMapping
    public List<EstoqueModel> listarTodos() {
        return estoqueService.listarTodos();
    }

    @PostMapping
    public EstoqueModel criarEstoque(@RequestBody EstoqueModel estoque) {
        return estoqueService.criarEstoque(
                estoque.getIdProduto(),
                estoque.getQuantidadeAtual(),
                estoque.getQuantidadeMinima()
        );
    }
}