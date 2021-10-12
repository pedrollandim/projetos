package br.com.pedrolino.historicoNotas;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.pedrolino.historicoNotas.controller.form.EstadoForm;
import br.com.pedrolino.historicoNotas.repository.EstadoRepository;

public class FuncoesBasicas {

	public static String formataDados(String dado) {
		dado = dado.replaceAll("<td>", "");
		dado = dado.replaceAll("</td>", "");
		return dado;
	}
	
	
	public void cadastrar(EstadoForm form, EstadoRepository estadoRepository) {
		Estado estado = form.converter();
		estadoRepository.save(estado);
	}
	
	
}
