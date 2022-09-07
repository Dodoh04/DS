
package botao;

import java.util.Scanner;


public class sex {
    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        int sex;
        int masc = 0;
    
       
         for(int pessoa = 0; pessoa < 10; pessoa++){
        System.out.println("1. Masculino ou 2. Feminino");
        sex = grava.nextInt(); 
        
        if(sex == 1){
            masc++;
        }
        
        //CRIAR BOTÃO DE SAIR
       }
         System.out.println(masc + " destas pessoas são do sexo masculino.");
    }
}
