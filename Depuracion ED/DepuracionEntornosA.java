import java.util.Scanner;

public class DepuracionEntornosA {

    public static void main(String[] args) {
        
        // JavaApplication10();
        // JavaApplication11();
        // JavaApplication12();
        JavaApplication13();
        
    }

    public static void JavaApplication10() {
        
        Scanner sc;
        sc = new Scanner(System.in);
        double radio, longitud, area;
        
        System.out.println("Introduce radio de la circunferencia:");
        radio = sc.nextDouble();
        
        longitud = 2 * Math.PI * radio;
        area = Math.PI * Math.pow(radio, 2);
        
        System.out.println("Longitud de la circunferencia -> " + longitud); 
        System.out.println("Area de la circunferencia -> " + area);
        
        sc.close();
    }

    public static void JavaApplication11() {
        
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.print("Introduzca valor de N: ");
        N = sc.nextInt();
        
        System.out.println("Primera cifra de " + N + " -> " + (N / 100));
        System.out.println("Cifra central de " + N + " -> " + ((N % 100) / 10));
        System.out.println("Última cifra de " + N + " -> " + (N % 10));

        sc.close();
    }

    public static void JavaApplication12() {
        
        int i, suma = 0, n;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un número: ");
        n = sc.nextInt();
        
        for (i = 1; i < n; i++) { 
            if (n % i == 0) {
                suma += i; 
            }
        }
        
        if (suma == n) { 
            System.out.println("Perfecto");
        } else {
            System.out.println("No es perfecto");
        }

        sc.close();
    }

    public static void JavaApplication13() {
        
        int N, i, j;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.print("Introduce un numero > 0: ");
            N = sc.nextInt();
        } while (N <= 0);
        
        System.out.println("Números primos desde 2 hasta " + N);
        
        for (j = 2; j < N; j++) { 
            i = 2; 
            while (j % i == 0) {
                i++;
            }
            
            if (i != j) { 
                System.out.println(j);
            }
        }

        sc.close();
    }
}
