package com.smartstock.repository;

import com.smartstock.model.ItemVendaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ItemVendaRepository extends JpaRepository<ItemVendaModel, Long> {
    List<ItemVendaModel> findByIdVenda(Long idVenda);
    List<ItemVendaModel> findByIdProduto(Long idProduto);
}
