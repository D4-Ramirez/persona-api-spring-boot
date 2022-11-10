package co.edu.javeriana.as.boot.spring.personapp.maria.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
@Data
@Entity
@Table(name = "telefono")
@NamedQueries({
        @NamedQuery(name = "Telefono.findAll", query = "SELECT t FROM TelefonoEntity t"),
        @NamedQuery(name = "Telefono.findByNum", query = "SELECT t FROM TelefonoEntity t WHERE t.num = :num"),
        @NamedQuery(name = "Telefono.findByOper", query = "SELECT t FROM TelefonoEntity t WHERE t.oper = :oper")})
public class TelefonoEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "num")
    private String num;
    @Basic(optional = false)
    @Column(name = "oper")
    private String oper;
    @JoinColumn(name = "duenio", referencedColumnName = "cc")
    @ManyToOne(optional = false)
    private PersonaEntity duenio;
}
