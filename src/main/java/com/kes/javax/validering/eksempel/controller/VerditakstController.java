package com.kes.javax.validering.eksempel.controller;

import com.kes.javax.validering.eksempel.api.VerditakstForespoerselDto;
import com.kes.javax.validering.eksempel.api.VerditakstResponsDto;
import com.kes.javax.validering.eksempel.service.VerditakstService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@Validated
public class VerditakstController {

    private final VerditakstService verditakstService;

    public VerditakstController(VerditakstService verditakstService) {
        this.verditakstService = verditakstService;
    }

    @PostMapping("/verditakst")
    @Valid VerditakstResponsDto beregnVerditakst(@Valid @RequestBody VerditakstForespoerselDto forespoersel) {
        return verditakstService.behandleForespoersel(forespoersel);
    }
}
