package co.edu.javeriana.as.boot.spring.personapp.domain.model;

import lombok.Data;

import java.util.List;

@Data
public class Profesion {
    private Integer id;
    private String nom;
    private String des;
    private List<Estudios> estudios;
    private List<Telefono> telefonos;
}
