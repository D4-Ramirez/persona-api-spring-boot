package co.edu.javeriana.as.boot.spring.personapp.maria.adapter;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Person;
import co.edu.javeriana.as.boot.spring.personapp.domain.model.Profession;
import co.edu.javeriana.as.boot.spring.personapp.domain.model.Study;
import co.edu.javeriana.as.boot.spring.personapp.domain.port.out.maria.StudyPersistenceMaria;

import java.util.List;

public class EstudiosPersistanceAdapter implements StudyPersistenceMaria {

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
    public Study findById(Profession profession, Person person) {
        return null;
    }

    @Override
    public boolean create(Study study) {
        return false;
    }

    @Override
    public boolean delete(Profession profession, Person person) {
        return false;
    }

    @Override
    public boolean deleteByPerson(Person person) {
        return false;
    }

    @Override
    public boolean deleteByProfession(Profession profession) {
        return false;
    }

    @Override
    public Study update(Profession profession, Person person, Study study) {
        return null;
    }

    @Override
    public Integer count() {
        return null;
    }
}
