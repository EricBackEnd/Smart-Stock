package com.smartstock.service;

import com.smartstock.model.AnaliseDemandaModel;
import com.smartstock.repository.AnaliseDemandaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class AnaliseDemandaService {

    @Autowired
    private AnaliseDemandaRepository analiseDemandaRepository;

    public AnaliseDemandaModel criarAnalise(Long idProduto, String periodo, Integer quantidadeVendida, 
                                           Double mediaHistorica, Double variacaoPercentual, 
                                           String tendencia, String sugestao, LocalDateTime dataReferencia) {
        // 1. Criar nova análise de demanda
        AnaliseDemandaModel novaAnalise = new AnaliseDemandaModel();
        novaAnalise.setIdProduto(idProduto);
        novaAnalise.setPeriodo(periodo);
        novaAnalise.setQuantidadeVendida(quantidadeVendida);
        novaAnalise.setMediaHistorica(mediaHistorica);
        novaAnalise.setVariacaoPercentual(variacaoPercentual);
        novaAnalise.setTendencia(tendencia);
        novaAnalise.setSugestao(sugestao);
        novaAnalise.setDataReferencia(dataReferencia);
        novaAnalise.setDataCalculo(LocalDateTime.now());

        // 2. Salvar no banco
        return analiseDemandaRepository.save(novaAnalise);
    }

    public Optional<AnaliseDemandaModel> buscarPorId(Long id) {
        return analiseDemandaRepository.findById(id);
    }

    public List<AnaliseDemandaModel> listarTodas() {
        return analiseDemandaRepository.findAll();
    }
}