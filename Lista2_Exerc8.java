/* Nome do Aluno: Ketsa A. de Amar Sousa
* RA:32317601
* Nome do Programa: Crie um programa que lê um número entre 1 e 12, correspondendo 
a um dos meses do ano onde o mês 1 é Janeiro e 12 é dezembro. 
Ao final, o programa deve imprimir uma mensagem identificando, 
com base no número digitado, o nome do mês e a estação.
deles. 
* Data: 18/05/23
*/

import java.util.Scanner;
public class Lista2_Exerc8 {
    public static void main(String[] args) {

        int a;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o mês " );
        a = teclado.nextInt();
        teclado.close();

        switch (a){
            case 1: System.out.println("Janeiro - Verão");
            break;
            case 2: System.out.println("Fevereiro - Verão");
            break;
            case 3: System.out.println("Março - Outono");
            break;
            case 4: System.out.println("Abril - Outono");
            break;
            case 5: System.out.println("Maio - Outono");
            break;
            case 6: System.out.println("Junho - Inverno");
            break;
            case 7: System.out.println("Julho - Inverno");
            break;
            case 8: System.out.println("Agosto - Inverno");
            break;
            case 9: System.out.println("Setembro - Primavera");
            break;
            case 10: System.out.println("Outubro - Primavera");
            break;
            case 11: System.out.println("Novembro - Primavera");
            break;
            case 12: System.out.println("Dezembro - Verão");
            break;
            default: System.out.println("Não existe esse mês");
        }
        
    }
    
}


