package co.edu.javeriana.as.boot.spring.personapp.maria.entity;

import lombok.Data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class EstudiosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "id_prof")
    private int idProf;
    @Basic(optional = false)
    @Column(name = "cc_per")
    private int ccPer;
}
