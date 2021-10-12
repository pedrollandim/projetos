package br.com.pedrolino.historicoNotas.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import org.jsoup.select.Collector;
import org.springframework.data.domain.Page;

import br.com.pedrolino.historicoNotas.Estado;

public class EstadoDto {

	private Long id;
	private String autorizador;
	private String statusServico4;

	public EstadoDto(Estado estado) {
		this.id = estado.getId();
		this.autorizador = estado.getAutorizador();
		this.statusServico4 = estado.getStatusServico4();
	}

	public Long getid() {
		return id;
	}

	public String getautorizador() {
		return autorizador;
	}

	public String getstatusServico4() {
		return statusServico4;
	}

	public static Page<EstadoDto> converter(Page<Estado> estados) {
		return estados.map(EstadoDto::new);
	}
}
