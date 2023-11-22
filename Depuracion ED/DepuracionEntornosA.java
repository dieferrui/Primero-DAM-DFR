import java.util.Scanner;

public class DepuracionEntornosA {

    public static void main(String[] args) {
        
        // JavaApplication10();
        // JavaApplication11();
        // JavaApplication12();
        // JavaApplication13();
        // JavaApplication14();
        // JavaApplication15();
        JavaApplication16();
        
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
            while (j % i != 0) {
                i++;
            }
            
            if (i == j) { 
                System.out.println(j);
            }
        }

        sc.close();
    }

    public static void JavaApplication14() {
        
        Scanner sc = new Scanner(System.in);
        int i;
        int pos = 0, neg = 0; 
        int[] numeros = new int[10]; 
        double sumaPos = 0, sumaNeg = 0; 
            
        System.out.println("Lectura de los elementos del array: ");
        
        for (i = 0; i < 10; i++) {
            System.out.print("numeros[" + i + "]= ");
            numeros[i] = sc.nextInt();
        }
        
        for (i = 0; i < 10; i++) {
            if (numeros[i] > 0) {
                sumaPos += numeros[i];
                pos++;
            } else if (numeros[i] < 0) { 
                sumaNeg += numeros[i];
                neg++;
            }
        }

        //Calcular y mostrar las medias
        if (pos != 0) {
            System.out.println("Media de los valores positivos: " + sumaPos / pos); 
        } else {
            System.out.println("No ha introducido numeros positivos");
        }

        if (neg != 0) {
            System.out.println("Media de los valores negativos: " + sumaNeg / neg);
        } else {
            System.out.println("No ha introducido numeros negativos");
        }

        sc.close();
    }

    public static void JavaApplication15() {
        
        Scanner sc = new Scanner(System.in);
        int N, aux, cifra, numeroCifras = 0;
        double suma;
        
        do {
            System.out.print("Introduce número entero positivo: ");
            N = sc.nextInt();
            
            if (N <= 0) {
                System.out.println("Error. Debe ser un número positivo");
            }
        } while (N <= 0); 
        
        aux = N;

        while (aux != 0) {
            numeroCifras++;
            aux = aux / 10;
        }

        suma = 0; 
        aux = N;

        while (aux != 0) { 
            cifra = aux % 10; 
            suma += Math.pow(cifra, numeroCifras); 
            aux = aux / 10; 
        }

        if (suma != N) { 
            System.out.println("No es narcisista");
        } else {
            System.out.println("Es narcisista");
        }

        sc.close();
    }

    public static void JavaApplication16() {
        
        Scanner entrada = new Scanner(System.in);
        int numfiguras;

        do {
            System.out.print("¿Cuántas figuras quieres? ");
            numfiguras = entrada.nextInt();
        } while (numfiguras < 2);

        int nfiguras = numfiguras;
        int numlinea;

        do {
            System.out.print("¿Cuántos asteriscos quieres? ");
            numlinea = entrada.nextInt();
        } while (numlinea < 2);

        int numespacios = 0;
        int posasterisco ;
        int nespacios;

        while (numlinea > 0) {
            
            numfiguras = nfiguras;

            while (numfiguras > 0) {

                posasterisco = numlinea;

                while (posasterisco-- > 0) {
                    System.out.print("*");
                }
                
                nespacios = numespacios;
                
                while (nespacios-- > 0) {
                    System.out.print(" ");
                }
        
                if (numfiguras > 1) {
                    System.out.print("||");
                }
                
                numfiguras = numfiguras - 1;
            }

            System.out.println("");
            numlinea = numlinea - 1;
            numespacios = numespacios + 1;
        }

        entrada.close();
    }
}
