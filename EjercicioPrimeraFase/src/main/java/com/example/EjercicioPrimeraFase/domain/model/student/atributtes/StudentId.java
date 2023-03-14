package com.example.EjercicioPrimeraFase.domain.model.student.atributtes;

public class StudentId {
    private final Long value;

    public StudentId(Long value) {
        if (value == null) {
            throw new IllegalArgumentException("Valor no puede ser nulo");
        } else {
            this.value = value;
        }
    }

    public Long getValue() {
        return value;
    }
}
