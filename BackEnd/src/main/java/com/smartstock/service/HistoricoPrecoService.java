package com.smartstock.service;

import com.smartstock.model.HistoricoPrecoModel;
import com.smartstock.repository.HistoricoPrecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class HistoricoPrecoService {

    @Autowired
    private HistoricoPrecoRepository historicoPrecoRepository;

    public HistoricoPrecoModel criarHistorico(Long idProduto, Double precoAnterior, Double precoNovo) {
        // 1. Criar novo histórico de preço
        HistoricoPrecoModel novoHistorico = new HistoricoPrecoModel();
        novoHistorico.setIdProduto(idProduto);
        novoHistorico.setPrecoAnterior(precoAnterior);
        novoHistorico.setPrecoNovo(precoNovo);
        novoHistorico.setDataAlteracao(LocalDateTime.now());

        // 2. Salvar no banco
        return historicoPrecoRepository.save(novoHistorico);
    }

    public Optional<HistoricoPrecoModel> buscarPorId(Long id) {
        return historicoPrecoRepository.findById(id);
    }

    public List<HistoricoPrecoModel> listarTodos() {
        return historicoPrecoRepository.findAll();
    }
}