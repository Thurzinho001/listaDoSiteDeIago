public class Main {

		public static void QuestaoVinteETres(String[] args) {
			Scanner ref = new Scanner(System.in);
		
			System.out.println("Escreva um número em metros: ");
			int a = ref.nextInt();
			double decimetros = (a/10);
			double centimetros = (a/100);
			double milimetros = (a/1000);
			System.out.println("O númerto digitado representa " + a +" metros\n" + "O númerto digitado representa " + decimetros +" decimetros\n" + "O númerto digitado representa " + centimetros +" centimetros\n" + "O númerto digitado representa " + milimetros +"  milimetros\n");
		}
	}
