package br.com.dojo.tdd.usecases;

import br.com.dojo.tdd.models.unums.ProofStatus;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProccessProofStatus {

    public ProofStatus execute(final Double grade) {

        return ProofStatus.APPROVED;
    }
}
