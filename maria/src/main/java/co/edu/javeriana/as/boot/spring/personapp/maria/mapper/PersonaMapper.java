/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.maria.mapper;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Person;
import co.edu.javeriana.as.boot.spring.personapp.domain.model.Phone;
import co.edu.javeriana.as.boot.spring.personapp.domain.model.Profession;
import co.edu.javeriana.as.boot.spring.personapp.domain.model.Study;
import co.edu.javeriana.as.boot.spring.personapp.maria.entity.EstudiosEntity;
import co.edu.javeriana.as.boot.spring.personapp.maria.entity.PersonaEntity;
import co.edu.javeriana.as.boot.spring.personapp.maria.entity.ProfesionEntity;
import co.edu.javeriana.as.boot.spring.personapp.maria.entity.TelefonoEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aasanchez
 */
@Component
public class PersonaMapper {

    public List<Person> toListPersonFromListPersonaEntity(List<PersonaEntity> all) {
        return null;
    }

    public Person toPersonFromPersonaEntity(PersonaEntity personaEntity) {
        Person person= new Person();
        person.setId(personaEntity.getCc());
        person.setName(personaEntity.getNombre());
        person.setLastName(personaEntity.getApellido());
        person.setAge(personaEntity.getEdad());
        List<TelefonoEntity> phones = personaEntity.getTelefonoList();
        for (TelefonoEntity telefonoEntity : phones) {
            Phone phone = new Phone();
            phone.setNumber(telefonoEntity.getNum());
            phone.setProvider(telefonoEntity.getOper());
            phone.setOwner(person);
            person.getPhones().add(phone);
        }
        List<EstudiosEntity> studies = personaEntity.getEstudiosList();
        for (EstudiosEntity estudiosEntity : studies) {
            Study study = new Study();
            study.setPerson(person);
            study.setUniversity(estudiosEntity.getUniver());
            study.setDate(estudiosEntity.getFecha());
            ProfesionEntity profesionEntity = estudiosEntity.getProfesion();
            Profession profession = new Profession();
            profession.setName(profesionEntity.getNom());
            profession.setId(profesionEntity.getId());
            profession.setDescription(profesionEntity.getDes());
            study.setProfession(profession);
        }
        return person;
    }
}
