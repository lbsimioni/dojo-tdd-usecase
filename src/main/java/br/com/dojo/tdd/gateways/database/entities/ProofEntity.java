package br.com.dojo.tdd.gateways.database.entities;

import br.com.dojo.tdd.gateways.database.enums.ProofStatusEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProofEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, length = 6)
    private Double grade;

    @Column(nullable = false, length = 200)
    private String studentName;

    @Enumerated(EnumType.STRING)
    private ProofStatusEntity status;
}
