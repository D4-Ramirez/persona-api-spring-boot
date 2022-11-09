package co.edu.javeriana.as.boot.spring.personapp.domain.port.out;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Estudios;

import java.util.List;

public interface EstudiosPersistence {
    public List<Estudios> findAll();
    public Estudios findById(Integer cc);
    public void create(Estudios estudios);
    public void delete(Estudios estudios);
    public void delete(Integer id);
    public void update(Estudios estudios);
}
