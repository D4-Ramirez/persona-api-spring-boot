package co.edu.javeriana.as.boot.spring.personapp.domain.port.out;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Telefono;

import java.util.List;

public interface TelefonoPersistence {
    public List<Telefono> findAll();
    public Telefono findById(Integer num);
    public void create(Telefono telefono);
    public void delete(Telefono telefono);
    public void delete(Integer num);
    public void update(Telefono telefono);
}
