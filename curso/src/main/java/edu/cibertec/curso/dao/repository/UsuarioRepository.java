package edu.cibertec.curso.dao.repository;

import edu.cibertec.curso.dao.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, String> {
}
