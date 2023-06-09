package com.example.EjercicioPrimeraFase.domain.model.course;

import com.example.EjercicioPrimeraFase.domain.model.course.atributtes.CourseId;
import com.example.EjercicioPrimeraFase.domain.model.course.atributtes.CourseName;

public class Course {
    private final CourseId id;
    private final CourseName name;

    public Course(CourseId id, CourseName name) {
        this.id = id;
        this.name = name;
    }

    public CourseId getId() {
        return id;
    }

    public CourseName getName() {
        return name;
    }
}
