package com.cleyton.os.model.enuns;

public enum Status {

	// é uma boa pratica definir valores para cada prioridade

	ABERTO(0, "ABERTO"), ANDAMENTO(1, "ANDAMENTO"), ENCERRADO(2, "ENCERRADO");

	private Integer cod;
	private String descrição;

	private Status(Integer cod, String descrição) {
		this.cod = cod;
		this.descrição = descrição;
	}

	public Integer getCod() {
		return cod;
	}

	public String getDescrição() {
		return descrição;
	}

	// Nao precisa insanciar classe para chamar os metodos
	public static Status toEnum(Integer cod) {

		if (cod == null)
			return null;

		for (Status x : Status.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Status Invalido! " + cod);
	}

}
