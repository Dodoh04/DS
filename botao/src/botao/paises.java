
package botao;


public class paises {
    public static void main(String[] args) {
        double a = 5000000;
        double b = 7000000;
        double porc1, porc2 = 0;
        int ano = 0;
            
        while(a<=b){
        porc1 = a * 0.03;
        a= a + porc1;
        
        porc2 = b * 0.02;
        b = b + porc2;
        
        ano++;
        System.out.println("Valor de A: " + a);
        System.out.println("Valor de B: " + b);
        }
        System.out.println(ano + " anos para o Brasil alcançar a Alemanha.");
    }
}
