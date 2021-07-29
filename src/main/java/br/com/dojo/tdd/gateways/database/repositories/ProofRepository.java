package br.com.dojo.tdd.gateways.database.repositories;

import br.com.dojo.tdd.gateways.database.entities.ProofEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProofRepository extends JpaRepository<ProofEntity, Long> {
}
