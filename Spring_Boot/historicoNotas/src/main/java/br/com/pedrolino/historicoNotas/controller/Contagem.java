package br.com.pedrolino.historicoNotas.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.pedrolino.historicoNotas.Estado;
import br.com.pedrolino.historicoNotas.ResultadoDaContagem;
import br.com.pedrolino.historicoNotas.repository.EstadoRepository;

@RestController
public class Contagem {

	@Autowired
	private EstadoRepository estadoRepository;

	@RequestMapping("/contagem")
	public List<ResultadoDaContagem> fazerAContagem() {

		List<ResultadoDaContagem> resContagem = new ArrayList<ResultadoDaContagem>();
		ResultadoDaContagem resContagemObjeto = new ResultadoDaContagem();
		List<Estado> resultadoAM1 = estadoRepository.findByAutorizadorAndStatusServico4("AM",
				"imagens/bola_verde_P.png");
		List<Estado> resultadoAM2 = estadoRepository.findByAutorizadorAndStatusServico4("AM",
				"imagens/bola_amarela_P.png");
		List<Estado> resultadoAM3 = estadoRepository.findByAutorizadorAndStatusServico4("AM",
				"imagens/bola_vermelho_P.png");
		resContagemObjeto.setId(1);
		resContagemObjeto.setAutorizador("AM");
		resContagemObjeto.setStatusVerde(resultadoAM1.size());
		resContagemObjeto.setStatusAmarelo(resultadoAM2.size());
		resContagemObjeto.setStatusVermelho(resultadoAM3.size());
		resContagem.add(resContagemObjeto);

		List<Estado> resultadoBA1 = estadoRepository.findByAutorizadorAndStatusServico4("BA",
				"imagens/bola_verde_P.png");
		List<Estado> resultadoBA2 = estadoRepository.findByAutorizadorAndStatusServico4("BA",
				"imagens/bola_amarela_P.png");
		List<Estado> resultadoBA3 = estadoRepository.findByAutorizadorAndStatusServico4("BA",
				"imagens/bola_vermelho_P.png");
		ResultadoDaContagem resContagemObjeto2 = new ResultadoDaContagem();
		resContagemObjeto2.setId(2);
		resContagemObjeto2.setAutorizador("BA");
		resContagemObjeto2.setStatusVerde(resultadoBA1.size());
		resContagemObjeto2.setStatusAmarelo(resultadoBA2.size());
		resContagemObjeto2.setStatusVermelho(resultadoBA3.size());
		resContagem.add(resContagemObjeto2);

		List<Estado> resultadoCE1 = estadoRepository.findByAutorizadorAndStatusServico4("CE",
				"imagens/bola_verde_P.png");
		List<Estado> resultadoCE2 = estadoRepository.findByAutorizadorAndStatusServico4("CE",
				"imagens/bola_amarela_P.png");
		List<Estado> resultadoCE3 = estadoRepository.findByAutorizadorAndStatusServico4("CE",
				"imagens/bola_vermelho_P.png");
		ResultadoDaContagem resContagemObjeto3 = new ResultadoDaContagem();
		resContagemObjeto3.setId(3);
		resContagemObjeto3.setAutorizador("CE");
		resContagemObjeto3.setStatusVerde(resultadoCE1.size());
		resContagemObjeto3.setStatusAmarelo(resultadoCE2.size());
		resContagemObjeto3.setStatusVermelho(resultadoCE3.size());
		resContagem.add(resContagemObjeto3);

		List<Estado> resultadoGO1 = estadoRepository.findByAutorizadorAndStatusServico4("GO",
				"imagens/bola_verde_P.png");
		List<Estado> resultadoGO2 = estadoRepository.findByAutorizadorAndStatusServico4("GO",
				"imagens/bola_amarela_P.png");
		List<Estado> resultadoGO3 = estadoRepository.findByAutorizadorAndStatusServico4("GO",
				"imagens/bola_vermelho_P.png");
		ResultadoDaContagem resContagemObjeto4 = new ResultadoDaContagem();
		resContagemObjeto4.setId(4);
		resContagemObjeto4.setAutorizador("GO");
		resContagemObjeto4.setStatusVerde(resultadoGO1.size());
		resContagemObjeto4.setStatusAmarelo(resultadoGO2.size());
		resContagemObjeto4.setStatusVermelho(resultadoGO3.size());
		resContagem.add(resContagemObjeto4);

		List<Estado> resultadoMG1 = estadoRepository.findByAutorizadorAndStatusServico4("MG",
				"imagens/bola_verde_P.png");
		List<Estado> resultadoMG2 = estadoRepository.findByAutorizadorAndStatusServico4("MG",
				"imagens/bola_amarela_P.png");
		List<Estado> resultadoMG3 = estadoRepository.findByAutorizadorAndStatusServico4("MG",
				"imagens/bola_vermelho_P.png");
		ResultadoDaContagem resContagemObjeto5 = new ResultadoDaContagem();
		resContagemObjeto5.setId(5);
		resContagemObjeto5.setAutorizador("MG");
		resContagemObjeto5.setStatusVerde(resultadoMG1.size());
		resContagemObjeto5.setStatusAmarelo(resultadoMG2.size());
		resContagemObjeto5.setStatusVermelho(resultadoMG3.size());
		resContagem.add(resContagemObjeto5);

		List<Estado> resultadoMS1 = estadoRepository.findByAutorizadorAndStatusServico4("MS",
				"imagens/bola_verde_P.png");
		List<Estado> resultadoMS2 = estadoRepository.findByAutorizadorAndStatusServico4("MS",
				"imagens/bola_amarela_P.png");
		List<Estado> resultadoMS3 = estadoRepository.findByAutorizadorAndStatusServico4("MS",
				"imagens/bola_vermelho_P.png");
		ResultadoDaContagem resContagemObjeto6 = new ResultadoDaContagem();
		resContagemObjeto6.setId(6);
		resContagemObjeto6.setAutorizador("MS");
		resContagemObjeto6.setStatusVerde(resultadoMS1.size());
		resContagemObjeto6.setStatusAmarelo(resultadoMS2.size());
		resContagemObjeto6.setStatusVermelho(resultadoMS3.size());
		resContagem.add(resContagemObjeto6);

		List<Estado> resultadoMT1 = estadoRepository.findByAutorizadorAndStatusServico4("MT",
				"imagens/bola_verde_P.png");
		List<Estado> resultadoMT2 = estadoRepository.findByAutorizadorAndStatusServico4("MT",
				"imagens/bola_amarela_P.png");
		List<Estado> resultadoMT3 = estadoRepository.findByAutorizadorAndStatusServico4("MT",
				"imagens/bola_vermelho_P.png");
		ResultadoDaContagem resContagemObjeto7 = new ResultadoDaContagem();
		resContagemObjeto7.setId(7);
		resContagemObjeto7.setAutorizador("MT");
		resContagemObjeto7.setStatusVerde(resultadoMT1.size());
		resContagemObjeto7.setStatusAmarelo(resultadoMT2.size());
		resContagemObjeto7.setStatusVermelho(resultadoMT3.size());
		resContagem.add(resContagemObjeto7);

		List<Estado> resultadoPE1 = estadoRepository.findByAutorizadorAndStatusServico4("PE",
				"imagens/bola_verde_P.png");
		List<Estado> resultadoPE2 = estadoRepository.findByAutorizadorAndStatusServico4("PE",
				"imagens/bola_amarela_P.png");
		List<Estado> resultadoPE3 = estadoRepository.findByAutorizadorAndStatusServico4("PE",
				"imagens/bola_vermelho_P.png");
		ResultadoDaContagem resContagemObjeto8 = new ResultadoDaContagem();
		resContagemObjeto8.setId(8);
		resContagemObjeto8.setAutorizador("PE");
		resContagemObjeto8.setStatusVerde(resultadoPE1.size());
		resContagemObjeto8.setStatusAmarelo(resultadoPE2.size());
		resContagemObjeto8.setStatusVermelho(resultadoPE3.size());
		resContagem.add(resContagemObjeto8);

		List<Estado> resultadoPR1 = estadoRepository.findByAutorizadorAndStatusServico4("PR",
				"imagens/bola_verde_P.png");
		List<Estado> resultadoPR2 = estadoRepository.findByAutorizadorAndStatusServico4("PR",
				"imagens/bola_amarela_P.png");
		List<Estado> resultadoPR3 = estadoRepository.findByAutorizadorAndStatusServico4("PR",
				"imagens/bola_vermelho_P.png");
		ResultadoDaContagem resContagemObjeto9 = new ResultadoDaContagem();
		resContagemObjeto9.setId(9);
		resContagemObjeto9.setAutorizador("PR");
		resContagemObjeto9.setStatusVerde(resultadoPR1.size());
		resContagemObjeto9.setStatusAmarelo(resultadoPR2.size());
		resContagemObjeto9.setStatusVermelho(resultadoPR3.size());
		resContagem.add(resContagemObjeto9);

		List<Estado> resultadoRS1 = estadoRepository.findByAutorizadorAndStatusServico4("RS",
				"imagens/bola_verde_P.png");
		List<Estado> resultadoRS2 = estadoRepository.findByAutorizadorAndStatusServico4("RS",
				"imagens/bola_amarela_P.png");
		List<Estado> resultadoRS3 = estadoRepository.findByAutorizadorAndStatusServico4("RS",
				"imagens/bola_vermelho_P.png");
		ResultadoDaContagem resContagemObjeto10 = new ResultadoDaContagem();
		resContagemObjeto10.setId(10);
		resContagemObjeto10.setAutorizador("RS");
		resContagemObjeto10.setStatusVerde(resultadoRS1.size());
		resContagemObjeto10.setStatusAmarelo(resultadoRS2.size());
		resContagemObjeto10.setStatusVermelho(resultadoRS3.size());
		resContagem.add(resContagemObjeto10);

		List<Estado> resultadoSP1 = estadoRepository.findByAutorizadorAndStatusServico4("SP",
				"imagens/bola_verde_P.png");
		List<Estado> resultadoSP2 = estadoRepository.findByAutorizadorAndStatusServico4("SP",
				"imagens/bola_amarela_P.png");
		List<Estado> resultadoSP3 = estadoRepository.findByAutorizadorAndStatusServico4("SP",
				"imagens/bola_vermelho_P.png");
		ResultadoDaContagem resContagemObjeto11 = new ResultadoDaContagem();
		resContagemObjeto11.setId(11);
		resContagemObjeto11.setAutorizador("SP");
		resContagemObjeto11.setStatusVerde(resultadoSP1.size());
		resContagemObjeto11.setStatusAmarelo(resultadoSP2.size());
		resContagemObjeto11.setStatusVermelho(resultadoSP3.size());
		resContagem.add(resContagemObjeto11);

		List<Estado> resultadoSVAN1 = estadoRepository.findByAutorizadorAndStatusServico4("SVAN",
				"imagens/bola_verde_P.png");
		List<Estado> resultadoSVAN2 = estadoRepository.findByAutorizadorAndStatusServico4("SVAN",
				"imagens/bola_amarela_P.png");
		List<Estado> resultadoSVAN3 = estadoRepository.findByAutorizadorAndStatusServico4("SVAN",
				"imagens/bola_vermelho_P.png");
		ResultadoDaContagem resContagemObjeto12 = new ResultadoDaContagem();
		resContagemObjeto12.setId(12);
		resContagemObjeto12.setAutorizador("SVAN");
		resContagemObjeto12.setStatusVerde(resultadoSVAN1.size());
		resContagemObjeto12.setStatusAmarelo(resultadoSVAN2.size());
		resContagemObjeto12.setStatusVermelho(resultadoSVAN3.size());
		resContagem.add(resContagemObjeto12);

		List<Estado> resultadoSVRS1 = estadoRepository.findByAutorizadorAndStatusServico4("SVRS",
				"imagens/bola_verde_P.png");
		List<Estado> resultadoSVRS2 = estadoRepository.findByAutorizadorAndStatusServico4("SVRS",
				"imagens/bola_amarela_P.png");
		List<Estado> resultadoSVRS3 = estadoRepository.findByAutorizadorAndStatusServico4("SVRS",
				"imagens/bola_vermelho_P.png");
		ResultadoDaContagem resContagemObjeto13 = new ResultadoDaContagem();
		resContagemObjeto13.setId(13);
		resContagemObjeto13.setAutorizador("SVRS");
		resContagemObjeto13.setStatusVerde(resultadoSVRS1.size());
		resContagemObjeto13.setStatusAmarelo(resultadoSVRS2.size());
		resContagemObjeto13.setStatusVermelho(resultadoSVRS3.size());
		resContagem.add(resContagemObjeto13);

		List<Estado> resultadoSVCAN1 = estadoRepository.findByAutorizadorAndStatusServico4("SVC-AN",
				"imagens/bola_verde_P.png");
		List<Estado> resultadoSVCAN2 = estadoRepository.findByAutorizadorAndStatusServico4("SVC-AN",
				"imagens/bola_amarela_P.png");
		List<Estado> resultadoSVCAN3 = estadoRepository.findByAutorizadorAndStatusServico4("SVC-AN",
				"imagens/bola_vermelho_P.png");
		ResultadoDaContagem resContagemObjeto14 = new ResultadoDaContagem();
		resContagemObjeto14.setId(14);
		resContagemObjeto14.setAutorizador("SVC-AN");
		resContagemObjeto14.setStatusVerde(resultadoSVCAN1.size());
		resContagemObjeto14.setStatusAmarelo(resultadoSVCAN2.size());
		resContagemObjeto14.setStatusVermelho(resultadoSVCAN3.size());
		resContagem.add(resContagemObjeto14);

		List<Estado> resultadoSVCRS1 = estadoRepository.findByAutorizadorAndStatusServico4("SVC-RS",
				"imagens/bola_verde_P.png");
		List<Estado> resultadoSVCRS2 = estadoRepository.findByAutorizadorAndStatusServico4("SVC-RS",
				"imagens/bola_amarela_P.png");
		List<Estado> resultadoSVCRS3 = estadoRepository.findByAutorizadorAndStatusServico4("SVC-RS",
				"imagens/bola_vermelho_P.png");
		ResultadoDaContagem resContagemObjeto15 = new ResultadoDaContagem();
		resContagemObjeto15.setId(15);
		resContagemObjeto15.setAutorizador("SVC-RS");
		resContagemObjeto15.setStatusVerde(resultadoSVCRS1.size());
		resContagemObjeto15.setStatusAmarelo(resultadoSVCRS2.size());
		resContagemObjeto15.setStatusVermelho(resultadoSVCRS3.size());
		resContagem.add(resContagemObjeto15);

		return resContagem;
	}
}
