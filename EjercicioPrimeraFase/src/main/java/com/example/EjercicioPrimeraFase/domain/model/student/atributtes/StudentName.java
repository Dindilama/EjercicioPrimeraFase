package com.example.EjercicioPrimeraFase.domain.model.student.atributtes;

public class StudentName {
    private final String value;

    public StudentName(String value) {
        if(value ==null) {
            throw new IllegalArgumentException("Valor no puede ser nulo");
        }else{
            this.value = value;
        }
    }

    public String getValue() {
        return value;
    }
}
