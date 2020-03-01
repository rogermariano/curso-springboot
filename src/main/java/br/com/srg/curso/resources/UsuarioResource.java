package br.com.srg.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.srg.curso.entidades.Usuario;

@RestController
@RequestMapping(value="/usuarios")
public class UsuarioResource {
	
	@GetMapping
	public ResponseEntity<Usuario> findAll(){
		Usuario u = new Usuario(1L, "Silvia Helena D. de Souza", "SHD@gmail.com", "11-111111", "1234");
		return ResponseEntity.ok().body(u);
		
	}

}
