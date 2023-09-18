package principal;

import geografia.Geografia;
import historia.Historia;
import astronomia.Astronomia;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Metodos {

	static Variables v = new Variables();
	static Scanner leitura = new Scanner(System.in);

	static boolean ativador = false;

	public static void menu1() {
		System.out.println(v.pretoLetra + v.fundoBranco
				+ "\n - - - - - - - - - - - - - - - - - - - - - - BEM VINDO À FATOS CURIOSOS! - - - - - - - - - - - - - - - - - - - - - - "
				+ v.reset);

		System.out.println(
				"\nPara maior conforto, você deseja alterar a cor do terminal? Digite sim para alterar ou outra coisa para continuar.");
		v.mudarCor = leitura.nextLine();
		
		if (v.mudarCor.equalsIgnoreCase("sim")) {
			System.out.println("Qual cor de fonte você deseja?\n1 - Preto | 2 - Amarelo | 3 - Vermelho |"
					+ " 4 - Verde | 5 - Azul | 6 - Roxo");

			int item = leitura.nextInt();
			switch (item) {
			case 1:
				v.corAtual = v.pretoLetra;
				System.out.println(v.corAtual + "Cor 'Preta' selecionada");
				break;
			case 2:
				v.corAtual = v.amareloLetra;
				System.out.println(v.corAtual + "Cor 'Amarela' selecionada");
				break;
			case 3:
				v.corAtual = v.vermelhoLetra;
				System.out.println(v.corAtual + "Cor 'Vermelha' selecionada");
				break;
			case 4:
				v.corAtual = v.verdeLetra;
				System.out.println(v.corAtual + "Cor 'Verde' selecionada");
				break;
			case 5:
				v.corAtual = v.azulLetra;
				System.out.println(v.corAtual + "Cor 'Azul' selecionada");
				break;
			case 6:
				v.corAtual = v.roxaLetra;
				System.out.println(v.corAtual + "Cor 'Roxa' selecionada");
				break;
			default:
				System.out.println("Opção Inexistente. A cor atual será mantida!");
				break;
			}
			leitura.nextLine(); // Consumir a quebra de linha
		}

		System.out
				.println("Você deseja alterar a cor de fundo? Digite sim para alterar ou outra coisa para continuar.");
		v.mudarFundo = leitura.nextLine();

		if (v.mudarFundo.equalsIgnoreCase("sim")) {

			System.out.println(
					"Qual a cor para o fundo você deseja?\n1 - Preto | 2 - Amarelo | 3 - Vermelho | 4 - Verde | 5 - Azul | 6 - Roxo | 7 - Ciano | 8 - Branco");

			int item2 = leitura.nextInt();
			switch (item2) {
			case 1:
				v.fundoAtual = v.fundoPreto;
				System.out.println(v.fundoAtual + "Cor de fundo 'Preta' selecionada");
				break;
			case 2:
				v.fundoAtual = v.fundoAmarelo;
				System.out.println(v.fundoAtual + "Cor de fundo 'Amarela' selecionada");
				break;
			case 3:
				v.fundoAtual = v.fundoVermelho;
				System.out.println(v.fundoAtual + "Cor de fundo 'Vermelha' selecionada");
				break;
			case 4:
				v.fundoAtual = v.fundoVerde;
				System.out.println(v.fundoAtual + "Cor de fundo 'Verde' selecionada");
				break;
			case 5:
				v.fundoAtual = v.fundoAzul;
				System.out.println(v.fundoAtual + "Cor de fundo 'Azul' selecionada");
				break;
			case 6:
				v.fundoAtual = v.fundoRoxo;
				System.out.println(v.fundoAtual + "Cor de fundo 'Roxa' selecionada");
				break;
			case 7:
				v.fundoAtual = v.fundoCiano;
				System.out.println(v.fundoAtual + "Cor de fundo 'Ciano' selecionada");
				break;
			case 8:
				v.fundoAtual = v.fundoBranco;
				System.out.println(v.fundoAtual + "Cor de fundo 'Branca' selecionada");
				break;
			default:
				System.out.println("Opção Inexistente. A cor de fundo atual será mantida!");
				break;
			}
			v.nome = leitura.nextLine(); // Consumir a quebra de linha
		}
		if (ativador == true) {
			menu2();
		}
	}

	public static void menu2() {
		System.out.println("\n ***ACESSO LIBERADO***"
				+ "\n ______________________ \r\n"
				  + "|                      |\r\n"
				  + "|  ▄▀▀▀▄               |\r\n"
				  + "|  █   █               |\r\n"
				  + "| ███████         ▄▀▀▄ |\r\n"
				  + "| ██ ▀ ██  █▀█▀▀▀▀█  █ |\r\n"
				  + "| ███▄███  ▀ ▀     ▀▀  |\r\n"
				  + "|______________________|");
				
		
		System.out.println("\nAntes de começar, quero te conhecer.");
		System.out.println("Como você se chama?");

		v.nome = leitura.nextLine();

		System.out.println("\nOlá " + v.nome + ", pode me chamar de 'Amigo Curioso'.");

		if (ativador == true) {
			menu3();
		}
	}

	public static void menu3() {
		System.out.println("---------------------------------------" +
						 "\nVAMOS INICIAR!\n\n" +
						 "Você deseja conhecer mais sobre:" + 
						 "\n1 - Geografia | 2 - História | 3 - Astronomia\n4 - Reiniciar o programa | 5 - Sair\n" + "---------------------------------------");

		try {
			do {
			v.opcao = leitura.nextInt();

			
				if (v.opcao == 1) {
					System.out.println("Ótima escolha " + v.nome + ". Vamos conhecer mais sobre países!");
					Geografia geo = new Geografia();
					geo.comecar();
				} else if (v.opcao == 2) {
					System.out.println("Você gosta de aprender sobre o passado né?! Vamos lá então " + v.nome + ".");
					Historia his = new Historia();
					his.comecar();
				} else if (v.opcao == 3) {
					System.out.println("Eu também amo curiosidades sobre o espaço! Eu estou com você, " + v.nome + ".");
					Astronomia ast = new Astronomia();
					ast.comecar();
				} else if (v.opcao == 4) {
					System.out.println("Ok, reiniciando o programa...");
					leitura.nextLine(); // Consumir Linha
					ativador = true;
					Metodos.menu1();
				} else if (v.opcao == 5) {
					System.out.println(v.pretoLetra + v.fundoBranco
							+ "\n - - - - - - - - - - - - - - - - - - - - - - PROGRAMA FINALIZADO! - - - - - - - - - - - - - - - - - - - - - - ");
					System.exit(0);
					break;
				} else {
					System.out.println("Opção inexistente! Escolha novamente.");
				}
			
		} while (v.opcao != 1 && v.opcao != 2 && v.opcao != 3 && v.opcao != 4);
		}catch (InputMismatchException e) {
			System.err.println("\nO SEGUINTE ERRO FOI APRESENTADO: " + e);
			//leitura.nextLine();
			System.out.println("\nNÃO É PERMITIDO UTILIZAR STRING!");
		} finally { // Sempre aparece
			System.out.println("\n***** PROGRAMA INESPERADAMENTE FINALIZADO! *****\n");
		}

		leitura.close();
	}

}
