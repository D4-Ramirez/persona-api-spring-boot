package co.edu.javeriana.as.boot.spring.personapp.maria.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "estudios")
@NamedQueries({
        @NamedQuery(name = "Estudios.findAll", query = "SELECT e FROM EstudiosEntity e"),
        @NamedQuery(name = "Estudios.findByIdProf", query = "SELECT e FROM EstudiosEntity e WHERE e.estudiosPK.idProf = :idProf"),
        @NamedQuery(name = "Estudios.findByCcPer", query = "SELECT e FROM EstudiosEntity e WHERE e.estudiosPK.ccPer = :ccPer"),
        @NamedQuery(name = "Estudios.findByFecha", query = "SELECT e FROM EstudiosEntity e WHERE e.fecha = :fecha"),
        @NamedQuery(name = "Estudios.findByUniver", query = "SELECT e FROM EstudiosEntity e WHERE e.univer = :univer")})
public class EstudiosEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EstudiosPK estudiosPK;
    @Column(name = "fecha", columnDefinition = "DATE")
    private LocalDate fecha;
    @Column(name = "univer")
    private String univer;
    @JoinColumn(name = "cc_per", referencedColumnName = "cc", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private PersonaEntity persona;
    @JoinColumn(name = "id_prof", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProfesionEntity profesion;

}
