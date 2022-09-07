
package botao;


public class ConvertGraus {
     public static void main(String[] args) {
        //C = 5*(F-32)/9
         for(int f = 50; f<151; f++){
        System.out.println(f + "°F é igual a " + 5*(f-32)/9 + "°C");
       }
    }
}
