package com.smartstock.repository;

import com.smartstock.model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import java.util.List;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {

    Optional<UsuarioModel> findByEmail(String email);

    boolean existsByEmail(String email);
}
