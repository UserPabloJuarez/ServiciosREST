package edu.cibertec.curso.dao.repository;

import edu.cibertec.curso.dao.entity.AuditoriaEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "auditoria")
public interface AuditoriaRepository extends JpaRepository<AuditoriaEntity, Integer> {

    List<AuditoriaEntity> findByOperacionContains(@Param("operacion") String opera);
}
