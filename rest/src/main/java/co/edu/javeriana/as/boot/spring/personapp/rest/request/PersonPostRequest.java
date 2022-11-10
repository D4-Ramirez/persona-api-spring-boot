/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.rest.request;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Gender;
import co.edu.javeriana.as.boot.spring.personapp.domain.model.Phone;
import co.edu.javeriana.as.boot.spring.personapp.domain.model.Study;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

/**
 *
 * @author aasanchez
 */
@Data
public class PersonPostRequest {
    @Schema(name = "Id", description = "Person's dni number", example = "1023238701")
    private Integer id;

    @Schema(name = "Name", description = "Person's first name", example = "John")
    private String name;

    @Schema(name = "Last name", description = "Person's last name", example = "Doe")
    private String lastName;

    @Schema(name = "Gender", description = "Person's gender", example = "M")
    private Gender gender;

    @Schema(name = "Age", description = "Person's age", example = "25")
    private Integer age;

    @Schema(name = "Studies", description = "List of studies that a person has")
    private List<Study> studies;

    @Schema(name = "Phones", description = "List of phones that a person has")
    private List<Phone> phones;
}
