package co.edu.javeriana.as.boot.spring.personapp.maria.adapter;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Phone;
import co.edu.javeriana.as.boot.spring.personapp.domain.port.out.maria.PhonePersistenceMaria;

import java.util.List;

public class TelefonoPersistranceAdapter implements PhonePersistenceMaria {

    @Override
    public List<Phone> findAll() {
        return null;
    }

    @Override
    public Phone findByNumber(String number) {
        return null;
    }

    @Override
    public boolean create(Phone phone) {
        return false;
    }

    @Override
    public boolean delete(String number) {
        return false;
    }

    @Override
    public Phone update(String number, Phone phone) {
        return null;
    }

    @Override
    public Integer count() {
        return null;
    }
}
