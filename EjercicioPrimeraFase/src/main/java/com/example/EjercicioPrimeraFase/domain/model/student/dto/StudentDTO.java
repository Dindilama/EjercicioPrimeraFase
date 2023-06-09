package com.example.EjercicioPrimeraFase.domain.model.student.dto;

import com.example.EjercicioPrimeraFase.domain.model.student.Student;
import com.example.EjercicioPrimeraFase.domain.model.student.atributtes.StudentEmail;
import com.example.EjercicioPrimeraFase.domain.model.student.atributtes.StudentId;
import com.example.EjercicioPrimeraFase.domain.model.student.atributtes.StudentName;
import com.example.EjercicioPrimeraFase.domain.model.student.atributtes.StudentPhone;

public class StudentDTO {
    private Long id;
    private String name;
    private String phone;
    private String email;


    public StudentDTO(Long id, String name, String phone, String email) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;


    }

    public StudentDTO fromDomain(Student student) {
        return new StudentDTO(
                student.getId().getValue(),
                student.getName().getValue(),
                student.getPhone().getValue(),
                student.getEmail().getValue()
        );
    }

        public Student toDomain(StudentDTO studentDTO) {
            return new Student(
                new StudentId(studentDTO.getId()),
                    new StudentName(studentDTO.getName()),
                    new StudentPhone(studentDTO.getPhone()),
                    new StudentEmail(studentDTO.getEmail())
        );

    }
}









