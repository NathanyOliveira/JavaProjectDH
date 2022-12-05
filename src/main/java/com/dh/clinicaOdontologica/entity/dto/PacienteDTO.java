package com.dh.clinicaOdontologica.entity.dto;

import com.dh.clinicaOdontologica.entity.Consulta;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.sql.Timestamp;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PacienteDTO {
    @JsonIgnore
    @Id
    private int id;
    private String nome;
    private String sobrenome;
    private Integer cpf;
    private Timestamp dataRegistro;
    private List<Consulta> consultas;
}