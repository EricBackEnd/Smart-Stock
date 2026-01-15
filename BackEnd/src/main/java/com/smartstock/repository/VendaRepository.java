package com.smartstock.repository;

import com.smartstock.model.VendaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDateTime;
import java.util.List;

public interface VendaRepository extends JpaRepository<VendaModel, Long> {
    List<VendaModel> findByIdUsuario(Long idUsuario);
    List<VendaModel> findByDataVendaBetween(LocalDateTime inicio, LocalDateTime fim);
}
