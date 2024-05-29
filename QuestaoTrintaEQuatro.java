	public class QuestaoTrintaEQuatro {

		public static void main(String[] args) {
			Scanner ref = new Scanner(System.in);
		
			System.out.println("Digite seu nome: ");
			String a = ref.nextLine();
			
			System.out.println("Digite o nome de sua rua: ");
			String c = ref.nextLine();
			
			System.out.println("Digite o seu número de telefone: ");
			String d = ref.nextLine();
			
			System.out.println("Digite sua idade: ");
			int b = ref.nextInt();
			
			System.out.println("Seu nome é "+ a +", " + "você tem " + b + " anos, mora na rua" + c + " e seu telefone é "+d+".");
		}
	}
