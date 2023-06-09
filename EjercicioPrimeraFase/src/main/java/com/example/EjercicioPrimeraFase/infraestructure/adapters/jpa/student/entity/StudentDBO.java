package com.example.EjercicioPrimeraFase.infraestructure.adapters.jpa.student.entity;

import com.example.EjercicioPrimeraFase.domain.model.student.Student;
import com.example.EjercicioPrimeraFase.domain.model.student.atributtes.StudentEmail;
import com.example.EjercicioPrimeraFase.domain.model.student.atributtes.StudentId;
import com.example.EjercicioPrimeraFase.domain.model.student.atributtes.StudentName;
import com.example.EjercicioPrimeraFase.domain.model.student.atributtes.StudentPhone;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name= "student")
public class StudentDBO {
    @Id
    private Long id;
    private String name;
    private String phone;
    private String email;

    public Student toDomain(StudentDBO studentDBO){
        return new Student(
                new StudentId(studentDBO.getId()),
                new StudentName(studentDBO.getName()),
                new StudentPhone(studentDBO.getPhone()),
                new StudentEmail((studentDBO.getEmail()))
        );
    }

    public StudentDBO fromDomain(Student student){
        return new StudentDBO(
                student.getId().getValue(),
                student.getName().getValue(),
                student.getPhone().getValue(),
                student.getEmail().getValue()
        );
    }

}
