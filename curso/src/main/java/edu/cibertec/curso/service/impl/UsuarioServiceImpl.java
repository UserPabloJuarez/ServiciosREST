package edu.cibertec.curso.service.impl;

import edu.cibertec.curso.dao.entity.UsuarioEntity;
import edu.cibertec.curso.dao.repository.UsuarioRepository;
import edu.cibertec.curso.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UsuarioEntity obtenerUno(String codigo) {
        return usuarioRepository.findById(codigo).get();
    }
}
