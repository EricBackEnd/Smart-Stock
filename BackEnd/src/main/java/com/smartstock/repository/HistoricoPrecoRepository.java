package com.smartstock.repository;

import com.smartstock.model.HistoricoPrecoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface HistoricoPrecoRepository extends JpaRepository<HistoricoPrecoModel, Long> {
    List<HistoricoPrecoModel> findByIdProduto(Long idProduto);
    List<HistoricoPrecoModel> findByIdProdutoOrderByDataAlteracaoDesc(Long idProduto);
}
