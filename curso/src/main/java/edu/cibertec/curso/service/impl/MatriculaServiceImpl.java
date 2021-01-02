package edu.cibertec.curso.service.impl;

import edu.cibertec.curso.dao.entity.CursoEntity;
import edu.cibertec.curso.dao.entity.MatriculaEntity;
import edu.cibertec.curso.dao.repository.CursoRepository;
import edu.cibertec.curso.dao.repository.MatriculaRepository;
import edu.cibertec.curso.service.MatriculaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatriculaServiceImpl implements MatriculaService {

    @Autowired
    private MatriculaRepository matriculaRepository;
    @Autowired
    private CursoRepository cursoRepository;

    @Override
    public List<MatriculaEntity> findByCurso(int idCurso) {
        CursoEntity curso = cursoRepository.findById(idCurso).get();
        return matriculaRepository.findByCurso(curso);
    }
}
