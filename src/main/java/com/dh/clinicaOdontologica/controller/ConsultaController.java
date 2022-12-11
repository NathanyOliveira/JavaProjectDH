package com.dh.clinicaOdontologica.controller;

import com.dh.clinicaOdontologica.entity.dto.ConsultaDTO;
import com.dh.clinicaOdontologica.service.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/consulta")
public class ConsultaController {
    @Autowired
    ConsultaService consultaService;

    @GetMapping()
    public List<ConsultaDTO> buscarTodasConsultas(){
        return consultaService.buscarTodasConsultas();
    }

    @GetMapping("/BuscarConsultaEspecifica/{consultaID}")
    public ResponseEntity buscarUnicaConsulta(@PathVariable String consultaID){
        return consultaService.buscarUnicaConsulta(consultaID);
    }

    @PostMapping()
    public ResponseEntity salvar(@RequestBody @Valid ConsultaDTO consultaDTO){
        return consultaService.salvar(consultaDTO);
    }
    
    @DeleteMapping()
    public ResponseEntity deletar (@RequestParam("consultaID") String consultaID){
        return consultaService.deletar(consultaID);
    }

}
