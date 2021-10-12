package br.com.pedrolino.historicoNotas.controller;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.pedrolino.historicoNotas.Estado;
import br.com.pedrolino.historicoNotas.controller.dto.EstadoDto;
import br.com.pedrolino.historicoNotas.controller.form.EstadoForm;
import br.com.pedrolino.historicoNotas.repository.EstadoRepository;

@RestController
@RequestMapping("/StatusDosEstados")
public class StatusDosEstados {

	@Autowired
	private EstadoRepository estadoRepository;
	
	

	@GetMapping
	public Page<EstadoDto> lista(@RequestParam(required = false) String filtro, 
			@PageableDefault(sort="autorizador",direction=Direction.ASC, page=0,size=10) Pageable paginacao) {


		if (filtro == null) {
			Page<Estado> estados = estadoRepository.findAll(paginacao);
			return EstadoDto.converter(estados);
		} else {
			Page<Estado> estados = estadoRepository.findBydataEHora(filtro,paginacao);
			return EstadoDto.converter(estados);
		}

	}

	
}
