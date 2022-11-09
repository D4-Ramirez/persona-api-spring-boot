package co.edu.javeriana.as.boot.spring.personapp.maria.adapter;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Profession;
import co.edu.javeriana.as.boot.spring.personapp.domain.port.out.maria.ProfessionPersistenceMaria;

import java.util.List;

public class ProfesionPersistenceAdapter implements ProfessionPersistenceMaria {

    @Override
    public List<Profession> findAll() {
        return null;
    }

    @Override
    public Profession findById(Integer id) {
        return null;
    }

    @Override
    public boolean create(Profession profession) {
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    @Override
    public Profession update(Integer id, Profession profession) {
        return null;
    }

    @Override
    public Integer count() {
        return null;
    }
}
