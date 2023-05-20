/* Nome do Aluno: Ketsa A. de Amar Sousa
* RA:32317601
* Nome do Programa: Faça um programa que leia um número inteiro e mostre uma 
mensagem indicando se este número é par ou ímpar e se é 
positivo ou negativo.
deles. 
* Data: 17/05/23
*/

import java.util.Scanner;
public class Lista2_Exerc4 {
    public static void main(String[] args) {
        
        int numero;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número inteiro: " );
        numero = teclado.nextInt();
        teclado.close();

        if (numero / 2 == 0 ){
            System.out.println("O número " + numero + " é par");
        }
        else {
            System.out.println("O número " + numero + " é impar");
        }
        if (numero >= 0){
            System.out.println("O número " + numero + " é positivo");
        }
        else {
            System.out.println("O número " + numero + " é negativo");
        }
    }

    
}
