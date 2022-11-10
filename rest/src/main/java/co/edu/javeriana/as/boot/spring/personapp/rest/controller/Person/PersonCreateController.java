/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.rest.controller.Person;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Person;
import co.edu.javeriana.as.boot.spring.personapp.rest.adapter.PersonaAppAdapter;
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
    private PersonaAppAdapter adapter;

    @Autowired
    private PersonRestMapper mapper;

    @Operation(summary = "Create new person", description = "Add a new person to the system", tags = {"Person"})
    @PostMapping(value = "/create")
    @CrossOrigin("*")
    public ResponseEntity execute(@RequestBody PersonPostRequest request) {
        Person person = mapper.toPersonFromPersonPostRequest(request);
        adapter.create(person, 1);
        return ResponseEntity.status(HttpStatus.CREATED).body(null);
    }
}
