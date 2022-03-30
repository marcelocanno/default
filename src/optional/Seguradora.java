package optional;

import java.util.Optional;

public class Seguradora {

	private String nome;

	public Seguradora(String nome) {
		super();
		this.nome = nome;
	}

	public Seguradora() {
		super();
	}

	public Optional <String> getNome() {
		return Optional.ofNullable(nome);
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Seguradora [nome=" + nome + "]";
	}
	
	
}
