package edu.cibertec.curso.controller;

import edu.cibertec.curso.dao.entity.MatriculaEntity;
import edu.cibertec.curso.service.MatriculaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

@RestController
public class MatriculaController {

    @Autowired
    private MatriculaService matriculaService;

    @GetMapping("/matriculas/curso/{id}")
    public List<MatriculaEntity> listarAlumnosInscritos(@PathVariable(value = "id") 
            int codCurso) {
        List<MatriculaEntity> lista = matriculaService.findByCurso(codCurso);
        for (MatriculaEntity mEn : lista) {
            mEn.getUsuario().add(linkTo(methodOn(UsuarioController.class).
                    obtenerUno(mEn.getUsuario().getUsuario())).
                    withSelfRel());
        }
        return lista;
    }
}
