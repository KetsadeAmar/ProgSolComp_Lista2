/* Nome do Aluno: Ketsa Aryane de Amar Sousa
* RA:32317601
* Nome do Programa:Faça um programa que determine o fatorial de um número. Para
este problema, tem-se como entrada o valor do número do qual
se deseja calcular o fatorial. O fatorial de 0 é igual a 1. O
fatorial de um número N (N!) é definido conforme a seguir
(utilize for):
i. N! = 1 * 2 * 3 * 4 * ... * (N-1) * N 
* Data:18/05/23
*/


import java.util.Scanner;

public class Lista2_Exerc18 {

    public static void main(String[] args) {
        
        System.out.println("Programa Para Calcular Fatorial");
        
        int fatorial = 1;
        int n;
        int i;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite valor de n: " );
        n = teclado.nextInt();
        teclado.close();

        for (i = 1; i <= n; i = i + 1) {
            fatorial = fatorial * i; 
        }

        System.out.println("O fatorial de " + n + " é " + fatorial); 
    


        
    }
     


    
}

