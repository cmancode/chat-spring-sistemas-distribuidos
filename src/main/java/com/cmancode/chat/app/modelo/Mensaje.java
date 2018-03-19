package com.cmancode.chat.app.modelo;

public class Mensaje {
	
	private String usuario;
	private String mensaje;
	
	
	public Mensaje(String usuario, String mensaje) {
		super();
		this.usuario = usuario;
		this.mensaje = mensaje;
	}

	public Mensaje() {}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}	
	
}
	