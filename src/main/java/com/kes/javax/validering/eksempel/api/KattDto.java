package com.kes.javax.validering.eksempel.api;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

public class KattDto {

    @PositiveOrZero
    @NotNull
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
