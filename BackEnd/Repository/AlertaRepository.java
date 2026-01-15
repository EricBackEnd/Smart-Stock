package com.smartstock.repository;

import com.smartstock.model.AlertaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AlertaRepository extends JpaRepository<AlertaModel, Long> {
    List<AlertaModel> findByIdUsuario(Long idUsuario);
    List<AlertaModel> findByIdUsuarioAndLido(Long idUsuario, Boolean lido);
    List<AlertaModel> findByTipo(String tipo);
}
