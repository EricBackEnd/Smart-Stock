package com.smartstock.repository;

import com.smartstock.model.EstoqueModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import java.util.List;

public interface EstoqueRepository extends JpaRepository<EstoqueModel, Long> {
    Optional<EstoqueModel> findByIdProduto(Long idProduto);
    List<EstoqueModel> findByQuantidadeAtualLessThanEqual(Integer quantidade);
}
