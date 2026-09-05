package pe.edu.tecsup.lab03.services;

import java.util.List;
import pe.edu.tecsup.lab03.entities.StudentEntity;
import pe.edu.tecsup.lab03.repositories.StudentRepository;

public class StudentService {

    private StudentRepository studentRepository = new StudentRepository();

    public void registrarEstudiante(StudentEntity estudiante) {
        studentRepository.guardar(estudiante);
    }

    public List<StudentEntity> listarEstudiantes() {
        return studentRepository.obtenerTodos();
    }
}