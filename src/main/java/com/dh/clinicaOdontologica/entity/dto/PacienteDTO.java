package com.dh.clinicaOdontologica.entity.dto;

import com.dh.clinicaOdontologica.entity.Consulta;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.Id;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PacienteDTO {
//    @JsonIgnore
//    @Id
    private int id;
    private String nome;
    private String sobrenome;
    private String cpf;

    private Timestamp dataHoraRegistro;
    private LocalDate dataRegistro;
    private LocalTime horaRegistro;

    @JsonIgnore
    private List<Consulta> consultas;

    public LocalDate getDataRegistro() {
        return dataHoraRegistro.toLocalDateTime().toLocalDate();
    }

    public LocalTime getHoraRegistro(){
        return dataHoraRegistro.toLocalDateTime().toLocalTime();
    }

}
