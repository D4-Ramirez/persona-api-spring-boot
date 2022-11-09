package co.edu.javeriana.as.boot.spring.personapp.domain.logic;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Person;
import co.edu.javeriana.as.boot.spring.personapp.domain.model.Profession;
import co.edu.javeriana.as.boot.spring.personapp.domain.model.Study;

import java.util.List;

public interface StudyLogic {
    public List<Study> findAll();
    public Study findByPerson(Person person);
    public Study findByProfession(Profession profession);
    public void create(Study study);
    public void delete(Study study);
    public void deleteById(Person person);
    public void update(Study study);
}
