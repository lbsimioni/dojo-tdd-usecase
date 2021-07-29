package br.com.dojo.tdd.gateways.database.converters;

import br.com.dojo.tdd.gateways.database.entities.ProofEntity;
import br.com.dojo.tdd.gateways.database.enums.ProofStatusEntity;
import br.com.dojo.tdd.models.Proof;
import br.com.dojo.tdd.models.unums.ProofStatus;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ProofEntityConverter {

    public static ProofEntity toEntity(final Proof obj) {
        return ProofEntity.builder()
                .id(obj.getId())
                .grade(obj.getGrade())
                .studentName(obj.getStudentName())
                .status(ProofStatusEntity.from(obj.getStatus()))
                .build();
    }

    public static Proof toModel(final ProofEntity obj) {
        return Proof.builder()
                .id(obj.getId())
                .grade(obj.getGrade())
                .studentName(obj.getStudentName())
                .status(ProofStatus.from(obj.getStatus()))
                .build();
    }
}
