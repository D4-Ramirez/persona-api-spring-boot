package co.edu.javeriana.as.boot.spring.personapp.domain.port.in;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Profesion;

import java.util.List;

public interface ProfesionApp {
    public List<Profesion> findAll();
    public Profesion findById(Integer id);
    public void create(Profesion profesion);
    public void delete(Profesion profesion);
    public void delete(Integer id);
    public void update(Profesion profesion);
}
