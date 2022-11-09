package co.edu.javeriana.as.boot.spring.personapp.domain.port.out;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Profession;

import java.util.List;

public interface ProfessionPersistence {
    public List<Profession> findAll();
    public Profession findById(Integer id);
    public void create(Profession profesion);
    public void delete(Profession profesion);
    public void delete(Integer id);
    public void update(Profession profesion);
}
