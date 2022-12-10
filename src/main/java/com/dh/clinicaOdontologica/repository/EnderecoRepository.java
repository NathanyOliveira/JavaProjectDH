package com.dh.clinicaOdontologica.repository;

import com.dh.clinicaOdontologica.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco,Long> {
//    Optional<Endereco> findById(Long aLong);

}

