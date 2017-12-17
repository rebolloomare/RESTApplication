/**
 * CrudRestController.java Fecha de creación: 13/12/2017, 21:04:43 Copyright (c) 2017 Omar
 * Rebollo Todos los derechos reservados. Este software es información confidencial, propiedad
 * de Omar Rebollo. Esta información confidencial no deberá ser divulgada y solo se podrá
 * utilizar de acuerdo a los términos que determine la propia persona.
 */
package omare.com.mx.springboot.sample.rest.samplerestapplication.restcontroller;

import java.net.URI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import omare.com.mx.springboot.sample.rest.samplerestapplication.model.Usuarios;
import omare.com.mx.springboot.sample.rest.samplerestapplication.services.CrudService;

/**
 * TODO [Agregar documentacion de la clase]
 * @author Omar Rebollo (omar.rebollo@gmail.com)
 * @version 1.0
 * @since
 */
@RestController
public class CrudRestController {

	@Autowired
	private CrudService crudService;

	@GetMapping("/gestionUsuarios/usuarios/{idUsuario}")
	public Usuarios retrieveUsuario(@PathVariable String idUsuario) {
		return crudService.retrieveUsuario(Long.parseLong(idUsuario));
	}

	@GetMapping("/gestionUsuarios/usuarios")
	public List<Usuarios> retrieveAllUsuarios() {
		return crudService.retrieveAllUsuarios();
	}

	@PostMapping("/gestionUsuarios/usuarios")
	public ResponseEntity<Usuarios> addUsuarios(@RequestBody Usuarios newUsuario) {
		Usuarios usuario = crudService.saveUsuario(newUsuario);
		if (usuario == null) {
			return ResponseEntity.noContent().build();
		}
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
			.path("/gestionUsuarios")
			.buildAndExpand(usuario.getIdUsuario())
			.toUri();

		return ResponseEntity.created(location).build();
	}

	@GetMapping("/welcomeMessage")
	public String getMessageFromProperties() {
		return crudService.retrieveMessage();
	}

}
