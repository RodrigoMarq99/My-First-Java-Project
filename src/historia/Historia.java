package historia;

import principal.Metodos;
import principal.Origin;
import java.util.Scanner;

public class Historia extends Origin {
	Scanner leia = new Scanner(System.in);
	String periodos;
	@Override
	public void comecar() {
		HistoriaTotal historiaTotal = new HistoriaTotal();
		
		do {
		
		System.out.println("\nDigite o número do século que deseja conhecer (de 1 a 20) ou '0' para voltar ao menu inicial.");
		periodos = leia.nextLine();
		if (periodos.equalsIgnoreCase("0")) {
			Metodos.menu3();
		} else {
			if (periodos.equals("1")) {
				historiaTotal.Acontecimentos1();
			}else if(periodos.equals("2")) {
				historiaTotal.Acontecimentos2();
			}else if(periodos.equals("3")) {
				historiaTotal.Acontecimentos3();
			}else if(periodos.equals("4")) {
				historiaTotal.Acontecimentos4();
			}else if(periodos.equals("5")) {
				historiaTotal.Acontecimentos5();
			}else if(periodos.equals("6")) {
				historiaTotal.Acontecimentos6();
			}else if(periodos.equals("7")) {
				historiaTotal.Acontecimentos7();
			}else if(periodos.equals("8")) {
				historiaTotal.Acontecimentos8();
			}else if(periodos.equals("9")) {
				historiaTotal.Acontecimentos9();
			}else if(periodos.equals("10")) {
				historiaTotal.Acontecimentos10();
			}else if(periodos.equals("11")) {
				historiaTotal.Acontecimentos11();
			}else if(periodos.equals("12")) {
				historiaTotal.Acontecimentos12();
			}else if(periodos.equals("13")) {
				historiaTotal.Acontecimentos13();
			}else if(periodos.equals("14")) {
				historiaTotal.Acontecimentos14();
			}else if(periodos.equals("15")) {
				historiaTotal.Acontecimentos15();
			}else if(periodos.equals("16")) {
				historiaTotal.Acontecimentos16();
			}else if(periodos.equals("17")) {
				historiaTotal.Acontecimentos17();
			}else if(periodos.equals("18")) {
				historiaTotal.Acontecimentos2();
			}else if(periodos.equals("19")) {
				historiaTotal.Acontecimentos19();
			}else if(periodos.equals("20")) {
				historiaTotal.Acontecimentos20();
			}else if(periodos.equals("21")) {
				historiaTotal.Acontecimentos21();
			}else {
				System.out.println("Opção Inexistente!");
			}
		}
			
		}while(!periodos.equals("0"));

	}

}
