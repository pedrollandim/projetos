package br.com.pedrolino.historicoNotas.controller;

import java.util.Collections;
import java.util.List;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.pedrolino.historicoNotas.Estado;
import br.com.pedrolino.historicoNotas.repository.EstadoRepository;

@RestController
public class testes {

	@Autowired
	private EstadoRepository estadoRepository;

	@RequestMapping("/hw")
	//public List<Estado> hello() throws IOException {
	public int hello() throws IOException {

		Document d = Jsoup.connect("http://www.nfe.fazenda.gov.br/portal/disponibilidade.aspx").timeout(6000).get();

		Elements image = d.select("#ibtHome");

		// System.out.println("nome da imagem: ");
		// System.out.println(image.attr("src"));

		//List<Estado> resultado = estadoRepository.findByautorizador("AM");

		//Estado es = new Estado();
		
		//es.setStatusServico4("imagens/bola_verde_P.png");
		
		//int occurrences = Collections.frequency(resultado, es);
		
		List<Estado> resultado = estadoRepository.findByAutorizadorAndStatusServico4("AM","imagens/bola_verde_P.png");
		
		List<Estado> resultadoAM1 = estadoRepository.findByAutorizadorAndStatusServico4("AM",
				"imagens/bola_verde_P.png");
		List<Estado> resultadoAM2 = estadoRepository.findByAutorizadorAndStatusServico4("AM",
				"imagens/bola_amarela_P.png");
		List<Estado> resultadoAM3 = estadoRepository.findByAutorizadorAndStatusServico4("AM",
				"imagens/bola_vermelho_P.png");
		
		//String nomeIMG = image.attr("src");
		//String nomeIMG = "pedro "+ resu;
		return resultadoAM1.size();
	}

}
