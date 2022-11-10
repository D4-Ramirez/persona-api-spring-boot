package co.edu.javeriana.as.boot.spring.personapp.maria.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "profesion")
@NamedQueries({
        @NamedQuery(name = "Profesion.findAll", query = "SELECT p FROM ProfesionEntity p"),
        @NamedQuery(name = "Profesion.findById", query = "SELECT p FROM ProfesionEntity p WHERE p.id = :id"),
        @NamedQuery(name = "Profesion.findByNom", query = "SELECT p FROM ProfesionEntity p WHERE p.nom = :nom")})
public class ProfesionEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nom")
    private String nom;
    @Lob
    @Column(name = "des")
    private String des;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "profesion")
    private List<EstudiosEntity> estudiosCollection;
}
