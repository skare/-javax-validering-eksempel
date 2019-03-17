package com.kes.javax.validering.eksempel.api;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import java.time.LocalDate;

public class VerditakstResponsDto {

    @NotNull
    @Positive
    private Integer kostnad;

    @NotNull
    @FutureOrPresent
    private LocalDate takstgyldighet;

    @NotNull
    @PositiveOrZero
    private Integer verdi;

    public VerditakstResponsDto(Integer kostnad, LocalDate takstgyldighet, Integer verdi) {
        this.kostnad = kostnad;
        this.takstgyldighet = takstgyldighet;
        this.verdi = verdi;
    }

    public Integer getKostnad() {
        return kostnad;
    }

    public LocalDate getTakstgyldighet() {
        return takstgyldighet;
    }

    public Integer getVerdi() {
        return verdi;
    }
}
