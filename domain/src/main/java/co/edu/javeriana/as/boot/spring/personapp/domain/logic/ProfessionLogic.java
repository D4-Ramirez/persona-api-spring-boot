package co.edu.javeriana.as.boot.spring.personapp.domain.logic;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Profession;

import java.util.List;

public interface ProfessionLogic {
    public List<Profession> findAll();
    public Profession findById(Integer id);
    public boolean create(Profession profession);
    public boolean delete(Integer id);
    public Profession update(Integer id, Profession profession);
    public Integer count();
}
