package co.edu.javeriana.as.boot.spring.personapp.maria.adapter;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Phone;
import co.edu.javeriana.as.boot.spring.personapp.domain.port.out.TelefonoPersistence;

import java.util.List;

public class TelefonoPersistranceAdapter implements TelefonoPersistence {
    @Override
    public List<Phone> findAll() {
        return null;
    }

    @Override
    public Phone findById(Integer num) {
        return null;
    }

    @Override
    public void create(Phone telefono) {

    }

    @Override
    public void delete(Phone telefono) {

    }

    @Override
    public void delete(Integer num) {

    }

    @Override
    public void update(Phone telefono) {

    }
}
