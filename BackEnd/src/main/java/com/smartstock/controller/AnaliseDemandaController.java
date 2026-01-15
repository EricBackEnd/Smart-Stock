package com.smartstock.controller;

import com.smartstock.model.AnaliseDemandaModel;
import com.smartstock.service.AnaliseDemandaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/analises-demanda")
public class AnaliseDemandaController {

    @Autowired
    private AnaliseDemandaService analiseDemandaService;

    @GetMapping
    public List<AnaliseDemandaModel> listarTodas() {
        return analiseDemandaService.listarTodas();
    }

    @PostMapping
    public AnaliseDemandaModel criarAnalise(@RequestBody AnaliseDemandaModel analise) {
        return analiseDemandaService.criarAnalise(
                analise.getIdProduto(),
                analise.getPeriodo(),
                analise.getQuantidadeVendida(),
                analise.getMediaHistorica(),
                analise.getVariacaoPercentual(),
                analise.getTendencia(),
                analise.getSugestao(),
                analise.getDataReferencia()
        );
    }
}