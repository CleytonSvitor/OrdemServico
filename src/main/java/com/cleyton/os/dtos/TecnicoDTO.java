package com.cleyton.os.dtos;

import java.io.Serializable;

import org.hibernate.validator.constraints.br.CPF;

import com.cleyton.os.model.Tecnico;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TecnicoDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String nome;
	@CPF
	private String cpf;
	private String telefone;

	public TecnicoDTO() {
		super();
	}

	public TecnicoDTO(Tecnico obj) {
		super();
		
		this.id = obj.getId();
		this.nome = obj.getNome();
		this.cpf = obj.getCpf(); 
		this.telefone = obj.getTelefone();
	}

	
}
