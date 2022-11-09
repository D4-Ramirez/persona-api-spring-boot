package co.edu.javeriana.as.boot.spring.personapp.maria.adapter;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Profesion;
import co.edu.javeriana.as.boot.spring.personapp.domain.port.out.ProfesionPersitence;

import java.util.List;

public class ProfesionPersistenceAdapter implements ProfesionPersitence {
    @Override
    public List<Profesion> findAll() {
        return null;
    }

    @Override
    public Profesion findById(Integer id) {
        return null;
    }

    @Override
    public void create(Profesion profesion) {

    }

    @Override
    public void delete(Profesion profesion) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public void update(Profesion profesion) {

    }
}
