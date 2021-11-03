package classescanner;

import java.util.Scanner;

public class ClasseScanner {

   
    public static void main(String[] args) {
        //declaração da variavel
        float numero;
        //declaração da classe Scanner, com criação do objeto "Entrada"
        Scanner entrada = new Scanner(System.in);
        
        //Mensagem solicitando ao usuário para digitar um número
        System.out.println("Digite um número: ");
        //armazenando e convertendo o dado que o usuário digitou
        numero = entrada.nextFloat();
        
        System.out.println("Digite um número: ");
        
        //mostrando na tela o número digitado pelo usuário
        System.out.println("O número digitado foi " + numero);
        
               
    }
    
}
