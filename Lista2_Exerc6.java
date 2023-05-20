/* Nome do Aluno: Ketsa A. de Amar Sousa
* RA:32317601
* Nome do Programa:  Faça um programa para imprimir o conceito de um aluno. O 
conceito é calculado em função da nota do aluno que varia de 0 
a 100. As faixas da correlação são mostradas abaixo:
Nota Conceito
0 a 49 Insuficiente
50 a 64 Regular
65 a 84 Bom
85 100 Ótimo 
* Data: 17/05/23
*/
import java.util.Scanner;
public class Lista2_Exerc6 {
    public static void main(String[] args) {
        int conceito;

        Scanner teclado = new Scanner (System.in);
        System.out.println("Informe o conceito do aluno: " );
        conceito = teclado.nextInt();

        if (conceito <= 49){
            System.out.println("Seu coceito é insuficiente");
        }
        else if (conceito >= 50 && conceito <= 64){
            System.out.println("Seu conceito é regular");
        }
        else if (conceito >= 65 && conceito <= 84){
            System.out.println("Seu conceito é bom");
        }
        else if (conceito >= 85 && conceito <=100){
            System.out.println("Seu conceito é ótimo");
        }
        teclado.close();

    }
    
}

