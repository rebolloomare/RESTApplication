/**
 * Usuarios.java Fecha de creación: 13/12/2017, 21:25:06 Copyright (c) 2017 Omar Rebollo Todos
 * los derechos reservados. Este software es información confidencial, propiedad de Omar
 * Rebollo. Esta información confidencial no deberá ser divulgada y solo se podrá utilizar de
 * acuerdo a los términos que determine la propia persona.
 */
package omare.com.mx.springboot.sample.rest.samplerestapplication.model;

/**
 * TODO [Agregar documentacion de la clase]
 * @author Omar Rebollo (omar.rebollo@gmail.com)
 * @version 1.0
 * @since
 */
public class Usuarios {

	private Long idUsuario;

	private int edad;

	private String name;

	private String paterno;

	private String materno;

	/**
	 * @return el atributo idUsuario
	 */
	public Long getIdUsuario() {
		return idUsuario;
	}

	/**
	 * @param idUsuario parametro idUsuario a actualizar
	 */
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	/**
	 * @return el atributo edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad parametro edad a actualizar
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return el atributo name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name parametro name a actualizar
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return el atributo paterno
	 */
	public String getPaterno() {
		return paterno;
	}

	/**
	 * @param paterno parametro paterno a actualizar
	 */
	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}

	/**
	 * @return el atributo materno
	 */
	public String getMaterno() {
		return materno;
	}

	/**
	 * @param materno parametro materno a actualizar
	 */
	public void setMaterno(String materno) {
		this.materno = materno;
	}

}
