package com.example.EjercicioPrimeraFase.domain.model.gateway;

import com.example.EjercicioPrimeraFase.domain.model.student.Student;

public interface IStudentRepository {

    Student saveStudent(Student student);
}
