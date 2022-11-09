/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.domain.logic;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Person;

import java.util.List;

/**
 *
 * @author aasanchez
 */
public interface PersonLogic {
    public List<Person> findAll();
    public Person findById(Integer id);
    public boolean create(Person person);
    public boolean delete(Integer id);
    public Person update(Integer id, Person person);
    public Integer count();
}
