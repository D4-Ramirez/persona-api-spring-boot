package co.edu.javeriana.as.boot.spring.personapp.domain.logic;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Person;
import co.edu.javeriana.as.boot.spring.personapp.domain.model.Phone;
import co.edu.javeriana.as.boot.spring.personapp.domain.model.Profession;
import co.edu.javeriana.as.boot.spring.personapp.domain.model.Study;

import java.util.List;

public interface PhoneLogic {
    public List<Phone> findAll();
    public Phone findByPerson(Person person);
    public void create(Phone phone);
    public void delete(String number);
    public void update(Phone phone);
    public int count();
}
