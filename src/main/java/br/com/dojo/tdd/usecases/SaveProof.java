package br.com.dojo.tdd.usecases;

import br.com.dojo.tdd.exceptions.InvalidGradeProofException;
import br.com.dojo.tdd.exceptions.InvalidStudentNameException;
import br.com.dojo.tdd.gateways.database.usecases.SaveProofInDataBase;
import br.com.dojo.tdd.models.Proof;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SaveProof {

    @Autowired
    private final SaveProofInDataBase saveProofInDataBase;

    @Autowired
    private final ProcessProofStatus processProofStatus;

    public Proof execute(final Proof proof) {
        proof.setStudentName(proof.getStudentName().trim());

        if (proof.getStudentName().isEmpty() || proof.getStudentName().length() == 0)
            throw new InvalidStudentNameException();

        final Double grade = proof.getGrade();

        if (grade < 0 || grade > 10)
            throw new InvalidGradeProofException();

        proof.setStatus(processProofStatus.execute(proof.getGrade()));

        return this.saveProofInDataBase.execute(proof);
    }
}
