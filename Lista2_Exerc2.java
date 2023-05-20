/* Nome do Aluno: Ketsa A. de Amar Sousa
* RA:32317601
* Nome do Programa: Construa um programa que receba como entrada três valores A, B 
e C e os imprima em ordem crescente.
deles. 
* Data: 17/05/23
*/
import java.util.Scanner;
public class Lista2_Exerc2 {
    public static void main(String[] args) throws Exception {
        int a;
        int b;
        int c;
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite um número inteiro: " );
        a = teclado.nextInt();
        System.out.println("Digite outro número inteiro: " );
        b = teclado.nextInt();
        System.out.println("Digite outro número: " );
        c = teclado.nextInt();
        teclado.close();

        if (a <= b && b <= c) {
            System.out.println("Os números digitados em ordem crescente são: " + a + "," + b + "," + c);
        }
        else if (a <= c && c <= b){
            System.out.println("Os números digitados em ordem crescente são: " + a + "," + c + "," + b);
        }
        else if (b <= a && a <= c){
            System.out.println("Os números digitados em ordem crescente são: " + b + "," + a + "," + c);
        }
        else if (b <= c && c <= a){
            System.out.println("Os números digitados em ordem crescente são: " + b + "," + c + "," + a);
        }
        else if (c <= a && a <= b){
            System.out.println("Os números digitados em ordem crescente são: " + c + "," + a + "," + b);
        }
        else if (c <= b && b <= a){
            System.out.println("Os números digitados em ordem crescente são: " + c + "," + b + "," + a);
        }


    }
}

    

