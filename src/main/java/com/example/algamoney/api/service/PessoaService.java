package com.example.algamoney.api.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.example.algamoney.api.model.Pessoa;
import com.example.algamoney.api.repository.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository pessoaRepository;

	public Pessoa atualizar(Long codigo, Pessoa pessoa) {
		
		Pessoa p = buscarPessoaPeloCodigo(codigo);
		BeanUtils.copyProperties(pessoa, p, "codigo");
		
		return pessoaRepository.save(p);
	}

	public void atualizarProrpiedadeAtivo(Long codigo, Boolean ativo) {
		Pessoa p = buscarPessoaPeloCodigo(codigo); 
		p.setAtivo(ativo);
		pessoaRepository.save(p);
	}
	
	public Pessoa buscarPessoaPeloCodigo(Long codigo) {
		
		Pessoa pessoa =  pessoaRepository.findOne(codigo);
		if(pessoa == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return pessoa;
	}
}
