/* Nome do Aluno: Ketsa A. de Amar Sousa
* RA:32317601
* Nome do Programa: Faça um programa que leia dois números A e B e imprima o maior 
deles. 
* Data: 17/05/23
*/

import java.util.Scanner;

public class Lista2_Exerc1 {
    public static void main(String[] args) throws Exception {
        int a;
        int b;
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite um número inteiro: " );
        a = teclado.nextInt();
        System.out.println("Digite outro número inteiro: " );
        b = teclado.nextInt();
        teclado.close();

        if (a > b) {
            System.out.println("O número maior é: " + a);
        }
        else{
            System.out.println("O número maior é: " + b);
        }

    }
}
    

