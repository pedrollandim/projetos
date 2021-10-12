package br.com.pedrolino.historicoNotas.controller.form;

import br.com.pedrolino.historicoNotas.Estado;

public class EstadoForm {

	private String autorizador;
	private String statusServico4;
	
	
	public String getAutorizador() {
		return autorizador;
	}
	public void setAutorizador(String autorizador) {
		this.autorizador = autorizador;
	}
	public String getStatusServico4() {
		return statusServico4;
	}
	public void setStatusServico4(String statusServico4) {
		this.statusServico4 = statusServico4;
	}
	public Estado converter() {
		return new Estado(autorizador,statusServico4);
	}
	

	
}
