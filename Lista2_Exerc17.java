/* Nome do Aluno: Ketsa A. de Amar Sousa
* RA: 32317601
* Nome do Programa: Faça um programa que imprima os múltiplos negativos de 7, 
superiores a -1000. (utilize do / while)
* Data: 17/05/23
*/


public class Lista2_Exerc17 {

    public static void main(String[] args) {

        // Inicializar o primeiro múltiplo negativo de 7 superior a -1000 

        int numero = -1000;

        do{
            numero -= 7; // Faz a soma para obter o próximo múltiplo negativo
            System.out.println(numero);
        } while (numero <= -1000);

        
    }
    
}
