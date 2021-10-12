package br.com.pedrolino.historicoNotas.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.pedrolino.historicoNotas.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Long>{

	Page<Estado> findBydataEHora(String filtro,Pageable paginacao);
	
	
	List<Estado> findByautorizador(String autorizador);
	
	
	List<Estado> findByAutorizadorAndStatusServico4(String string, String string2);
	
	

}
