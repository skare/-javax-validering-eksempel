package com.kes.javax.validering.eksempel;

import com.kes.javax.validering.eksempel.api.VerditakstForespoerselDto;
import com.kes.javax.validering.eksempel.api.VerditakstResponsDto;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import static com.kes.javax.validering.eksempel.VerditakstService.behandleForespoersel;
import static com.kes.javax.validering.eksempel.VerditakstService.validerForespoersel;

@RestController
@Validated
public class VerditakstController {

    @PostMapping("/verditakst")
    @Valid VerditakstResponsDto beregnVerditakst(@Valid @RequestBody VerditakstForespoerselDto verditakstForespoerselDto) {
        validerForespoersel(verditakstForespoerselDto);
        return behandleForespoersel(verditakstForespoerselDto);
    }
}
