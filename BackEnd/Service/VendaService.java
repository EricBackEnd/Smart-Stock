package com.smartstock.service;

import com.smartstock.model.VendaModel;
import com.smartstock.repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class VendaService {

    @Autowired
    private VendaRepository vendaRepository;

    public VendaModel criarVenda(Long idUsuario, Double valorTotal) {
        // 1. Criar nova venda
        VendaModel novaVenda = new VendaModel();
        novaVenda.setIdUsuario(idUsuario);
        novaVenda.setDataVenda(LocalDateTime.now());
        novaVenda.setValorTotal(valorTotal);

        // 2. Salvar no banco
        return vendaRepository.save(novaVenda);
    }

    public Optional<VendaModel> buscarPorId(Long id) {
        return vendaRepository.findById(id);
    }

    public List<VendaModel> listarTodas() {
        return vendaRepository.findAll();
    }
}