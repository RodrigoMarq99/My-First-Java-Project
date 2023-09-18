package historia;

import principal.Metodos;
import principal.Origin;
import java.util.Scanner;

public class Historia extends Origin {
	Scanner leia = new Scanner(System.in);

	@Override
	public void comecar() {

		System.out.println(
				"Como Assistente de História posso te fornecer as principais informações sobre períodos históricos.");
		System.out.println("Digite o nome do século que deseja conhecer (de 1 a 20):");
		String periodos = leia.nextLine();
		if (periodos.equalsIgnoreCase("0")) {
			Metodos.menu3();
		} else {
		}

	}

}
