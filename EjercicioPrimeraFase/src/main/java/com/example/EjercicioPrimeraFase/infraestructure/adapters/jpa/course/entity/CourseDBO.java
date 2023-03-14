package com.example.EjercicioPrimeraFase.infraestructure.adapters.jpa.course.entity;

import com.example.EjercicioPrimeraFase.domain.model.course.Course;
import com.example.EjercicioPrimeraFase.domain.model.course.atributtes.CourseId;
import com.example.EjercicioPrimeraFase.domain.model.course.atributtes.CourseName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "course")

public class CourseDBO {
    @Id
    private Long id;
    private String name;

    public CourseDBO fromDomain(Course course){
        return new CourseDBO(
                course.getId().getValue(),
                course.getName().getValue()
        );
    }

    public Course toDomain(CourseDBO courseDBO){
        return new Course(
                new CourseId(courseDBO.getId()),
                new CourseName(courseDBO.getName())
        );
    }
}
