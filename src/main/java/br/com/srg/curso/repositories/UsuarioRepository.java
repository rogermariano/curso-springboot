package br.com.srg.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.srg.curso.entidades.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
