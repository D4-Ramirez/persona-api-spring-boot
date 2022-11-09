package co.edu.javeriana.as.boot.spring.personapp.maria.adapter;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Study;
import co.edu.javeriana.as.boot.spring.personapp.domain.port.out.StudyPersistence;

import java.util.List;

public class EstudiosPersistanceAdapter implements StudyPersistence {
    @Override
    public List<Study> findAll() {
        return null;
    }

    @Override
    public Study findById(Integer cc) {
        return null;
    }

    @Override
    public void create(Study estudios) {

    }

    @Override
    public void delete(Study estudios) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public void update(Study estudios) {

    }
}
