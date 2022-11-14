/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.rest.controller.person;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Person;
import co.edu.javeriana.as.boot.spring.personapp.rest.adapter.PersonAppAdapter;
import co.edu.javeriana.as.boot.spring.personapp.rest.mapper.PersonRestMapper;
import co.edu.javeriana.as.boot.spring.personapp.rest.request.PersonPostRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author aasanchez
 */
@RestController
@RequestMapping(value = "/person")
@Tag(name="Person", description = "Person REST API")
public class PersonCreateController {
    @Autowired
    private PersonAppAdapter adapter;

    @Autowired
    private PersonRestMapper mapper;

    @Operation(summary = "Create new person", description = "Add a new person to the system", tags = {"Person"})
    @PostMapping(value = "/create")
    @CrossOrigin("*")
    public ResponseEntity<Boolean> execute(@RequestBody PersonPostRequest request) {
        Person person = mapper.toPersonFromPersonPostRequest(request);
        boolean res = adapter.create(person, 1);
        if (res) {
            return ResponseEntity.status(HttpStatus.CREATED).body(true);
        } else {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(false);
        }
    }
}
