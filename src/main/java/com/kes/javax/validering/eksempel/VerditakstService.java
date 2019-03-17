package com.kes.javax.validering.eksempel;

import com.kes.javax.validering.eksempel.api.KattDto;
import com.kes.javax.validering.eksempel.api.VerditakstForespoerselDto;
import com.kes.javax.validering.eksempel.api.VerditakstResponsDto;
import com.kes.javax.validering.eksempel.exception.KanIkkeBareHaSoveromException;
import com.kes.javax.validering.eksempel.exception.KanIkkeHaFlereSoveromEnnRomException;

import java.time.LocalDate;

class VerditakstService {
    static VerditakstResponsDto behandleForespoersel(VerditakstForespoerselDto forespoersel) {
        Integer kostnad = 1000;
        LocalDate gyldighet = LocalDate.now().plusDays(30);
        Integer verdi = beregnVerdi(forespoersel);

        return new VerditakstResponsDto(kostnad, gyldighet, verdi);
    }

    static void validerForespoersel(VerditakstForespoerselDto forespoersel) {
        if (forespoersel.getAntallSoverom().equals(forespoersel.getTotaltAntallRom())) {
            throw new KanIkkeBareHaSoveromException();
        }

        if (forespoersel.getAntallSoverom() > forespoersel.getTotaltAntallRom()) {
            throw new KanIkkeHaFlereSoveromEnnRomException();
        }
    }

    private static Integer beregnVerdi(VerditakstForespoerselDto forespoersel) {
        Integer beregnetVerdi = 0;

        beregnetVerdi += forespoersel.getAntallSoverom() * 500;
        beregnetVerdi += forespoersel.getTotaltAntallRom() * 100;
        beregnetVerdi += forespoersel.getAntallBoblebad() * 1000;
        beregnetVerdi += forespoersel.getKatter().stream().mapToInt(VerditakstService::beregnKatteverdi).sum();


        return beregnetVerdi;
    }

    private static Integer beregnKatteverdi(KattDto katt) {
        return katt.getAntallFuglerFanget() * 50;
    }
}
