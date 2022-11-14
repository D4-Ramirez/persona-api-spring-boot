package co.edu.javeriana.as.boot.spring.personapp.rest.response;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Person;

import java.util.List;

public class PersonFindAllResponse {
    private List<Person> persons;

    public PersonFindAllResponse(List<Person> persons) {
        this.persons = persons;
    }

    public List<Person> response() {
        return persons;
    }
}
