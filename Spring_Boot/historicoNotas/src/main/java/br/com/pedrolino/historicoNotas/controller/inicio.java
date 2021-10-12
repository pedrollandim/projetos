package br.com.pedrolino.historicoNotas.controller;

import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.pedrolino.historicoNotas.Estado;
import br.com.pedrolino.historicoNotas.Funcoes;
import br.com.pedrolino.historicoNotas.FuncoesBasicas;
import br.com.pedrolino.historicoNotas.controller.form.EstadoForm;
import br.com.pedrolino.historicoNotas.repository.EstadoRepository;

@RestController
public class inicio {

	@Autowired
	private EstadoRepository estadoRepository;
	
	private EstadoForm estado = new EstadoForm();
	public static int contador = 0;

	@RequestMapping("/")
	public String hello() throws IOException {
		
		ScheduledExecutorService servico = Executors.newSingleThreadScheduledExecutor();

		Runnable run = new Runnable() {

			@Override
			public void run() {
				try {
					getInformacoesDaNota();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		servico.scheduleAtFixedRate(run, 0, 5, TimeUnit.MINUTES);

		
		

		String nome = "Sistema iniciado abrir a pagina para a listagem dos status -->[ http://localhost:8080/StatusDosEstados ]"
				+ " Banco de dados -->[ http://localhost:8080/h2-console ]"
				+ " Total de alertas -->[ http://localhost:8080/contagem ]";
		return nome;
	}

	
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
