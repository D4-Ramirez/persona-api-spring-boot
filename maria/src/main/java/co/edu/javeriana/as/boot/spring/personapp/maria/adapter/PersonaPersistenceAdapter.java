/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.maria.adapter;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Person;
import co.edu.javeriana.as.boot.spring.personapp.domain.port.out.PersonPersistence;
import java.util.List;

/**
 *
 * @author aasanchez
 */
public class PersonaPersistenceAdapter implements PersonPersistence {

    @Override
    public List<Person> findAll() {
        return null;
    }

    @Override
    public Person findById(Integer cc) {
        return null;
    }

    @Override
    public void create(Person persona) {

    }

    @Override
    public void delete(Person persona) {

    }

    @Override
    public void delete(Integer cc) {

    }

    @Override
    public void update(Person persona) {

    }

}
