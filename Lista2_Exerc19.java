/* Nome do Aluno: Ketsa Aryane de Amar Sousa
* RA:32317601
* Nome do Programa: Um determinado gás duplica seu volume a cada segundo. Dada um
volume inicial, em centímetros cúbicos, digitado pelo usuário
faça um programa que determine o tempo necessário para que
esse volume se torne maior que 1000 centímetros cúbicos.
(utilize while)
* Data:18/05/23
*/

import java.util.Scanner;

public class Lista2_Exerc19{

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("Informe o volume inicial em centímetros cúbicos: " );
        float v_inicial = teclado.nextFloat();
        teclado.close();

        float  tempo = v_inicial /1000 * 2;
        
        while (v_inicial <= 1000){
            System.out.println("O valor final ainda não é maior que 1000 cm³");
            System.out.println("Informe o volume inicial em centímetros cúbicos: " );
            v_inicial = teclado.nextFloat();
            tempo =  v_inicial /1000 * 2;
        }
        System.out.println("o tempo necessário para que o volume se torne maior que 1000 cm³ é " + tempo + " segundos ");


    } 
}
