import java.util.Scanner;

public class PrecioTarta {

    public static void main(String[] args) {

        double precioBase = 0d;
        double precioNata = 0d;
        double precioNombre = 0d;
        Scanner entradaTec = new Scanner(System.in);
        String choco = "";

        System.out.println("Escoja el sabor de su tarta: manzana, fresa o chocolate.");
        String sabor = System.console().readLine();

        switch (sabor) {
            case "manzana":
                precioBase = 18.0d;
                break;
            case "fresa":
                precioBase = 16.0d;
                break;
            case "chocolate":
                System.out.println("Escoja el tipo de chocolate: blanco o negro.");
                choco = entradaTec.nextLine();
                if (choco.equals("blanco")) {
                    precioBase = 15.0d;
                } else {
                    precioBase = 14.0d;
                }
                break;
        }

        System.out.println("¿Quiere nata? Escriba \"si\" o \"no\".");
        String nata = entradaTec.nextLine();
        if (nata.equals("si")) {
            precioNata = 2.50d;
        }

        System.out.println("¿Quiere nombre? Escriba \"si\" o \"no\".");
        String nombre = entradaTec.nextLine();
        if (nombre.equals("si")) {
            precioNombre = 2.75d;
        }

        System.out.println("Tarta de " + sabor + " " + choco + ": " + precioBase + "$.");
        if (nata.equals("si")) {
            System.out.println("Con nata: 2,50$.");
        }
        if (nombre.equals("si")) {
            System.out.println("Con nombre: 2,75$.");
        }
        System.out.println("Total: " + (precioBase + precioNata + precioNombre) + "$.");

        entradaTec.close();
    }
}
