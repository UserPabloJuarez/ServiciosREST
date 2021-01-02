package edu.cibertec.curso.common;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class ErrorDTO {

    private String status;
    private String error;
    private String message;
}
