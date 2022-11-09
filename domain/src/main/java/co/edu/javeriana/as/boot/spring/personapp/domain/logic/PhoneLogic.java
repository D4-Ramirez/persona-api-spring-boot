package co.edu.javeriana.as.boot.spring.personapp.domain.logic;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Person;
import co.edu.javeriana.as.boot.spring.personapp.domain.model.Phone;
import co.edu.javeriana.as.boot.spring.personapp.domain.model.Profession;
import co.edu.javeriana.as.boot.spring.personapp.domain.model.Study;

import java.util.List;

public interface PhoneLogic {
    public List<Phone> findAll();
    public Phone findByNumber(String number);
    public boolean create(Phone phone);
    public boolean delete(String number);
    public Phone update(String number, Phone phone);
    public Integer count();
}
