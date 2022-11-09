/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.maria.adapter;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Persona;
import co.edu.javeriana.as.boot.spring.personapp.domain.port.out.PersonaPersistence;
import java.util.List;

/**
 *
 * @author aasanchez
 */
public class PersonaPersistenceAdapter implements PersonaPersistence{

    @Override
    public List<Persona> findAll() {
        return null;
    }
    
}
