package optional;

import java.util.Optional;

public class OptionalTestUm {
	
	private String nome;
	
	public static void main(String[] args) {
		
		OptionalTestUm ot = new OptionalTestUm();
		Optional<String> optional1 = Optional.of("Marcelo");
		Optional<String> optional2 = Optional.empty();
		Optional<String> optional3 = Optional.ofNullable(ot.nome);
		// imprimindo
		System.out.println(optional1);
		System.out.println(optional2);
		System.out.println(optional3);
		
		// buscando valores
		System.out.println(optional1.orElse("vazio"));
		System.out.println(optional2.orElse("vazio"));
		System.out.println(optional3.orElse("vazio"));
		
		//System.out.println(ot.nome.toUpperCase());
	}

}
