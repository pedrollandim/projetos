package br.com.pedrolino.historicoNotas;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Estado {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String autorizador;
	private String statusServico4;
	
	private LocalDateTime dataEHora = LocalDateTime.now();
	private int statusVermelho;
	private int statusAmarelo;
	private int statusVerde;

	private String autorizacao4;
	private String retornoAutorizacao4;
	private String inutilizacao4;
	private String consultaProtocolo4;
	private String tempoMedio;
	private String consultaCadastro4;
	private String recepcaoEvento4;

	public Estado() {
	}
	
	

	public Estado(String autorizador, String statusServico4) {
		this.autorizador = autorizador;
		this.statusServico4 = statusServico4;
	}



	public Long getId() {
		return id;
	}



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




	public int getStatusVermelho() {
		return statusVermelho;
	}



	public void setStatusVermelho(int statusVermelho) {
		this.statusVermelho = statusVermelho;
	}



	public int getStatusAmarelo() {
		return statusAmarelo;
	}



	public void setStatusAmarelo(int statusAmarelo) {
		this.statusAmarelo = statusAmarelo;
	}



	public int getStatusVerde() {
		return statusVerde;
	}



	public void setStatusVerde(int statusVerde) {
		this.statusVerde = statusVerde;
	}



	public String getAutorizacao4() {
		return autorizacao4;
	}



	public void setAutorizacao4(String autorizacao4) {
		this.autorizacao4 = autorizacao4;
	}



	public String getRetornoAutorizacao4() {
		return retornoAutorizacao4;
	}



	public void setRetornoAutorizacao4(String retornoAutorizacao4) {
		this.retornoAutorizacao4 = retornoAutorizacao4;
	}



	public String getInutilizacao4() {
		return inutilizacao4;
	}



	public void setInutilizacao4(String inutilizacao4) {
		this.inutilizacao4 = inutilizacao4;
	}



	public String getConsultaProtocolo4() {
		return consultaProtocolo4;
	}



	public void setConsultaProtocolo4(String consultaProtocolo4) {
		this.consultaProtocolo4 = consultaProtocolo4;
	}



	public String getTempoMedio() {
		return tempoMedio;
	}



	public void setTempoMedio(String tempoMedio) {
		this.tempoMedio = tempoMedio;
	}



	public String getConsultaCadastro4() {
		return consultaCadastro4;
	}



	public void setConsultaCadastro4(String consultaCadastro4) {
		this.consultaCadastro4 = consultaCadastro4;
	}



	public String getRecepcaoEvento4() {
		return recepcaoEvento4;
	}



	public void setRecepcaoEvento4(String recepcaoEvento4) {
		this.recepcaoEvento4 = recepcaoEvento4;
	}
	
	
	
	
	
}
