import java.util.Scanner; 

// El programa ya es funcional aunque sólo muestre el IMC sin decimales.

public class CuestionDeFormas {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("¿Cuál es tu peso en kg? ");
        float peso = scan.nextFloat();

        System.out.print("¿Cuál es tu estatura en metros? ");
        float altura = scan.nextFloat();

        float imc = Math.round( peso / Math.pow(altura, 2));

        System.out.print("Tu IMC es: " + imc);
        scan.close();
    }
}
