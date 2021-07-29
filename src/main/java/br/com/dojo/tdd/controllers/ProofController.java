package br.com.dojo.tdd.controllers;

import br.com.dojo.tdd.controllers.converters.ProofDTOConverter;
import br.com.dojo.tdd.controllers.dtos.ProofDTO;
import br.com.dojo.tdd.usecases.SaveProof;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proof")
@AllArgsConstructor
public class ProofController {

    @Autowired
    private final SaveProof saveProof;


    @PostMapping
    public ResponseEntity<ProofDTO> save(@RequestBody final ProofDTO proofDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(
                ProofDTOConverter.toDTO(
                        this.saveProof.execute(
                                ProofDTOConverter.toModel(proofDTO)
                        )
                )
        );
    }
}
