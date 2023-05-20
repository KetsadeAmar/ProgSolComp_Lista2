/* Nome do Aluno: Ketsa A. de Amar Sousa
* RA: 32317601
* Nome do Programa: Elabore um programa que lê dois valores A e B e os escreve com 
a mensagem: “São múltiplos” ou “Não são múltiplos”. 
* Data: 17/05/2023
*/

import java.util.Scanner;

public class Lista2_Exerc3{
    public static void main(String[] args) {

        int a;
        int b;
        int resto;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número: " );
        a= teclado.nextInt();
        System.out.println("Digite outro número: " );
        b= teclado.nextInt();
        teclado.close();
        

        resto= a / b;

        if (resto == 0){
            System.out.println("Os números são múltiplos");

        }
        else{
            System.out.println("Os números não são múltiplos");
        }
        
    }
}