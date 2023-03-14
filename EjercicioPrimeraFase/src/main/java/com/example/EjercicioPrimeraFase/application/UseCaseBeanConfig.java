package com.example.EjercicioPrimeraFase.application;

import com.example.EjercicioPrimeraFase.domain.model.gateway.ICourseRepository;
import com.example.EjercicioPrimeraFase.domain.model.gateway.IStudentRepository;
import com.example.EjercicioPrimeraFase.domain.usecase.course.CourseUseCase;
import com.example.EjercicioPrimeraFase.domain.usecase.student.StudentUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseBeanConfig {

    @Bean
    public StudentUseCase studentRepository(IStudentRepository iStudentRepository){
        return new StudentUseCase(iStudentRepository);
    }

    @Bean
    public CourseUseCase courseRepository(ICourseRepository iCourseRepository){
        return new CourseUseCase(iCourseRepository);
    }
}
