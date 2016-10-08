package br.com.sistema.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sistema.model.Cachaca;
import br.com.sistema.repository.Cachacas;

@Service
public class CachacaService {
	
	@Autowired
	private Cachacas cachacas;
	
	public void salvar(Cachaca cachaca){
		cachacas.save(cachaca);
	}
}
