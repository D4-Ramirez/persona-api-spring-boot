/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.maria.adapter;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Person;
import co.edu.javeriana.as.boot.spring.personapp.domain.port.out.maria.PersonPersistenceMaria;
import java.util.List;

/**
 *
 * @author aasanchez
 */
public class PersonaPersistenceAdapter implements PersonPersistenceMaria {

    @Override
    public List<Person> findAll() {
        return null;
    }

    @Override
    public Person findById(Integer id) {
        return null;
    }

    @Override
    public boolean create(Person person) {
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    @Override
    public Person update(Integer id, Person person) {
        return null;
    }

    @Override
    public Integer count() {
        return null;
    }
}
