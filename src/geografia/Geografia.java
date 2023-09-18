package geografia;

import principal.Origin;
import java.util.Optional;
import java.util.Scanner;
import principal.Metodos;

import geografia.Paises.Pais;

public class Geografia extends Origin {
	Scanner leia = new Scanner(System.in);
	
	@Override
	public void comecar() {
		String nomePais;
		
		do {
		
		Paises paises = new Paises();
		paises.listaPais(); // Certifique-se de chamar este método para preencher a lista de países

		
		System.out.println("\nDigite o nome do país desejado ou '0' para voltar ao menu inicial.");
		nomePais = leia.nextLine();
		if (nomePais.equals("0")) {
			Metodos.menu3();
		}
		

		Optional<Pais> paisEncontrado = paises.acharPais(nomePais);
		
		if (paisEncontrado.isPresent()) {
			System.out.println("------------------------------------");
			System.out.println("Informações do país encontrado:" + paisEncontrado.get());
			System.out.println("------------------------------------");
		} else {
			System.out.println("País não encontrado.");
		}
		
		}while(nomePais != "0");
		
		leia.close();
	}
	
}