/* Nome do Aluno: Ketsa A. de Amar Sousa
* RA:32317601
* Nome do Programa: Faça um programa que receba o valor da venda, escolha a 
condição de pagamento no menu e mostre o total da venda final 
conforme condições a seguir:
Venda a Vista - desconto de 10%
Venda a Prazo 30 dias - desconto de 5%
Venda a Prazo 60 dias - mesmo preço
Venda a Prazo 90 dias - acréscimo de 5%
Venda com cartão de débito - desconto de 8%
Venda com cartão de crédito - desconto de 7%
* Data: 18/05/23
*/


import java.util.Scanner;
public class Lista2_Exerc9 {
    public static void main(String[] args) {

        double venda;
        int a;


        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o valor da venda");
        venda = teclado.nextDouble();
        System.out.println(" Selecione a opção de pagamento");
        System.out.println("1- Venda a Vista - desconto de 10%");
        System.out.println("2- Venda a Prazo 30 dias - desconto de 5%");
        System.out.println("3- Venda a Prazo 60 dias - mesmo preço");
        System.out.println("4- Venda a Prazo 90 dias - acréscimo de 5%");
        System.out.println("5- Venda com cartão de débito - desconto de 8%");
        System.out.println("6- Venda com cartão de crédito - desconto de 7%");
        a = teclado.nextInt();
        teclado.close();

        switch (a){
            case 1: venda = venda - (venda * 0.10);
            System.out.println("O valor da venda é R$"+ venda);
            break;
            case 2: venda = venda - (venda * 0.05);
            System.out.println("O valor da venda é R$"+ venda);
            break;
            case 3:System.out.println("O valor da venda é R$"+ venda);
            break;
            case 4: venda = venda + (venda * 0.05);
            System.out.println("O valor da vendaé R$"+ venda);
            break;
            case 5: venda = venda - (venda * 0.08);
             System.out.println("O valor da venda é R$"+ venda);
            break;
            case 6: venda = venda - (venda * 0.07);
            System.out.println("O valor da venda é R$"+ venda);
            break;
            default: System.out.println("Não existe essa opção");
            

        }


        
    }
    
}




    

