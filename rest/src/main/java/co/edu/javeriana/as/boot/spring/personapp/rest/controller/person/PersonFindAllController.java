package co.edu.javeriana.as.boot.spring.personapp.rest.controller.person;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Person;
import co.edu.javeriana.as.boot.spring.personapp.rest.adapter.PersonAppAdapter;
import co.edu.javeriana.as.boot.spring.personapp.rest.response.PersonFindAllResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/person")
@Tag(name = "Person", description = "Person REST API")
public class PersonFindAllController {
    @Autowired
    private PersonAppAdapter adapter;

    @GetMapping(value = "/")
    @CrossOrigin("*")
    public ResponseEntity<List<Person>> exceute() {
        return ResponseEntity.status(HttpStatus.OK).body(adapter.findAll(1));
    }
}
