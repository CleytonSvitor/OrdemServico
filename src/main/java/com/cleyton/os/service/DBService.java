package com.cleyton.os.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cleyton.os.model.Cliente;
import com.cleyton.os.model.OS;
import com.cleyton.os.model.Tecnico;
import com.cleyton.os.model.enuns.Prioridade;
import com.cleyton.os.model.enuns.Status;
import com.cleyton.os.repositories.ClienteRepository;
import com.cleyton.os.repositories.OSRepository;
import com.cleyton.os.repositories.TecnicoRepository;

@Service
public class DBService {

	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private OSRepository osRepository;

	
	public void instanciaDB() {
		Tecnico t1 = new Tecnico(null, "Marcos Brito", "343.084.130-52", "84 98756-4635");
		Tecnico t2 = new Tecnico(null, "Aurora Ana Mendes", "188.506.274-59", "83 2908-8165");
		Cliente c1 = new Cliente(null, "Mario de Andrade", "644.050.510-62", "87 98745-7731");
		OS os1 = new OS(null, Prioridade.ALTA, "Teste create OS", Status.ANDAMENTO, t1, c1);

		// fazendo t1 e c1 conhecer a lista de OS's
		t1.getListOS().add(os1);
		c1.getListOS().add(os1);

		tecnicoRepository.saveAll(Arrays.asList(t1, t2));
		clienteRepository.saveAll(Arrays.asList(c1));
		osRepository.saveAll(Arrays.asList(os1));
	}
}
