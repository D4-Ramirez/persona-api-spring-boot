/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.domain.model;

import lombok.Data;

import java.awt.*;
import java.util.List;

/**
 *
 * @author aasanchez
 */
@Data
public class Persona {
    private Integer cc;
    private String nombre;
    private String apellido;
    private Genero genero;
    private Integer edad;
    private List<Estudios> estudios;
}
