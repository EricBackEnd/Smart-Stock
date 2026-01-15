package com.smartstock.controller;

import com.smartstock.model.AlertaModel;
import com.smartstock.service.AlertaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/alertas")
public class AlertaController {

    @Autowired
    private AlertaService alertaService;

    @GetMapping
    public List<AlertaModel> listarTodos() {
        return alertaService.listarTodos();
    }

    @PostMapping
    public AlertaModel criarAlerta(@RequestBody AlertaModel alerta) {
        return alertaService.criarAlerta(
                alerta.getIdUsuario(),
                alerta.getIdProduto(),
                alerta.getTipo(),
                alerta.getMensagem(),
                alerta.getSeveridade()
        );
    }
}