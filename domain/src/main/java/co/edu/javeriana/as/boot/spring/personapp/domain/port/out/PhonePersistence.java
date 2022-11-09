package co.edu.javeriana.as.boot.spring.personapp.domain.port.out;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Phone;

import java.util.List;

public interface PhonePersistence {
    public List<Phone> findAll();
    public Phone findById(Integer num);
    public void create(Phone telefono);
    public void delete(Phone telefono);
    public void delete(Integer num);
    public void update(Phone telefono);
}
