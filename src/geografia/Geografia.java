package geografia;

import principal.Metodos;
import principal.Origin;

import java.util.Optional;
import java.util.Scanner;

import geografia.Paises.Pais;

public class Geografia extends Origin {
	Scanner leia = new Scanner(System.in);

	@Override
	public void comecar() {

		Paises paises = new Paises();
		paises.listaPais(); // Certifique-se de chamar este método para preencher a lista de países

		
		System.out.println("\nDigite o nome do país desejado ou '0' para voltar ao menu inicial.");
		String nomePais = leia.nextLine();

		Optional<Pais> paisEncontrado = paises.acharPais(nomePais);

		if (paisEncontrado.isPresent()) {
			System.out.println("------------------------------------");
			System.out.println("Informações do país encontrado:" + paisEncontrado.get());
			System.out.println("------------------------------------");
		} else {
			System.out.println("País não encontrado.");
		}

	}

}
