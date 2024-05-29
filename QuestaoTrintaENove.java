	public class Main {

		public static void QuestaoTrintaENove(String[] args) {
			Scanner ref = new Scanner(System.in);
		
			System.out.println("Escreva sua primeira nota: ");
			double a = ref.nextDouble();
			
			System.out.println("Escreva sua segunda nota: ");
			double b = ref.nextDouble();
			
			System.out.println("Escreva sua terceira nota: ");
			double c = ref.nextDouble();
			
			System.out.println("Nota 1 é: "+a+"\nNota 2 é: "+b+"\nNota 3 é: "+c);
			
		}
	}
