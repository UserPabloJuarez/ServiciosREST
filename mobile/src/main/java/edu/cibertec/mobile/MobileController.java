package edu.cibertec.mobile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MobileController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/mobile/curso")
    public String obtenerCursoDesdeMatricula() {
        return restTemplate.getForObject("http://MATRICULAAPP/cursos/2", String.class);
    }
}
