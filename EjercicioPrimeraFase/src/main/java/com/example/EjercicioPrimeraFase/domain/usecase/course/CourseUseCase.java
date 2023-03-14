package com.example.EjercicioPrimeraFase.domain.usecase.course;

import com.example.EjercicioPrimeraFase.domain.model.course.dto.CourseDTO;
import com.example.EjercicioPrimeraFase.domain.model.gateway.ICourseRepository;

public class CourseUseCase {

    private final ICourseRepository repository;

    public CourseUseCase(ICourseRepository repository) {
        this.repository = repository;
    }

    public CourseDTO saveCourse(CourseDTO courseDTO) {
        return courseDTO.fromDomain(
                repository.saveCourse(
                courseDTO.toDomain(courseDTO)));
    }
}
