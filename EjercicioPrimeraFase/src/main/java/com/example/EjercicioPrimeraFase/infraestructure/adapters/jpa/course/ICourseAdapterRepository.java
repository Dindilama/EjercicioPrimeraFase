package com.example.EjercicioPrimeraFase.infraestructure.adapters.jpa.course;

import com.example.EjercicioPrimeraFase.infraestructure.adapters.jpa.course.entity.CourseDBO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourseAdapterRepository extends JpaRepository<CourseDBO, Long> {

}
