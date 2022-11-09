package co.edu.javeriana.as.boot.spring.personapp.domain.model;

import lombok.Data;

import java.util.Date;

@Data
public class Estudios {
    private Integer id_prof;
    private Integer cc_per;
    private Date fecha;
    private String univer;
}
