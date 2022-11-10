/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.maria.adapter;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Person;
import co.edu.javeriana.as.boot.spring.personapp.domain.port.out.maria.PersonPersistenceMaria;
import co.edu.javeriana.as.boot.spring.personapp.maria.entity.PersonaEntity;
import co.edu.javeriana.as.boot.spring.personapp.maria.mapper.PersonaMapper;
import co.edu.javeriana.as.boot.spring.personapp.maria.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

/**
 *
 * @author aasanchez
 */
@Service
public class PersonaPersistenceAdapter implements PersonPersistenceMaria {

    @Autowired
    private PersonaMapper personaMapper;

    @Autowired
    private PersonaRepository personaRepository;
    @Override
    public List<Person> findAll() {
        return personaMapper.toListPersonFromListPersonaEntity(personaRepository.findAll());
    }

    @Override
    public Person findById(Integer id) {
        try {
            return personaMapper.toPersonFromPersonaEntity(personaRepository.findById(id).get());
        } catch (NoSuchElementException e) {
            throw new RuntimeException(e);
        }

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
