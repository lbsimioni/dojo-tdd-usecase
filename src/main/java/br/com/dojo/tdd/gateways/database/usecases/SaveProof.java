package br.com.dojo.tdd.gateways.database.usecases;

import br.com.dojo.tdd.gateways.database.converters.ProofEntityConverter;
import br.com.dojo.tdd.gateways.database.repositories.ProofRepository;
import br.com.dojo.tdd.models.Proof;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SaveProof {

    @Autowired
    private final ProofRepository repository;

    public Proof execute(final Proof proof) {
        return ProofEntityConverter.toModel(
                this.repository.save(
                        ProofEntityConverter.toEntity(proof)
                )
        );
    }
}
