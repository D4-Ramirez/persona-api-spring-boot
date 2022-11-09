package co.edu.javeriana.as.boot.spring.personapp.maria.adapter;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Profession;
import co.edu.javeriana.as.boot.spring.personapp.domain.port.out.ProfesionPersitence;

import java.util.List;

public class ProfesionPersistenceAdapter implements ProfesionPersitence {
    @Override
    public List<Profession> findAll() {
        return null;
    }

    @Override
    public Profession findById(Integer id) {
        return null;
    }

    @Override
    public void create(Profession profesion) {

    }

    @Override
    public void delete(Profession profesion) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public void update(Profession profesion) {

    }
}
