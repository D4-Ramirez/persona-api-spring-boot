package co.edu.javeriana.as.boot.spring.personapp.domain.logic;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Person;
import co.edu.javeriana.as.boot.spring.personapp.domain.model.Study;

import java.util.List;

public interface EstudiosLogic {
    public List<Study> findAll();
    public Study findByPerson(Person person);
    public void create(Study study);
    public void delete(Study study);
    public void deleteById(Person);
    public void update(Study study);
}
