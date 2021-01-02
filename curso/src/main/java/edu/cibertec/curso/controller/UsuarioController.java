package edu.cibertec.curso.controller;

import edu.cibertec.curso.dao.entity.UsuarioEntity;
import edu.cibertec.curso.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/usuarios/{id}")
    public UsuarioEntity obtenerUno(@PathVariable(value = "id") String codigo) {
        try {
            UsuarioEntity rpta = usuarioService.obtenerUno(codigo);
            rpta.add(linkTo(methodOn(UsuarioController.class).obtenerUno(rpta.getUsuario())).
                    withSelfRel());
            return rpta;
        } catch (java.util.NoSuchElementException er) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuario no localizado", er);
        }
    }
}
