package com.example.EjercicioPrimeraFase.domain.model.student;

import com.example.EjercicioPrimeraFase.domain.model.student.atributtes.StudentEmail;
import com.example.EjercicioPrimeraFase.domain.model.student.atributtes.StudentId;
import com.example.EjercicioPrimeraFase.domain.model.student.atributtes.StudentName;
import com.example.EjercicioPrimeraFase.domain.model.student.atributtes.StudentPhone;

public class Student {
    private final StudentId id;
    private final StudentName name;
    private final StudentPhone phone;

    private final StudentEmail email;

    public Student(StudentId id, StudentName name, StudentPhone phone, StudentEmail email) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public StudentId getId() {
        return id;
    }

    public StudentName getName() {
        return name;
    }

    public StudentPhone getPhone() {
        return phone;
    }

    public StudentEmail getEmail() {
        return email;
    }
}
