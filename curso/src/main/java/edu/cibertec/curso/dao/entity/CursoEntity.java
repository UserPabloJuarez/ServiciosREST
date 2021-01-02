package edu.cibertec.curso.dao.entity;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import org.springframework.hateoas.RepresentationModel;

@Data
@Entity
@Table(name = "curso")
public class CursoEntity extends 
        RepresentationModel<CursoEntity> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idcurso;
    private String nomcurso;
    private Date fechainicio;
    private Integer alumnosmin;
    private Integer alumnosact;
    private Integer estado;
}
