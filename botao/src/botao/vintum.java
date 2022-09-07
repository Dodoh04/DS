
package botao;

import java.util.Scanner;


public class vintum {
     public static void main(String[] args) {
         Scanner grava = new Scanner(System.in);
         int idade;
         String nome;
         int sexo;

         
        for (int pessoa = 0; pessoa < 20; pessoa++){
            System.out.println("Qual seu nome? ");
            nome = grava.next(); 
            System.out.println("Qual sua idade? ");
            idade = grava.nextInt(); 
            System.out.println("Qual seu sexo? ");
            System.out.println("1. Masculino ou 2. Feminino");
            sexo = grava.nextInt(); 
            
            if(idade >= 21 && sexo ==1){
            System.out.println(nome);
            }
        }
       
      
    }
}
