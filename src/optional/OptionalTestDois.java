package optional;

import java.util.Optional;

public class OptionalTestDois {

	public static void main(String[] args) {
		
		Seguradora seguradora = new Seguradora("Itau seguros");
		Carro carro = new Carro(seguradora, "Audi");
		Pessoa p = new Pessoa(carro, "Marcelo");
		
		getNomeSeguradora(Optional.ofNullable(p));
		checarNomeSeguradora(seguradora);
		checarNomeSeguradoraOptional(seguradora);
		p.setIdade(20);
		System.out.println(obterNomeSeguradoraComIdade(p,18));
		Seguradora s = new Seguradora("Itau");
		//System.out.println(obterNomeSeguradoraOptional(s));

	}
	
	private static void checarNomeSeguradora(Seguradora seguradora) {
		if(seguradora != null && seguradora.getNome().equals(seguradora)) {
			System.out.println("Itau seguros");
		}
	}
	private static void checarNomeSeguradoraOptional(Seguradora seguradora) {
		Optional<Seguradora> seguradoraOptional = Optional.ofNullable(seguradora);
		seguradoraOptional.filter(s -> s.getNome().equals(seguradora)).ifPresent(x -> System.out.println(seguradora));
	}
	
	private static String obterNomeSeguradoraComIdade(Pessoa p, int idadeMinima) {
		 Optional.ofNullable(p)
				.filter(pessoa -> pessoa.getIdade()>= idadeMinima)
				.flatMap(Pessoa :: getCarro)
				.flatMap(Carro :: getSeguradora)
				.map(Seguradora :: getNome);
				return "";
	}
	
	private static String getNomeSeguradora(Optional<Pessoa> p) {
		System.out.println(
				p.flatMap(Pessoa :: getCarro)
				 .flatMap(Carro :: getSeguradora) // completo dados
				 .map(Seguradora::getNome)     // simples dados	
				);	
	return "";
	}
	
	private static String obterNomeSeguradoraOptional(Seguradora seguradora) {
		System.out.println(Optional.ofNullable(seguradora).map(Seguradora :: getNome));
		System.out.println(Optional.ofNullable(seguradora).flatMap(Seguradora :: getNome));
		System.out.println(Optional.ofNullable(seguradora).flatMap(Seguradora :: getNome).orElse("vazio"));
		return " ";
	}
	
	private static Optional<String> obterNomeSeguraora(Seguradora seguradora) {
		Optional<String> nome = null;
		if(seguradora.getNome() != null) {
			nome = seguradora.getNome();
		}
		return nome;
	}
	
}
