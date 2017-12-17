/**
 * CrudService.java Fecha de creación: 13/12/2017, 21:24:14 Copyright (c) 2017 Omar Rebollo
 * Todos los derechos reservados. Este software es información confidencial, propiedad de Omar
 * Rebollo. Esta información confidencial no deberá ser divulgada y solo se podrá utilizar de
 * acuerdo a los términos que determine la propia persona.
 */
package omare.com.mx.springboot.sample.rest.samplerestapplication.services;

import java.util.List;
import omare.com.mx.springboot.sample.rest.samplerestapplication.model.Usuarios;

/**
 * TODO [Agregar documentacion de la clase]
 * @author Omar Rebollo (omar.rebollo@gmail.com)
 * @version 1.0
 * @since
 */
public interface CrudService {

	List<Usuarios> retrieveAllUsuarios();

	Usuarios retrieveUsuario(Long idUsuario);

	Usuarios saveUsuario(Usuarios usuario);

	String retrieveMessage();

}
