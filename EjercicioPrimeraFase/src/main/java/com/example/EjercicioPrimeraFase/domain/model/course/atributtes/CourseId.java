package com.example.EjercicioPrimeraFase.domain.model.course.atributtes;

import com.sun.istack.NotNull;

public class CourseId {

    private final Long value;

    public CourseId(Long value){
        if(value ==null) {
            throw new IllegalArgumentException("Valor no puede ser nulo");
        }else{
            this.value = value;
        }
    }




    public Long getValue() {
        return value;
    }
}
