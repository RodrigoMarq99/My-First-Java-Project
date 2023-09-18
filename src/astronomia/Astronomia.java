package astronomia;

import principal.Metodos;
import principal.Origin;

import java.util.Optional;
import java.util.Scanner;

import astronomia.Planetas.Planeta;

public class Astronomia extends Origin {
	
	Scanner leia = new Scanner(System.in);
	
	@Override
	public void comecar() {
		String nomePlaneta;
		
		do {
			
		Planetas planetas = new Planetas();
		planetas.planetList(); // Certifique-se de chamar este método para preencher a lista de planetas
		
		System.out.println("\nDigite o nome do planeta desejado ou '0' para voltar ao menu inicial.");
		
		nomePlaneta = leia.nextLine();
		if (nomePlaneta.equals("0")) {
			Metodos.menu3();
		}
		Optional<Planeta> planetaEncontrado = planetas.acharPlaneta(nomePlaneta);
		if (planetaEncontrado.isPresent()) {
			System.out.println("------------------------------------");
			System.out.println("Informações do planeta encontrado:" + planetaEncontrado.get());
			System.out.println("------------------------------------");
		} else {
			System.out.println("Planeta não encontrado.");
		}
		
		}while(nomePlaneta != "0");
		
		leia.close();
	}
}