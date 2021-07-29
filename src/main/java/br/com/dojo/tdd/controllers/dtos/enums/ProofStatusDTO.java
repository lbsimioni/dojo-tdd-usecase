package br.com.dojo.tdd.controllers.dtos.enums;

import br.com.dojo.tdd.models.unums.ProofStatus;

public enum ProofStatusDTO {
    DISAPPROVED,
    FINAL_TEST,
    APPROVED,
    PERFECT;

    public static ProofStatusDTO from(final ProofStatus status) {
        return ProofStatusDTO.valueOf(status.name());
    }
}
