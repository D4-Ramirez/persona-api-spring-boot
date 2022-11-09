package co.edu.javeriana.as.boot.spring.personapp.maria.adapter;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Estudios;
import co.edu.javeriana.as.boot.spring.personapp.domain.port.out.EstudiosPersistence;

import java.util.List;

public class EstudiosPersistanceAdapter implements EstudiosPersistence {
    @Override
    public List<Estudios> findAll() {
        return null;
    }

    @Override
    public Estudios findById(Integer cc) {
        return null;
    }

    @Override
    public void create(Estudios estudios) {

    }

    @Override
    public void delete(Estudios estudios) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public void update(Estudios estudios) {

    }
}
