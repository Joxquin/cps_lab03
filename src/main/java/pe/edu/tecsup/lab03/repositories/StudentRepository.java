package pe.edu.tecsup.lab03.repositories;

import java.util.ArrayList;
import java.util.List;
import pe.edu.tecsup.lab03.entities.StudentEntity;

public class StudentRepository {

    private List<StudentEntity> estudiantes = new ArrayList<>();

    public void guardar(StudentEntity estudiante) {
        estudiantes.add(estudiante);
    }

    public List<StudentEntity> obtenerTodos() {
        return estudiantes;
    }
}