package edu.cibertec.curso.service;

import edu.cibertec.curso.dao.entity.MatriculaEntity;
import java.util.List;

public interface MatriculaService {

    public List<MatriculaEntity> findByCurso(int idCurso);
}
