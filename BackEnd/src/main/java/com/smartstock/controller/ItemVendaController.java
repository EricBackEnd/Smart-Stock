package com.smartstock.controller;

import com.smartstock.model.ItemVendaModel;
import com.smartstock.service.ItemVendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/itens-venda")
public class ItemVendaController {

    @Autowired
    private ItemVendaService itemVendaService;

    @GetMapping
    public List<ItemVendaModel> listarTodos() {
        return itemVendaService.listarTodos();
    }

    @PostMapping
    public ItemVendaModel criarItemVenda(@RequestBody ItemVendaModel itemVenda) {
        return itemVendaService.criarItemVenda(
                itemVenda.getIdVenda(),
                itemVenda.getIdProduto(),
                itemVenda.getQuantidade(),
                itemVenda.getPrecoUnitario()
        );
    }
}