package br.com.srg.curso.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.srg.curso.entidades.Usuario;
import br.com.srg.curso.services.UsuarioService;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResource {

	@Autowired
	private UsuarioService us;

	@GetMapping
	public ResponseEntity<List<Usuario>> findAll() {

		List<Usuario> listaUsuario = us.finAll();

		return ResponseEntity.ok().body(listaUsuario);

	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Usuario> finById(@PathVariable Long id) {
		
		Usuario usuario = us.findById(id);
		return ResponseEntity.ok().body(usuario);

	}

}
