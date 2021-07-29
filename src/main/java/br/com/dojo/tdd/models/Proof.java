package br.com.dojo.tdd.models;

import br.com.dojo.tdd.models.unums.ProofStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Proof {
    private Long id;
    private Double grade;
    private String studentName;
    private ProofStatus status;
}
