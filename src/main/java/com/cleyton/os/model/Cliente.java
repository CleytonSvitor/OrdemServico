package com.cleyton.os.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "tb_pessoas")
public class Cliente extends Pessoa implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@OneToMany(mappedBy = "cliente")
	private List<OS> listOS = new ArrayList<>();

	public Cliente() {
		super();

	}

	public Cliente(Integer id, String nome, String cpf, String telefone) {
		super(id, nome, cpf, telefone);

	}

}
