package com.example.EjercicioPrimeraFase.infraestructure.entrypoint.course;

import com.example.EjercicioPrimeraFase.domain.model.course.dto.CourseDTO;
import com.example.EjercicioPrimeraFase.domain.usecase.course.CourseUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
@AllArgsConstructor
public class CourseEntryPoint {

    private final CourseUseCase studentUserCase;

    @PostMapping
    public ResponseEntity<?> saveCourse(CourseDTO courseDTO){
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(studentUserCase.saveCourse(courseDTO));
    }
}
