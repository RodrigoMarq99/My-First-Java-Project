package astronomia;

import java.text.Collator;
import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Planetas {
		List<Planeta> planetList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        public static class Planeta {
            private String nome;
            private int tamanho;
            private float idade;
            private float distancia;
            
            public Planeta(String nome, int tamanho, float idade, float distancia) {
            	this.nome = nome;
                this.tamanho = tamanho;
                this.idade = idade;
                this.distancia = distancia;
            }

			public String getNome() {
				return nome;
			}

			public void setNome(String nome) {
				this.nome = nome;
			}

			public int getTamanho() {
				return tamanho;
			}

			public void setTamanho(int tamanho) {
				this.tamanho = tamanho;
			}

			public float getIdade() {
				return idade;
			}

			public void setIdade(float idade) {
				this.idade = idade;
			}

			public float getDistancia() {
				return distancia;
			}

			public void setDistancia(float distancia) {
				this.distancia = distancia;
			}
			@Override
			public String toString() {
				return "\n\nNome: " + nome + "\nTamanho (em km): " + tamanho +
						"\nIdade(em bilhões de anos): " + idade + "\nDistância do Sol (em km): " + distancia;
			} 
            }
        public List<Planeta> planetList() {
        // Populando a lista de planetas (você pode adicionar mais planetas)
        planetList.add(new Planeta("Mercúrio", 4879, 4.6f, 57910000f));
        planetList.add(new Planeta("Vênus", 12104, 4.0f, 108200000f));
        planetList.add(new Planeta("Terra", 12742, 4.5f, 149600000f));
        planetList.add(new Planeta("Marte", 6779, 4.6f, 227900000f));
        planetList.add(new Planeta("Júpiter", 139820, 4.6f, 778300000f));
        planetList.add(new Planeta("Saturno", 116460, 4.5f, 1427000000f));
        planetList.add(new Planeta("Urano", 50724, 4.5f, 2871000000.0f));
        planetList.add(new Planeta("Netuno", 49244, 4.5f, 4497000000.0f));
        
        return planetList;
        }
        
        public Optional<Planeta> acharPlaneta(String nomePlaneta) {
        	for (Planeta planetaEncontrado : planetList) {
                Collator collator = Collator.getInstance();
                collator.setStrength(Collator.PRIMARY);

                // Remova acentos e transforme em letras minúsculas antes de comparar
                String nomePlanetaSemAcentos = Normalizer.normalize(planetaEncontrado.getNome(), Form.NFD)
                        .replaceAll("[^\\p{ASCII}]", "")
                        .toLowerCase();
                String nomePlanetaInputSemAcentos = Normalizer.normalize(nomePlaneta, Form.NFD)
                        .replaceAll("[^\\p{ASCII}]", "")
                        .toLowerCase();

                if (collator.compare(nomePlanetaSemAcentos, nomePlanetaInputSemAcentos) == 0) {
                    return Optional.of(planetaEncontrado);
                }
            }
            return Optional.empty(); // Retorna Optional vazio se o país não for encontrado
        }
        }