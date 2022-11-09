package co.edu.javeriana.as.boot.spring.personapp.domain.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Study {
    private Profession profession;
    private Person person;
    private LocalDate date;
    private String university;
}
