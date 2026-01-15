package com.smartstock.repository;

import com.smartstock.model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {

    // Método para encontrar um usuário pelo email
    Optional<UsuarioModel> findByEmail(String email);

    // Verificar se email ja existe
    boolean existsByEmail(String email);
}