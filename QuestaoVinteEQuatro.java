	public class QuestaoVinteEQuatro.java {

		public static void main(String[] args) {
			Scanner ref = new Scanner(System.in);
		
			System.out.println("Insira um número:");
			double a = ref.nextDouble();
			
			for(int i = 1; i <= 10; i++) {
			System.out.println(i+" X "+a+" = "+(i*a));
		}
	}
	}
