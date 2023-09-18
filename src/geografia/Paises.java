package geografia;

import java.text.Collator;
import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Paises {
    List<Pais> todosOsPaises = new ArrayList<>();

    public static class Pais {
        private String nome;
        private String capital;
        private long populacao;
        private double tamanho;

        public Pais(String nome, String capital, long populacao, double tamanho) {
            this.nome = nome;
            this.capital = capital;
            this.populacao = populacao;
            this.tamanho = tamanho;
        }

		public void setNome(String nome) {
			this.nome = nome;
		}

		public void setCapital(String capital) {
			this.capital = capital;
		}

		public void setPopulacao(long populacao) {
			this.populacao = populacao;
		}

		public void setTamanho(double tamanho) {
			this.tamanho = tamanho;
		}

		public String getNome() {
			return nome;
		}

		public String getCapital() {
			return capital;
		}

		public long getPopulacao() {
			return populacao;
		}

		public double getTamanho() {
			return tamanho;
		}

		@Override
		public String toString() {
			return "\n\nPaís: " + nome + "\nCapital: " + capital + "\nPopulação: " + populacao + "\nTamanho: " + tamanho
					+ " km²";
		}
	}

    public List<Pais> listaPais() {

		// Adicione aqui todos os países com seus dados
		todosOsPaises.add(new Pais("Afeganistão", "Cabul", 38928346, 652230.0));
		todosOsPaises.add(new Pais("Albânia", "Tirana", 2877797, 28748.0));
		todosOsPaises.add(new Pais("Alemanha", "Berlim", 83783942, 357022.0));
		todosOsPaises.add(new Pais("Andorra", "Andorra-a-Velha", 77265, 468.0));
		todosOsPaises.add(new Pais("Angola", "Luanda", 32866272, 1246700.0));
		todosOsPaises.add(new Pais("Antígua e Barbuda", "Saint John's", 97928, 442.0));
		todosOsPaises.add(new Pais("Argentina", "Buenos Aires", 45195777, 2780400.0));
		todosOsPaises.add(new Pais("Armênia", "Erevã", 2963234, 29743.0));
		todosOsPaises.add(new Pais("Austrália", "Camberra", 25499884, 7692024.0));
		todosOsPaises.add(new Pais("Áustria", "Viena", 9006398, 83871.0));
		todosOsPaises.add(new Pais("Bahamas", "Nassau", 393244, 13943.0));
		todosOsPaises.add(new Pais("Bahrain", "Manama", 1701575, 780.0));
		todosOsPaises.add(new Pais("Bangladesh", "Daca", 164689383, 147570.0));
		todosOsPaises.add(new Pais("Barbados", "Bridgetown", 287375, 431.0));
		todosOsPaises.add(new Pais("Belarus", "Minsk", 9449323, 207600.0));
		todosOsPaises.add(new Pais("Bélgica", "Bruxelas", 11589623, 30528.0));
		todosOsPaises.add(new Pais("Belize", "Belmopã", 397628, 22966.0));
		todosOsPaises.add(new Pais("Benin", "Porto-Novo", 12123200, 112622.0));
		todosOsPaises.add(new Pais("Bolívia", "Sucre", 11673029, 1098581.0));
		todosOsPaises.add(new Pais("Bósnia e Herzegovina", "Saraievo", 3280815, 51197.0));
		todosOsPaises.add(new Pais("Botsuana", "Gaborone", 2351627, 581730.0));
		todosOsPaises.add(new Pais("Brasil", "Brasília", 212559417, 8515767.0));
		todosOsPaises.add(new Pais("Brunei", "Bandar Seri Begawan", 437479, 5765.0));
		todosOsPaises.add(new Pais("Bulgária", "Sófia", 6948445, 110879.0));
		todosOsPaises.add(new Pais("Burkina Faso", "Uagadugu", 20903278, 274200.0));
		todosOsPaises.add(new Pais("Burundi", "Buja", 11890784, 27834.0));
		todosOsPaises.add(new Pais("Cabo Verde", "Praia", 555987, 4033.0));
		todosOsPaises.add(new Pais("Camboja", "Phnom Penh", 16718965, 181035.0));
		todosOsPaises.add(new Pais("Camarões", "Iaundé", 26545863, 475442.0));
		todosOsPaises.add(new Pais("Canadá", "Ottawa", 37742154, 9984670.0));
		todosOsPaises.add(new Pais("Catar", "Doha", 2881053, 11586.0));
		todosOsPaises.add(new Pais("Cazaquistão", "Nur-Sultan", 18776707, 2724900.0));
		todosOsPaises.add(new Pais("Chade", "N'Djamena", 16425864, 1284000.0));
		todosOsPaises.add(new Pais("Chile", "Santiago", 19116201, 756102.0));
		todosOsPaises.add(new Pais("China", "Pequim", 1439323776, 9596961.0));
		todosOsPaises.add(new Pais("Chipre", "Nicósia", 1207359, 5896.0));
		todosOsPaises.add(new Pais("Colômbia", "Bogotá", 50882891, 1141748.0));
		todosOsPaises.add(new Pais("Comores", "Moroni", 869601, 1861.0));
		todosOsPaises.add(new Pais("Congo", "Brazavile", 5518092, 342000.0));
		todosOsPaises.add(new Pais("Coreia do Norte", "Pyongyang", 25778816, 120540.0));
		todosOsPaises.add(new Pais("Coreia do Sul", "Seul", 51269185, 100210.0));
		todosOsPaises.add(new Pais("Costa do Marfim", "Iamussucro", 26378274, 322463.0));
		todosOsPaises.add(new Pais("Costa Rica", "San José", 5094118, 51100.0));
		todosOsPaises.add(new Pais("Croácia", "Zagreb", 4105267, 56594.0));
		todosOsPaises.add(new Pais("Cuba", "Havana", 11326616, 109884.0));
		todosOsPaises.add(new Pais("Dinamarca", "Copenhague", 5793636, 43094.0));
		todosOsPaises.add(new Pais("Djibouti", "Djibouti", 988000, 23200.0));
		todosOsPaises.add(new Pais("Dominica", "Roseau", 71986, 751.0));
		todosOsPaises.add(new Pais("República Dominicana", "Santo Domingo", 10847904, 48671.0));
		todosOsPaises.add(new Pais("Egito", "Cairo", 102334404, 1002450.0));
		todosOsPaises.add(new Pais("El Salvador", "San Salvador", 6486201, 21041.0));
		todosOsPaises.add(new Pais("Emirados Árabes Unidos", "Abu Dhabi", 9890402, 83600.0));
		todosOsPaises.add(new Pais("Equador", "Quito", 17643054, 276841.0));
		todosOsPaises.add(new Pais("Eritreia", "Asmara", 3546421, 117600.0));
		todosOsPaises.add(new Pais("Eslováquia", "Bratislava", 5459642, 49035.0));
		todosOsPaises.add(new Pais("Eslovênia", "Liubliana", 2078938, 20273.0));
		todosOsPaises.add(new Pais("Espanha", "Madri", 46754778, 505992.0));
		todosOsPaises.add(new Pais("Estados Unidos", "Washington, D.C.", 331002651, 9372610.0));
		todosOsPaises.add(new Pais("Estônia", "Tallinn", 1326535, 45227.0));
		todosOsPaises.add(new Pais("Eswatini", "Mbabane", 1160164, 17364.0));
		todosOsPaises.add(new Pais("Etiópia", "Adis Abeba", 114963588, 1104300.0));
		todosOsPaises.add(new Pais("Fiji", "Suva", 896445, 18274.0));
		todosOsPaises.add(new Pais("Filipinas", "Manila", 109581078, 300000.0));
		todosOsPaises.add(new Pais("Finlândia", "Helsinque", 5540720, 338424.0));
		todosOsPaises.add(new Pais("França", "Paris", 65273511, 551695.0));
		todosOsPaises.add(new Pais("Gabão", "Libreville", 2225734, 267667.0));
		todosOsPaises.add(new Pais("Gâmbia", "Banjul", 2416664, 10689.0));
		todosOsPaises.add(new Pais("Gana", "Acra", 31072940, 238533.0));
		todosOsPaises.add(new Pais("Geórgia", "Tbilisi", 3989167, 69700.0));
		todosOsPaises.add(new Pais("Granada", "Saint George's", 112523, 344.0));
		todosOsPaises.add(new Pais("Grécia", "Atenas", 10423054, 131957.0));
		todosOsPaises.add(new Pais("Guatemala", "Cidade da Guatemala", 17915568, 108889.0));
		todosOsPaises.add(new Pais("Guiné", "Conacri", 13132795, 245857.0));
		todosOsPaises.add(new Pais("Guiné Equatorial", "Malabo", 1402985, 28051.0));
		todosOsPaises.add(new Pais("Guiné-Bissau", "Bissau", 1968001, 36125.0));
		todosOsPaises.add(new Pais("Haiti", "Porto Príncipe", 11402533, 27750.0));
		todosOsPaises.add(new Pais("Holanda", "Amsterdã", 17134872, 41543.0));
		todosOsPaises.add(new Pais("Honduras", "Tegucigalpa", 9904607, 112492.0));
		todosOsPaises.add(new Pais("Hungria", "Budapeste", 9660351, 93028.0));
		todosOsPaises.add(new Pais("Iémen", "Sanaa", 29825968, 527968.0));
		todosOsPaises.add(new Pais("Índia", "Nova Deli", 1380004385, 3287263.0));
		todosOsPaises.add(new Pais("Indonésia", "Jacarta", 273523615, 1904569.0));
		todosOsPaises.add(new Pais("Irã", "Teerã", 83992949, 1648195.0));
		todosOsPaises.add(new Pais("Iraque", "Bagdá", 40222493, 438317.0));
		todosOsPaises.add(new Pais("Irlanda", "Dublin", 4937786, 70273.0));
		todosOsPaises.add(new Pais("Islândia", "Reykjavik", 341243, 103000.0));
		todosOsPaises.add(new Pais("Israel", "Jerusalém", 8655535, 20770.0));
		todosOsPaises.add(new Pais("Itália", "Roma", 60461826, 301340.0));
		todosOsPaises.add(new Pais("Jamaica", "Kingston", 2961167, 10991.0));
		todosOsPaises.add(new Pais("Japão", "Tóquio", 126476461, 377975.0));
		todosOsPaises.add(new Pais("Jordânia", "Amã", 10203134, 89342.0));
		todosOsPaises.add(new Pais("Kosovo", "Pristina", 1932774, 10908.0));
		todosOsPaises.add(new Pais("Laos", "Vientiane", 7275560, 236800.0));
		todosOsPaises.add(new Pais("Lesoto", "Maseru", 2142249, 30355.0));
		todosOsPaises.add(new Pais("Letônia", "Riga", 1886198, 64559.0));
		todosOsPaises.add(new Pais("Líbano", "Beirute", 6825442, 10452.0));
		todosOsPaises.add(new Pais("Libéria", "Monróvia", 5057681, 111369.0));
		todosOsPaises.add(new Pais("Líbia", "Trípoli", 6871287, 1759540.0));
		todosOsPaises.add(new Pais("Liechtenstein", "Vaduz", 38128, 160.0));
		todosOsPaises.add(new Pais("Lituânia", "Vilnius", 2722289, 65300.0));
		todosOsPaises.add(new Pais("Luxemburgo", "Luxemburgo", 625978, 2586.0));
		todosOsPaises.add(new Pais("Macedônia do Norte", "Skopje", 2083374, 25713.0));
		todosOsPaises.add(new Pais("Madagascar", "Antananarivo", 27691019, 587041.0));
		todosOsPaises.add(new Pais("Malásia", "Kuala Lumpur", 32365999, 330803.0));
		todosOsPaises.add(new Pais("Malaui", "Lilongwe", 19129952, 118484.0));
		todosOsPaises.add(new Pais("Maldivas", "Malé", 521000, 300.0));
		todosOsPaises.add(new Pais("Mali", "Bamaco", 20250833, 1240192.0));
		todosOsPaises.add(new Pais("Malta", "Valletta", 441543, 316.0));
		todosOsPaises.add(new Pais("Marrocos", "Rabat", 36910560, 446550.0));
		todosOsPaises.add(new Pais("Maurício", "Port Louis", 1271768, 2040.0));
		todosOsPaises.add(new Pais("Mauritânia", "Nouakchott", 4649658, 1030700.0));
		todosOsPaises.add(new Pais("México", "Cidade do México", 128932753, 1964375.0));
		todosOsPaises.add(new Pais("Mianmar", "Naypyidaw", 54409800, 676578.0));
		todosOsPaises.add(new Pais("Micronésia", "Paliquir", 115023, 702.0));
		todosOsPaises.add(new Pais("Moçambique", "Maputo", 31255435, 801590.0));
		todosOsPaises.add(new Pais("Moldávia", "Quixinau", 4033963, 33846.0));
		todosOsPaises.add(new Pais("Mônaco", "Mônaco", 39242, 2.0));
		todosOsPaises.add(new Pais("Mongólia", "Ulan Bator", 3278290, 1564110.0));
		todosOsPaises.add(new Pais("Montenegro", "Podgorica", 628066, 13812.0));
		todosOsPaises.add(new Pais("Namíbia", "Windhoek", 2540905, 825615.0));
		todosOsPaises.add(new Pais("Nauru", "Yaren", 10824, 21.0));
		todosOsPaises.add(new Pais("Nepal", "Catmandu", 29136808, 147516.0));
		todosOsPaises.add(new Pais("Nicarágua", "Manágua", 6624554, 130373.0));
		todosOsPaises.add(new Pais("Níger", "Niamey", 24206644, 1186408.0));
		todosOsPaises.add(new Pais("Nigéria", "Abuja", 206139587, 923768.0));
		todosOsPaises.add(new Pais("Noruega", "Oslo", 5421241, 323802.0));
		todosOsPaises.add(new Pais("Nova Zelândia", "Wellington", 4822233, 270467.0));
		todosOsPaises.add(new Pais("Omã", "Mascate", 5106626, 309500.0));
		todosOsPaises.add(new Pais("Paquistão", "Islamabad", 220892340, 881913.0));
		todosOsPaises.add(new Pais("Palau", "Ngerulmud", 18008, 459.0));
		todosOsPaises.add(new Pais("Panamá", "Cidade do Panamá", 4314767, 75417.0));
		todosOsPaises.add(new Pais("Papua-Nova Guiné", "Porto Moresby", 8947027, 462840.0));
		todosOsPaises.add(new Pais("Paraguai", "Assunção", 7132538, 406752.0));
		todosOsPaises.add(new Pais("Peru", "Lima", 32971846, 1285216.0));
		todosOsPaises.add(new Pais("Polônia", "Varsóvia", 37846611, 312696.0));
		todosOsPaises.add(new Pais("Portugal", "Lisboa", 10196709, 92090.0));
		todosOsPaises.add(new Pais("Quênia", "Nairobi", 53771296, 580367.0));
		todosOsPaises.add(new Pais("Romênia", "Bucareste", 19237691, 238397.0));
		todosOsPaises.add(new Pais("Ruanda", "Quigali", 12952218, 26338.0));
		todosOsPaises.add(new Pais("Rússia", "Moscou", 145934462, 17124442.0));
		todosOsPaises.add(new Pais("Samoa", "Apia", 198414, 2831.0));
		todosOsPaises.add(new Pais("San Marino", "San Marino", 33931, 61.0));
		todosOsPaises.add(new Pais("Santa Lúcia", "Castries", 183627, 616.0));
		todosOsPaises.add(new Pais("São Cristóvão e Nevis", "Basseterre", 53199, 261.0));
		todosOsPaises.add(new Pais("São Tomé e Príncipe", "São Tomé", 219159, 964.0));
		todosOsPaises.add(new Pais("São Vicente e Granadinas", "Kingstown", 110589, 389.0));
		todosOsPaises.add(new Pais("Senegal", "Dacar", 16743927, 196722.0));
		todosOsPaises.add(new Pais("Sérvia", "Belgrado", 8737371, 77474.0));
		todosOsPaises.add(new Pais("Seychelles", "Victoria", 98347, 459.0));
		todosOsPaises.add(new Pais("Serra Leoa", "Freetown", 7976983, 71740.0));
		todosOsPaises.add(new Pais("Singapura", "Singapura", 5850342, 710.0));
		todosOsPaises.add(new Pais("Síria", "Damasco", 17500658, 185180.0));
		todosOsPaises.add(new Pais("Somália", "Mogadíscio", 15893219, 637657.0));
		todosOsPaises.add(new Pais("Sri Lanka", "Sri Jayawardenepura Kotte", 21413249, 65610.0));
		todosOsPaises.add(new Pais("Suazilândia", "Mbabane", 1160164, 17364.0));
		todosOsPaises.add(new Pais("Sudão", "Cartum", 43849260, 1861484.0));
		todosOsPaises.add(new Pais("Sudão do Sul", "Juba", 11193725, 644329.0));
		todosOsPaises.add(new Pais("Suécia", "Estocolmo", 10099265, 450295.0));
		todosOsPaises.add(new Pais("Suíça", "Berna", 8654622, 41284.0));
		todosOsPaises.add(new Pais("Suriname", "Paramaribo", 586632, 163820.0));
		todosOsPaises.add(new Pais("Tadjiquistão", "Duchanbe", 9537645, 143100.0));
		todosOsPaises.add(new Pais("Tailândia", "Bangcoc", 69799978, 513120.0));
		todosOsPaises.add(new Pais("Taiwan", "Taipé", 23816775, 36193.0));
		todosOsPaises.add(new Pais("Tanzânia", "Dodoma", 59734213, 945087.0));
		todosOsPaises.add(new Pais("Tchéquia", "Praga", 10708981, 78866.0));
		todosOsPaises.add(new Pais("Timor-Leste", "Díli", 1318445, 14874.0));
		todosOsPaises.add(new Pais("Togo", "Lomé", 8278724, 56785.0));
		todosOsPaises.add(new Pais("Tonga", "Nucualofa", 105695, 747.0));
		todosOsPaises.add(new Pais("Trinidad e Tobago", "Porto de Espanha", 1399491, 5128.0));
		todosOsPaises.add(new Pais("Tunísia", "Túnis", 11818619, 163610.0));
		todosOsPaises.add(new Pais("Turcomenistão", "Asgabate", 6031187, 488100.0));
		todosOsPaises.add(new Pais("Turquia", "Ancara", 84339067, 783562.0));
		todosOsPaises.add(new Pais("Tuvalu", "Funafuti", 11746, 26.0));
		todosOsPaises.add(new Pais("Ucrânia", "Quieve", 44384916, 603550.0));
		todosOsPaises.add(new Pais("Uganda", "Campala", 45741007, 241550.0));
		todosOsPaises.add(new Pais("Uruguai", "Montevidéu", 3473730, 181034.0));
		todosOsPaises.add(new Pais("Uzbequistão", "Tashkent", 33469203, 448978.0));
		todosOsPaises.add(new Pais("Vanuatu", "Port Vila", 307145, 12189.0));
		todosOsPaises.add(new Pais("Vaticano", "Cidade do Vaticano", 801, 0.49));
		todosOsPaises.add(new Pais("Venezuela", "Caracas", 28435940, 912050.0));
		todosOsPaises.add(new Pais("Vietnã", "Hanói", 97338579, 331210.0));
		todosOsPaises.add(new Pais("Zâmbia", "Lusaca", 18383955, 752612.0));
		todosOsPaises.add(new Pais("Zimbábue", "Harare", 14862927, 390757.0));

		return todosOsPaises;
	}

    
    
    public Optional<Pais> acharPais(String nomePais) {
        for (Pais paisEncontrado : todosOsPaises) {
            Collator collator = Collator.getInstance();
            collator.setStrength(Collator.PRIMARY);

            // Remova acentos e transforme em letras minúsculas antes de comparar
            String nomePaisSemAcentos = Normalizer.normalize(paisEncontrado.getNome(), Form.NFD)
                    .replaceAll("[^\\p{ASCII}]", "")
                    .toLowerCase();
            String nomePaisInputSemAcentos = Normalizer.normalize(nomePais, Form.NFD)
                    .replaceAll("[^\\p{ASCII}]", "")
                    .toLowerCase();

            if (collator.compare(nomePaisSemAcentos, nomePaisInputSemAcentos) == 0) {
                return Optional.of(paisEncontrado);
            }
        }
        return Optional.empty(); // Retorna Optional vazio se o país não for encontrado
    }
}