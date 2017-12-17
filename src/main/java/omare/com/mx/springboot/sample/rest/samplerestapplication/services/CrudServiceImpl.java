/**
 * CrudServiceImpl.java Fecha de creación: 13/12/2017, 21:34:19 Copyright (c) 2017 Omar Rebollo
 * Todos los derechos reservados. Este software es información confidencial, propiedad de Omar
 * Rebollo. Esta información confidencial no deberá ser divulgada y solo se podrá utilizar de
 * acuerdo a los términos que determine la propia persona.
 */
package omare.com.mx.springboot.sample.rest.samplerestapplication.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import omare.com.mx.springboot.sample.rest.samplerestapplication.model.Usuarios;

/**
 * TODO [Agregar documentacion de la clase]
 * @author Omar Rebollo (omar.rebollo@gmail.com)
 * @version 1.0
 * @since
 */
@Service
public class CrudServiceImpl implements CrudService {

	@Value("${welcome.message}")
	private String welcomeMessage;

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see omare.com.mx.springboot.sample.rest.samplerestapplication.services.CrudService#
	 * retrieveAllUsuarios()
	 */
	@Override
	public List<Usuarios> retrieveAllUsuarios() {
		List<Usuarios> listUsuarios = new ArrayList<>();
		Usuarios usuario1 = new Usuarios();
		usuario1.setIdUsuario(1L);
		usuario1.setEdad(37);
		usuario1.setName("omar");
		usuario1.setPaterno("Rebollo");
		usuario1.setMaterno("Vazquez");
		Usuarios usuario2 = new Usuarios();
		usuario2.setIdUsuario(2L);
		usuario2.setEdad(37);
		usuario2.setName("omar");
		usuario2.setPaterno("Rebollo");
		usuario2.setMaterno("Vazquez");
		Usuarios usuario3 = new Usuarios();
		usuario3.setIdUsuario(3L);
		usuario3.setEdad(37);
		usuario3.setName("omar");
		usuario3.setPaterno("Rebollo");
		usuario3.setMaterno("Vazquez");
		Usuarios usuario4 = new Usuarios();
		usuario4.setIdUsuario(4L);
		usuario4.setEdad(37);
		usuario4.setName("omar");
		usuario4.setPaterno("Rebollo");
		usuario4.setMaterno("Vazquez");
		Usuarios usuario5 = new Usuarios();
		usuario5.setIdUsuario(5L);
		usuario5.setEdad(37);
		usuario5.setName("omar");
		usuario5.setPaterno("Rebollo");
		usuario5.setMaterno("Vazquez");
		Usuarios usuario6 = new Usuarios();
		usuario6.setIdUsuario(6L);
		usuario6.setEdad(37);
		usuario6.setName("omar");
		usuario6.setPaterno("Rebollo");
		usuario6.setMaterno("Vazquez");
		Usuarios usuario7 = new Usuarios();
		usuario7.setIdUsuario(7L);
		usuario7.setEdad(37);
		usuario7.setName("omar");
		usuario7.setPaterno("Rebollo");
		usuario7.setMaterno("Vazquez");
		Usuarios usuario8 = new Usuarios();
		usuario8.setIdUsuario(8L);
		usuario8.setEdad(37);
		usuario8.setName("omar");
		usuario8.setPaterno("Rebollo");
		usuario8.setMaterno("Vazquez");
		Usuarios usuario9 = new Usuarios();
		usuario9.setIdUsuario(9L);
		usuario9.setEdad(37);
		usuario9.setName("omar");
		usuario9.setPaterno("Rebollo");
		usuario9.setMaterno("Vazquez");
		Usuarios usuario10 = new Usuarios();
		usuario10.setIdUsuario(10L);
		usuario10.setEdad(37);
		usuario10.setName("omar");
		usuario10.setPaterno("Rebollo");
		usuario10.setMaterno("Vazquez");
		listUsuarios.add(usuario1);
		listUsuarios.add(usuario2);
		listUsuarios.add(usuario3);
		listUsuarios.add(usuario4);
		listUsuarios.add(usuario5);
		listUsuarios.add(usuario6);
		listUsuarios.add(usuario7);
		listUsuarios.add(usuario8);
		listUsuarios.add(usuario9);
		listUsuarios.add(usuario10);
		return listUsuarios;
	}

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see omare.com.mx.springboot.sample.rest.samplerestapplication.services.CrudService#
	 * retrieveUsuario(java.lang.Long)
	 */
	@Override
	public Usuarios retrieveUsuario(Long idUsuario) {
		Usuarios usuario = new Usuarios();
		usuario.setIdUsuario(1L);
		usuario.setEdad(37);
		usuario.setName("omar");
		usuario.setPaterno("Rebollo");
		usuario.setMaterno("Vazquez");
		return usuario;
	}

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see omare.com.mx.springboot.sample.rest.samplerestapplication.services.CrudService#
	 * saveUsuarios(omare.com.mx.springboot.sample.rest.samplerestapplication.model.Usuarios)
	 */
	@Override
	public Usuarios saveUsuario(Usuarios usuario) {
		return null;
	}

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see omare.com.mx.springboot.sample.rest.samplerestapplication.services.CrudService#
	 * retrieveMessage()
	 */
	@Override
	public String retrieveMessage() {
		return welcomeMessage;
	}

}
