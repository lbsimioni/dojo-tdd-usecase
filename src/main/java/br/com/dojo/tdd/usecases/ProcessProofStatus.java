package br.com.dojo.tdd.usecases;

import br.com.dojo.tdd.models.unums.ProofStatus;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProcessProofStatus {

    /**
     * TODO: Implementar método execute, esse método deverá receber a nota da prova e classificar o status, seguindo a regra:
     * - Caso a nota seja a baixo de 5, terá o status reprovado
     * - Caso a nota seja entre 5 e 6, terá o status em prova final
     * - Caso a nota seja entre 6 e 9.9, terá o status aprovado
     * - Caso a nota seja 10, terá o status de perfeito
     */
    public ProofStatus execute(final Double grade) {

        return ProofStatus.APPROVED;
    }
}
