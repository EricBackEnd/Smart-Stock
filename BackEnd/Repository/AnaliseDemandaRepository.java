package com.smartstock.repository;

import com.smartstock.model.AnaliseDemandaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AnaliseDemandaRepository extends JpaRepository<AnaliseDemandaModel, Long> {
    List<AnaliseDemandaModel> findByIdProduto(Long idProduto);
    List<AnaliseDemandaModel> findByPeriodo(String periodo);
    List<AnaliseDemandaModel> findByTendencia(String tendencia);
}
