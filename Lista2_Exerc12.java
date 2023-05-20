/* Nome do Aluno: Ketsa A. de Amar Sousa
* RA: 32317601
* Nome do Programa: Faça um programa que exiba todos os números pares a 
partir de 0 até que encontre um múltiplo de 7 (utilize 
do/while) 
* Data:17/05/23 
*/




public class Lista2_Exerc12 {

    public static void main(String[] args) {

        int numero = 0;
    


        do {
            if ( numero % 2 == 0){
                System.out.println(numero);
            }
        
            numero += 2;
        }while (numero % 7 != 0);
        
    }
    
}

