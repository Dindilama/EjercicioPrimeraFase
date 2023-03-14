package com.example.EjercicioPrimeraFase.infraestructure.adapters.jpa.student;

import com.example.EjercicioPrimeraFase.domain.model.gateway.IStudentRepository;
import com.example.EjercicioPrimeraFase.domain.model.student.Student;
import com.example.EjercicioPrimeraFase.domain.model.student.dto.StudentDTO;
import com.example.EjercicioPrimeraFase.infraestructure.adapters.jpa.student.entity.StudentDBO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class StudentRepositoryAdapter implements IStudentRepository {

    public final IStudentAdapterRepository repository;

    @Override
    public Student saveStudent(Student student){
        StudentDBO studentDBO = new StudentDBO().fromDomain(student);
        return studentDBO.toDomain(repository.save(studentDBO));
    }

}
