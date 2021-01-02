package edu.cibertec.curso.dao.repository;

import edu.cibertec.curso.dao.entity.CursoEntity;
import edu.cibertec.curso.dao.entity.MatriculaEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatriculaRepository extends JpaRepository<MatriculaEntity, Integer> {

    public List<MatriculaEntity> findByCurso(CursoEntity curso);
}
