package com.cleyton.os.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cleyton.os.dtos.TecnicoDTO;
import com.cleyton.os.model.Tecnico;
import com.cleyton.os.repositories.TecnicoRepository;
import com.cleyton.os.service.exceptions.ObjectNotFoundException;

@Service
public class TecnicoService {
	

	@Autowired
	private TecnicoRepository tecnicoRepository;

	public Tecnico findById(Integer id) {
		Optional<Tecnico> obj = tecnicoRepository.findById(id);
		return obj.orElseThrow(
				() -> new ObjectNotFoundException("Objeto não encontrado!!" + id + "," + Tecnico.class.getName()));
	}

	public List<Tecnico> findAll() {		
		return tecnicoRepository.findAll();
	}
	
	public Tecnico create(TecnicoDTO objDTO) {
		return tecnicoRepository.save(
				new Tecnico(null, objDTO.getNome(), objDTO.getCpf(), objDTO.getTelefone())
				);
	}
	
	
}
