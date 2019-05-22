class ExercicioX {

    public static void main(String[] args) {

    			/*
			 * Imprima todos os números de 150 a 300.
			 * 
			 */

			System.out.println("Com for");
			for (int i = 150; i <= 300; i++) {
				System.out.print(i + " ");
			}

			System.out.println("\ncom while");
			int x = 150;
			while (x <= 300) {
				System.out.print(x + " ");
				x++;
			}

			System.out.println("\ncom do-while");
			x = 150;
			do {
				System.out.print(x + " ");
				x++;
			} while (x <= 300);


			/*
			 * Imprima a soma de 1 até 1000 - usando a técnica de Gauss.
			 * total = n (a1 + an)/2.
			 * a1 é o primeiro termo,
	           an é o último termo e
	           n é o número de termos da PA
			 */
			
			System.out.println("\n\n---apenas a soma dos números de 1 a 1000, usando a técnica de Gauss ---");
			int total = ((1+1000)* 1000)/2;
			System.out.println(total);

			System.out.println("\n\n---soma de 1 até 100 (outra forma) -------");

			int resultado = 0;
			int ultimoValor;
			for (int a = 1; a <= 1000; a++) {
				ultimoValor = resultado;
				resultado += a;
				System.out.println(ultimoValor + "+" + a + "=" + resultado);
			}

		
			/*
			 * Imprima todos os múltiplos de 3, entre 1 e 100.
			 */

			System.out.println("\nImprima todos os múltiplos de 3, entre 1 e 100");

			for (int i = 0; i <= 100; i++) {
				if (i % 3 == 0) {
					System.out.println(i);
				}
			}

			/*
			 * Imprima os fatoriais de 1 a 10
			 * 
			 * Fatorial de n é o produto de todos os números menores ou menores q n. Representa-se n!
			 * 
			 * 1! = 1
			 * 2! = 2 * 1
			 * 3! = 3 * 2 * 1
			 * 4! = 4 * 3 * 2 * 1
			 * 5! = 5 * 4 * 3 * 2 * 1
			 * ... até chegar em 10!
			 */

			System.out.println("\nImprima os fatoriais de 1 a 5");

			int fatorial = 1;
			for (int n = 1; n <= 5; n++) {
				fatorial = fatorial * n;
				System.out.println("Fatorial de " + n + " = " + fatorial);
			}

			
			/*
			 * Imprima os primeiros números da série de Fibonacci até passar de 100
			 * 
			 * Obs:  essa sequência é formada somando cada numeral com o numeral que o antecede: 
			 * 1, 1, 2, 3, 5, 8, 13, ...
			 */

			System.out.println("\nFibonacci");

			int a = 1, b = 1;
			while (b <= 200) {
				a = a + b;
				System.out.print(" " + b);
				b = a - b;

			}

			/*
			 * dada uma variável x com algum valor inteiro, temos um novo x de acordo com a
			 * seguinte regra: se x é par, x = x / 2 se x é impar, x = 3 * x + 1 imprime x
			 */
			System.out.println("\n\nX par ou ímpar");

			x = 13; // CONSIDERANDO QUE O VALOR DE X SEJA 13
			int y = 0;
			
			while (x != 1) {

				if (x % 2 == 0) {
					y = x / 2;
				} else {
					y = 3 * x + 1;
				}
				

				System.out.println("x: " + x + " ");
				System.out.println("y: " +y  + " ");
				x = y;
			}
			
			/*
			 * Imprima a seguinte tabela, usando fors encadeados
			 */
			
			System.out.println("\nImprima a seguinte tabela, usando fors encadeados");
			for ( a = 0; a < 5; a++) {
		        for ( b = 1; b <= a; b++) {
		            System.out.print(a * b + " " );
		        }
		        System.out.println(" ");
		    }
		}
}


