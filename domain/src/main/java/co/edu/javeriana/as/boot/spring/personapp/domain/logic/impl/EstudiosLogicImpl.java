package co.edu.javeriana.as.boot.spring.personapp.domain.logic.impl;

import co.edu.javeriana.as.boot.spring.personapp.domain.logic.StudyLogic;
import co.edu.javeriana.as.boot.spring.personapp.domain.model.Person;
import co.edu.javeriana.as.boot.spring.personapp.domain.model.Profession;
import co.edu.javeriana.as.boot.spring.personapp.domain.model.Study;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudiosLogicImpl implements StudyLogic {

    @Override
    public List<Study> findAll() {
        return null;
    }

    @Override
    public Study findByPerson(Person person) {
        return null;
    }

    @Override
    public Study findByProfession(Profession profession) {
        return null;
    }

    @Override
    public void create(Study study) {

    }

    @Override
    public void delete(Study study) {

    }

    @Override
    public void deleteById(Person person) {

    }

    @Override
    public void update(Study study) {

    }
}
