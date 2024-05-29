	public class QuestaoTres {

		public static void main(String[] args) {
			Scanner ref = new Scanner(System.in);
		
			System.out.println("Digite um número: ");
			int numero = ref.nextInt();
			
			int fat = 1;
			
			for(int i = 1; i <= numero; i++ ) {
				fat = fat * i;
				
			}
			System.out.println("O fatorial desse número é:" + fat);
		}
	}
