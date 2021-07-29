package br.com.dojo.tdd.controllers.converters;

import br.com.dojo.tdd.controllers.dtos.ProofDTO;
import br.com.dojo.tdd.controllers.dtos.enums.ProofStatusDTO;
import br.com.dojo.tdd.models.Proof;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ProofDTOConverter {

    public static ProofDTO toDTO(final Proof obj) {
        return ProofDTO.builder()
                .id(obj.getId())
                .grade(obj.getGrade())
                .studentName(obj.getStudentName())
                .status(ProofStatusDTO.from(obj.getStatus()))
                .build();
    }

    public static Proof toModel(final ProofDTO obj) {
        return Proof.builder()
                .grade(obj.getGrade())
                .studentName(obj.getStudentName())
                .build();
    }
}
