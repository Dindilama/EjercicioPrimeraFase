package com.example.EjercicioPrimeraFase.domain.model.gateway;

import com.example.EjercicioPrimeraFase.domain.model.course.Course;

public interface ICourseRepository {

    Course saveCourse(Course course);

}
