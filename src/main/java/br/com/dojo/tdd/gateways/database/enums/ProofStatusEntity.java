package br.com.dojo.tdd.gateways.database.enums;

import br.com.dojo.tdd.models.unums.ProofStatus;

public enum ProofStatusEntity {
    DISAPPROVED,
    FINAL_TEST,
    APPROVED,
    PERFECT;

    public static ProofStatusEntity from(final ProofStatus status) {
        return ProofStatusEntity.valueOf(status.name());
    }
}
