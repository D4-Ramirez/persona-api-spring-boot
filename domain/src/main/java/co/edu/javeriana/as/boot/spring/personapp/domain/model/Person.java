/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.domain.model;

import lombok.Data;

import java.util.List;

/**
 *
 * @author aasanchez
 */
@Data
public class Person {
    private Integer id;
    private String name;
    private String lastName;
    private Gender gender;
    private Integer age;
    private List<Study> studies;
    private List<Phone> phones;
}
