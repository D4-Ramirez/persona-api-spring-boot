/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.rest.mapper;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Person;
import co.edu.javeriana.as.boot.spring.personapp.rest.request.PersonPostRequest;
import org.springframework.stereotype.Component;

/**
 *
 * @author aasanchez
 */
@Component
public class PersonRestMapper {
    public Person toPersonFromPersonPostRequest(PersonPostRequest request) {
        Person person = new Person();
        person.setId(request.getId());
        person.setName(request.getName());
        person.setLastName(request.getLastName());
        person.setGender(request.getGender());
        person.setPhones(request.getPhones());
        person.setStudies(request.getStudies());
        return person;
    }
}
