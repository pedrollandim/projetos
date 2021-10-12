package br.com.pedrolino.historicoNotas;

public class ResultadoDaContagem {

	private int id;
	private String autorizador;
	private int statusVerde;
	private int statusAmarelo;
	private int statusVermelho;
	
	
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAutorizador() {
		return autorizador;
	}
	public void setAutorizador(String autorizador) {
		this.autorizador = autorizador;
	}
	public int getStatusVerde() {
		return statusVerde;
	}
	public void setStatusVerde(int statusVerde) {
		this.statusVerde = statusVerde;
	}
	public int getStatusAmarelo() {
		return statusAmarelo;
	}
	public void setStatusAmarelo(int statusAmarelo) {
		this.statusAmarelo = statusAmarelo;
	}
	public int getStatusVermelho() {
		return statusVermelho;
	}
	public void setStatusVermelho(int statusVermelho) {
		this.statusVermelho = statusVermelho;
	}
	
	
	
}
