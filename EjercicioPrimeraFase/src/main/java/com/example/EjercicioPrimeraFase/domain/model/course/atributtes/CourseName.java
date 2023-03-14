package com.example.EjercicioPrimeraFase.domain.model.course.atributtes;

public class CourseName {
    private final String value;

    public CourseName(String value) {
        if(value == null) {
            throw new IllegalArgumentException("Valor no puede ser nulo");
        }else{
            this.value = value;
        }
    }

    public String getValue() {
        return value;
    }
}
