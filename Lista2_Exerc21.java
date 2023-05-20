/* Nome do Aluno: Ketsa A. de Amar Sousa
* RA: 32317601
* Nome do Programa: Escreva um programa que, dado um número positivo digitado 
pelo o usuário mostre a tabuada de todos os números de 1 até o 
número digitado. (utilize for)
* Data: 19/05/23
*/




import java.util.Scanner;

public class Lista2_Exerc21 {

    public static void main(String[] args) {
        
    int numero; 
    int i= 1;
    int resultado;
    int j = 1;

    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite um número positivo: " );
    numero = teclado.nextInt();

    for (i = 1; i <= numero; i++) {
        System.out.println("Tabuada do número " + i + " : ");
        for(j = 1; j <= 10; j++){
            resultado = i * j;
        System.out.println(i + " x " + j + " = " + resultado );
        }
        
    }
    
    }

    
}
