/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.domain.logic.impl;

import co.edu.javeriana.as.boot.spring.personapp.domain.logic.PersonLogic;
import co.edu.javeriana.as.boot.spring.personapp.domain.model.Person;
import co.edu.javeriana.as.boot.spring.personapp.domain.port.out.maria.PersonPersistenceMaria;
import co.edu.javeriana.as.boot.spring.personapp.domain.port.out.mongo.PersonPersistenceMongo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aasanchez
 */
@Service
public class PersonLogicImpl implements PersonLogic {

    @Autowired
    private PersonPersistenceMaria personPersistenceMaria;
    @Autowired
    private PersonPersistenceMongo personPersistenceMongo;
    @Override
    public List<Person> findAll(Integer flag) {
        switch (flag){
            case 1:
                return personPersistenceMaria.findAll();
            case 2:
                return personPersistenceMongo.findAll();
            default:
                List<Person> personList = personPersistenceMaria.findAll();
                personList.addAll(personPersistenceMongo.findAll());
                return personList;
        }
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
