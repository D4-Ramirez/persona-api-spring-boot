/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.maria.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author aasanchez
 */
@Data
@Entity
@Table(name = "persona")
@NamedQueries({
        @NamedQuery(name = "Persona.findAll", query = "SELECT p FROM PersonaEntity p"),
        @NamedQuery(name = "Persona.findByCc", query = "SELECT p FROM PersonaEntity p WHERE p.cc = :cc"),
        @NamedQuery(name = "Persona.findByNombre", query = "SELECT p FROM PersonaEntity p WHERE p.nombre = :nombre"),
        @NamedQuery(name = "Persona.findByApellido", query = "SELECT p FROM PersonaEntity p WHERE p.apellido = :apellido"),
        @NamedQuery(name = "Persona.findByGenero", query = "SELECT p FROM PersonaEntity p WHERE p.genero = :genero"),
        @NamedQuery(name = "Persona.findByEdad", query = "SELECT p FROM PersonaEntity p WHERE p.edad = :edad")})
public class PersonaEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cc")
    private Integer cc;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "apellido")
    private String apellido;
    @Basic(optional = false)
    @Column(name = "genero")
    private Character genero;
    @Column(name = "edad")
    private Integer edad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "duenio")
    private List<TelefonoEntity> telefonoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "persona")
    private List <EstudiosEntity> estudiosList;
}
