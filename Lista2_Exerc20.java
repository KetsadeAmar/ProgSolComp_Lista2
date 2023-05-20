/* Nome do Aluno: Ketsa Aryane de Amar Sousa
* RA:32317601
* Nome do Programa: Escreva um programa que, dada a carga máxima de um elevador e
a quantidade máxima de pessoas digitadas pelo usuário, leia o
peso de cada pessoa, também digitada pelo usuário, que entra
no elevador até que a carga máxima seja atingida ou o número
máximo de pessoas seja atingido (utilize do / while).
* Data:18/05/23
*/

import java.util.Scanner;

public class Lista2_Exerc20 {

    public static void main(String[] args) {

        System.out.println("Programa para Calcular Carga Máxima De Um Elevador");
        
        int quantidade = 0;
        int peso_pessoa;
        int peso_total = 0;

        Scanner teclado = new Scanner (System.in);
        System.out.println("Informe a carga máxima do elevador: " );
        int carga_maxima = teclado.nextInt();
        System.out.println("Informe quantidade máxima de pessoas: " );
        int maximo_pessoas = teclado.nextInt();
        
        
       

        do {
            System.out.println("Informe o peso da pessoa: " );
            peso_pessoa = teclado.nextInt();
            peso_total += peso_pessoa; 
            quantidade++;
        } while (peso_total <= carga_maxima && quantidade < maximo_pessoas);
        
        System.out.println("A quantidade permitida já foi atingida.");
        
        teclado.close();
        
    }

    
}

