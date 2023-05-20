
/* Nome do Aluno: Ketsa Aryane de Amar Sousa
* RA:32317601
* Nome do Programa: Faça um programa que solicite ao usuário que digite um número
até que ele digite um número menor que 0 (utilize while)
* Data:18/05/23
*/

import java.util.Scanner;

public class Lista2_Exerc16 {

    public static void main(String[] args) {
     Scanner teclado = new Scanner (System.in);

      int numero = -1;
      System.out.println("Digite um número: " );
      numero = teclado.nextInt();
     

        while (numero >= 0){
            System.out.println("Tente novamente");
            System.out.println("Digite um número: " );
            numero = teclado.nextInt();
                    
        }
        teclado.close();
        
               
        

    }
}
