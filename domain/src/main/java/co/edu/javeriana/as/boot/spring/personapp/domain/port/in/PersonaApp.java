/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.domain.port.in;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Person;

import java.util.List;

/**
 *
 * @author aasanchez
 */
public interface PersonaApp {
    public List<Person> findAll();
    public Person findById(Integer cc);
    public void create(Person persona);
    public void delete(Person persona);
    public void delete(Integer cc);
    public void update(Person persona);
}
