package br.com.fiap.ps13si.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.ps13si.model.FormularioEntity;

@Repository
public interface FormularioRepository extends JpaRepository<FormularioEntity, Long> {

}
