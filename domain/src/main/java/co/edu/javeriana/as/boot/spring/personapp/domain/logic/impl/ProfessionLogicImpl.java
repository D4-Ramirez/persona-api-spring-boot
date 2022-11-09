package co.edu.javeriana.as.boot.spring.personapp.domain.logic.impl;

import co.edu.javeriana.as.boot.spring.personapp.domain.logic.ProfessionLogic;
import co.edu.javeriana.as.boot.spring.personapp.domain.model.Profession;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessionLogicImpl implements ProfessionLogic {

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
