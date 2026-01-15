package com.smartstock.controller;

import com.smartstock.model.VendaModel;
import com.smartstock.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/vendas")
public class VendaController {

    @Autowired
    private VendaService vendaService;

    @GetMapping
    public List<VendaModel> listarTodas() {
        return vendaService.listarTodas();
    }

    @PostMapping
    public VendaModel criarVenda(@RequestBody VendaModel venda) {
        return vendaService.criarVenda(
                venda.getIdUsuario(),
                venda.getValorTotal()
        );
    }
}