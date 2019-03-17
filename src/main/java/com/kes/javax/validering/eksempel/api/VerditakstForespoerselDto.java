package com.kes.javax.validering.eksempel.api;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import java.util.List;

public class VerditakstForespoerselDto {
    @NotBlank
    @Email
    private String adresse;

    @PositiveOrZero
    @NotNull
    private Integer antallBoblebad;

    @Positive
    @NotNull
    private Integer antallSoverom;

    @Valid
    @NotNull
    private List<KattDto> katter;

    @Positive
    @NotNull
    private Integer totaltAntallRom;

    public String getAdresse() {
        return adresse;
    }

    public Integer getAntallBoblebad() {
        return antallBoblebad;
    }

    public Integer getAntallSoverom() {
        return antallSoverom;
    }

    public List<KattDto> getKatter() {
        return katter;
    }

    public Integer getTotaltAntallRom() {
        return totaltAntallRom;
    }
}
