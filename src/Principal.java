import java.util.Scanner;
/*
 * Primeira classe java. Projeto inicial EaD.
 */
public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Primeiro projeto Java!");
		/*
		 * Tipos de variáveis do Java
		 */
		int valor = 1;
		double casaDecimal = 0.0;
		char caractere = 'A';
		float casaDecimalFloat = 0.0f;
		long inteiroLongo = 3L;
		byte binario;
		boolean booleano = true;
		
		String cadeiaDeCaracteres = "Cadeia de caracteres";
		
		System.out.println("Valor: " + valor);
		
		//Leitura do teclado do usuário
		Scanner reader = new Scanner(System.in);
		
//		System.out.println("Informe um valor: ");
//		String valorDoUsuario = reader.nextLine();
//		System.out.println("Valor informado pelo usuário: " + valorDoUsuario);
//		
//		System.out.println("Informe sua idade: ");
//		int idade = reader.nextInt();
//		System.out.println("Idade: " + idade);
		
		//Estrutura condicional
//		if (idade > 30 && idade < 60) {
//			System.out.println("Idade maior que 30");
//		} else if (idade > 60) {
//			System.out.println("Idade de aposentadoria");
//		} else {
//			System.out.println("Idade menor que 30");
//		}
		
		for (int i=0; i < 5; i++) {
			System.out.println("Valor do i: " + i);
		}
		
		int contador = 0;
		while (contador < 5) {
			System.out.println("Contador: " + contador);
			contador++;
		}
		
		boolean atendeVariavel = false;
		do {
			if (atendeVariavel) {
				System.out.println("Atende variavel: " + atendeVariavel);
			} else {
				System.out.println("Atende variavel: primeira vez");
			}
		} while (atendeVariavel);
		
		String cadeiaDois = "BRASIL";
		if (!cadeiaDois.equals("ARGENTINA")) {
			System.out.println("BRASIL não é Igual a Argentina");
		}
		
		int[] fiado = new int[3];
		fiado[0] = 35;
		fiado[1] = 30;
		fiado[2] = 90;
		
		for(int i = 0; i < fiado.length; i++) {
			System.out.println("Fiado " + i + " no valor de " + fiado[i]);
		}
	}
	
}
