public class Main {

	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
	
		System.out.println("Digite um número: ");
			double numeroUm = ref.nextDouble();
			
		System.out.println("Digite outro número: ");
			double numeroDois = ref.nextDouble();
			
		double soma = numeroUm + numeroDois;
			
		System.out.println("A soma do número "+ numeroUm +" + "+ numeroDois + " é igual a: " + soma);
	}
}
