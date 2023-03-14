package com.example.EjercicioPrimeraFase.infraestructure.adapters.jpa.student;

import com.example.EjercicioPrimeraFase.infraestructure.adapters.jpa.student.entity.StudentDBO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface IStudentAdapterRepository extends JpaRepository<StudentDBO, Long> {

}
