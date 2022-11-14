package co.edu.javeriana.as.boot.spring.personapp.rest.controller.person;

import co.edu.javeriana.as.boot.spring.personapp.rest.adapter.PersonAppAdapter;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/person")
@Tag(name = "Person", description = "Person REST API")
public class PersonDeleteController {
    @Autowired
    private PersonAppAdapter adapter;

    @Operation(summary = "Delete a person", description = "Delete a person that's already in the system", tags = {"Person"})
    @DeleteMapping(value = "/delete/{id}")
    @CrossOrigin("*")
    public ResponseEntity<Boolean> exceute(@PathVariable(value = "id") Integer id) {
        boolean res = adapter.delete(id, 1);
        if (res) {
            return ResponseEntity.status(HttpStatus.OK).body(true);
        } else {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(false);
        }
    }
}
