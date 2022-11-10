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
    public List<Person> findAll(Integer flag);
    public Person findById(Integer id, Integer flag);
    public boolean create(Person person, Integer flag);
    public boolean delete(Integer id, Integer flag);
    public Person update(Integer id, Person person, Integer flag);
    public Integer count(Integer flag);
}
