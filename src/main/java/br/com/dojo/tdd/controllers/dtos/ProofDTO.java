package br.com.dojo.tdd.controllers.dtos;

import br.com.dojo.tdd.controllers.dtos.enums.ProofStatusDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProofDTO {
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Long id;
    private Double grade;
    private String studentName;
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private ProofStatusDTO status;
}
