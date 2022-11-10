/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.rest.adapter;

import co.edu.javeriana.as.boot.spring.personapp.domain.logic.PersonLogic;
import co.edu.javeriana.as.boot.spring.personapp.domain.model.Person;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author aasanchez
 */
@Service
public class PersonaAppAdapter implements PersonLogic {
    @Override
    public List<Person> findAll(Integer flag) {
        return null;
    }

    @Override
    public Person findById(Integer id, Integer flag) {
        return null;
    }

    @Override
    public boolean create(Person person, Integer flag) {
        return false;
    }

    @Override
    public boolean delete(Integer id, Integer flag) {
        return false;
    }

    @Override
    public Person update(Integer id, Person person, Integer flag) {
        return null;
    }

    @Override
    public Integer count(Integer flag) {
        return null;
    }
}
