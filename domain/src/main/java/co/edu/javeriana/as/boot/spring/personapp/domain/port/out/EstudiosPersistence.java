package co.edu.javeriana.as.boot.spring.personapp.domain.port.out;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Study;

import java.util.List;

public interface EstudiosPersistence {
    public List<Study> findAll();
    public Study findById(Integer cc);
    public void create(Study estudios);
    public void delete(Study estudios);
    public void delete(Integer id);
    public void update(Study estudios);
}
