package br.com.dojo.tdd.models.unums;

import br.com.dojo.tdd.gateways.database.enums.ProofStatusEntity;

public enum ProofStatus {
    DISAPPROVED,
    FINAL_TEST,
    APPROVED,
    PERFECT;

    public static ProofStatus from(final ProofStatusEntity status) {
        return ProofStatus.valueOf(status.name());
    }
}
