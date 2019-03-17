package com.kes.javax.validering.eksempel.api;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PositiveOrZero;

public class KattDto {

    @PositiveOrZero
    private Integer antallFuglerFanget;

    @NotBlank
    private String navn;

    public Integer getAntallFuglerFanget() {
        return antallFuglerFanget;
    }

    public String getNavn() {
        return navn;
    }

}
