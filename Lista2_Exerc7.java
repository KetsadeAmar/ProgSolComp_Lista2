/* Nome do Aluno: Ketsa A. de Amar Sousa
* RA:32317601
* Nome do Programa: Faça um programa calcula o total de uma hospedagem em um 
hotel. Ele cobra R$ 60.00 a diária e mais uma taxa de serviço:
R$ 5.50 por diária, se o número de diárias for maior que 15;
R$ 6.00 por diária, se o número de diárias for igual a 15;
R$ 8.00 por diária, se o número de diárias for menor que 15.
* Data: 17/05/23
*/

import java.util.Scanner;
public class Lista2_Exerc7 {
    public static void main(String[] args) {
        int diaria;
        int valor_diaria = 60;
        double taxa_1 = 5.50;
        double taxa_2 = 6.00;
        double taxa_3 = 8.00;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe quantas diarias: " );
        diaria = teclado.nextInt();

        if (diaria > 15 ){
            diaria = (int) (valor_diaria * taxa_1 * diaria);
            System.out.println("O valor total das diarias é " + diaria );
        }
        else if (diaria == 15 ){
            diaria = (int) (valor_diaria * taxa_2 * diaria);
            System.out.println("O valor total das diarias é " + diaria );

        }
        else if (diaria < 15){
            diaria = (int) (valor_diaria * taxa_3 * diaria);
            System.out.println ("O valor total das diarias é " + diaria);
        }
        teclado.close();
    }
    
}


