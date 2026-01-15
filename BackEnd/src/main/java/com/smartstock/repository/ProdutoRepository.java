package com.smartstock.repository;

import com.smartstock.model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {
    List<ProdutoModel> findByIdUsuario(Long idUsuario);
    List<ProdutoModel> findByCategoria(String categoria);
    List<ProdutoModel> findByStatus(String status);
}
