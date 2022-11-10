package co.edu.javeriana.as.boot.spring.personapp.maria.repository;

import co.edu.javeriana.as.boot.spring.personapp.maria.entity.PersonaEntity;
import co.edu.javeriana.as.boot.spring.personapp.maria.entity.ProfesionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfesionRepository extends JpaRepository<ProfesionEntity, Integer> {
}
