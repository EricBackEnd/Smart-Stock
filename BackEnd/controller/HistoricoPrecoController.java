package com.smartstock.controller;

import com.smartstock.model.HistoricoPrecoModel;
import com.smartstock.service.HistoricoPrecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/historico-precos")
public class HistoricoPrecoController {

    @Autowired
    private HistoricoPrecoService historicoPrecoService;

    @GetMapping
    public List<HistoricoPrecoModel> listarTodos() {
        return historicoPrecoService.listarTodos();
    }

    @PostMapping
    public HistoricoPrecoModel criarHistorico(@RequestBody HistoricoPrecoModel historico) {
        return historicoPrecoService.criarHistorico(
                historico.getIdProduto(),
                historico.getPrecoAnterior(),
                historico.getPrecoNovo()
        );
    }
}