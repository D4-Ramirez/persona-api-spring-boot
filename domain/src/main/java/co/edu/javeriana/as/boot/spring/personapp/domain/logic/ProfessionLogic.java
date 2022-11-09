package co.edu.javeriana.as.boot.spring.personapp.domain.logic;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Profession;

import java.util.List;

public interface ProfessionLogic {
    public List<Profession> findAll();
    public void create(Profession profession);
    public void delete(Profession profession);
    public void deleteById(Profession profession);
    public void update(Profession profession);
    public Integer count();
}
