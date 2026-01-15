package com.smartstock.service;

import com.smartstock.model.AlertaModel;
import com.smartstock.repository.AlertaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class AlertaService {

    @Autowired
    private AlertaRepository alertaRepository;

    public AlertaModel criarAlerta(Long idUsuario, Long idProduto, String tipo, 
                                  String mensagem, String severidade) {
        // 1. Criar novo alerta
        AlertaModel novoAlerta = new AlertaModel();
        novoAlerta.setIdUsuario(idUsuario);
        novoAlerta.setIdProduto(idProduto);
        novoAlerta.setTipo(tipo);
        novoAlerta.setMensagem(mensagem);
        novoAlerta.setSeveridade(severidade);
        novoAlerta.setLido(false);
        novoAlerta.setDataCriacao(LocalDateTime.now());

        // 2. Salvar no banco
        return alertaRepository.save(novoAlerta);
    }

    public Optional<AlertaModel> buscarPorId(Long id) {
        return alertaRepository.findById(id);
    }

    public List<AlertaModel> listarTodos() {
        return alertaRepository.findAll();
    }
}