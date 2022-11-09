package co.edu.javeriana.as.boot.spring.personapp.domain.logic.impl;

import co.edu.javeriana.as.boot.spring.personapp.domain.logic.PhoneLogic;
import co.edu.javeriana.as.boot.spring.personapp.domain.model.Phone;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneLogicImpl implements PhoneLogic {
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
