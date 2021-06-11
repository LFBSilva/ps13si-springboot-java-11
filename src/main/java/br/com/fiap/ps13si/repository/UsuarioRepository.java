package br.com.fiap.ps13si.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.ps13si.model.UsuarioEntity;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long>{

}
