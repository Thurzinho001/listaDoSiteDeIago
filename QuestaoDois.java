public class QuestaoDois {

	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
	
		System.out.println("Digite um número: ");
		int numero = ref.nextInt();
		
			if(numero % 2 == 0 ) {
				System.out.println("O número que você digitou é par");
				}
			else if(numero % 2 == 1) {
				System.out.println("O número que você digitou é impar");
				}
	}
}
