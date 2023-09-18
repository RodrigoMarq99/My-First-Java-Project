package astronomia;

import principal.Metodos;
import principal.Origin;
import java.util.Scanner;

public class Astronomia extends Origin {
	Scanner leia = new Scanner(System.in);

	@Override
	public void comecar() {

		System.out.println(
				"Como Assistente de Astronomia posso te fornecer as principais sobre planetas.");
		System.out.println("Digite o nome de um planeta do sistema solar:");
		String astros = leia.nextLine();
		if (astros.equalsIgnoreCase("0")) {
			Metodos.menu3();
		} else {
		}

	}

}
