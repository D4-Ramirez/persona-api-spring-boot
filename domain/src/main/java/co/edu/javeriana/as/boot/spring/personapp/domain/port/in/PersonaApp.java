/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.domain.port.in;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Persona;

import java.util.List;

/**
 *
 * @author aasanchez
 */
public interface PersonaApp {
    public List<Persona> findAll();
    public Persona findById(Integer cc);
    public void create(Persona persona);
    public void delete(Persona persona);
    public void delete(Integer cc);
    public void update(Persona persona);
}
