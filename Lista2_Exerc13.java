/* Nome do Aluno: Ketsa Aryane de Amar Sousa
* RA:32317601
* Nome do Programa: Faça um programa que some os números de 1 a 100 e imprima
somente o valor total da soma
* Data:18/05/23
*/

public class Lista2_Exerc13 {
    
    public static void main(String[] args) {
        int soma = 0; 
        int i = 1;

       
        while (i <= 100){
            soma = i + soma;
            i= i + 1;
            System.out.println(soma);
        }
        
    }
}


