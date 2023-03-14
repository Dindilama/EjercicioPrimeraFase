package com.example.EjercicioPrimeraFase.infraestructure.adapters.jpa.course;

import com.example.EjercicioPrimeraFase.domain.model.course.Course;
import com.example.EjercicioPrimeraFase.domain.model.gateway.ICourseRepository;
import com.example.EjercicioPrimeraFase.infraestructure.adapters.jpa.course.entity.CourseDBO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class CourseAdapterRepository implements ICourseRepository {

        private final ICourseAdapterRepository repository;

    @Override
    public Course saveCourse(Course course){
        CourseDBO courseDBO = new CourseDBO().fromDomain(course);
        return courseDBO.toDomain(repository.save(courseDBO));
    }
}
