package br.com.pedrolino.historicoNotas;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.pedrolino.historicoNotas.controller.form.EstadoForm;
import br.com.pedrolino.historicoNotas.repository.EstadoRepository;

public class Funcoes {

	@Autowired
	private EstadoRepository estadoRepository;
	
	private EstadoForm estado = new EstadoForm();

	public void getInformacoesDaNota() throws IOException {

		Document d = Jsoup.connect("http://www.nfe.fazenda.gov.br/portal/disponibilidade.aspx").timeout(6000).get();

		Elements body = d.select("#ctl00_ContentPlaceHolder1_gdvDisponibilidade2");

		int a = 0;
		int b = 0;
		String estados[] = new String[16];
		String disponibilidasde[] = new String[16];

		FuncoesBasicas fb = new FuncoesBasicas();

		for (Element e : body.select("tr")) {
			if (a >= 1) {
				b = 0;
				for (Element e2 : e.select("td")) {
					if (b == 0) {
						estados[a] = fb.formataDados(e2.select("td").toString());
						estado.setAutorizador(estados[a]);
					}
					if (b == 5) {
						disponibilidasde[a] = e2.select("img").attr("src");
						estado.setStatusServico4(disponibilidasde[a]);
					}
					b += 1;
				}

			}

			fb.cadastrar(estado, estadoRepository);
			a += 1;

		}

	}
}
