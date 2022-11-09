package co.edu.javeriana.as.boot.spring.personapp.maria.adapter;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Telefono;
import co.edu.javeriana.as.boot.spring.personapp.domain.port.out.TelefonoPersistence;

import java.util.List;

public class TelefonoPersistranceAdapter implements TelefonoPersistence {
    @Override
    public List<Telefono> findAll() {
        return null;
    }

    @Override
    public Telefono findById(Integer num) {
        return null;
    }

    @Override
    public void create(Telefono telefono) {

    }

    @Override
    public void delete(Telefono telefono) {

    }

    @Override
    public void delete(Integer num) {

    }

    @Override
    public void update(Telefono telefono) {

    }
}
