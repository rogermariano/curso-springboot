package br.com.srg.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.srg.curso.entidades.Usuario;
import br.com.srg.curso.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository ur;

	public List<Usuario> finAll() {
		return ur.findAll();
	}

	public Usuario findById(Long id) {
		Optional<Usuario> obj = ur.findById(id);
		return obj.get();

	}
}
