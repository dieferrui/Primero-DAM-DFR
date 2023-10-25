import java.util.Scanner;

public class PrecioTarta {

    public static void main(String[] args) {

        double precioBase = 0d;
        double precioNata = 0d;
        double precioNombre = 0d;
        Scanner entradaTec = new Scanner(System.in);
        String choco = "";
        String nombreTarta = "";
        String sabor = "";

        while (true) {
            System.out.println("Escoja el sabor de su tarta: manzana, fresa o chocolate.");
            sabor = System.console().readLine();

            if (!sabor.equals("fresa") && !sabor.equals("manzana") && !sabor.equals("chocolate")) {
                System.out.println("Introduzca un sabor válido.");
                continue;
            } else {
                switch (sabor) {
                case "manzana":
                    precioBase = 18.0d;
                    break;
                case "fresa":
                    precioBase = 16.0d;
                    break;
                case "chocolate":
                    while (true) {
                        System.out.println("Escoja el tipo de chocolate: blanco o negro.");
                        choco = entradaTec.nextLine();

                        if (!choco.equals("blanco") && !choco.equals("negro")) {
                            System.out.println("Introduzca un sabor de chocolate válido.");
                            continue;
                        } else {
                            if (choco.equals("blanco")) {
                                precioBase = 15.0d;
                            } else {
                                precioBase = 14.0d;
                            }
                            break;
                        }
                    }
                }
                break;
            }
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
            System.out.print("Escriba el nombre de la tarta: ");
            nombreTarta = entradaTec.nextLine();
        }

        System.out.println("Tarta de " + sabor + " " + choco + ": " + precioBase + "$.");
        if (nata.equals("si")) {
            System.out.println("Con nata: 2,50$.");
        }
        if (nombre.equals("si")) {
            System.out.println("Con nombre " + nombreTarta + ": 2,75$.");
        }
        System.out.println("Total: " + (precioBase + precioNata + precioNombre) + "$.");

        System.out.println("¿Desea confirmar el pedido (Y/N): ");
        String confirmaPed = entradaTec.nextLine();

        if (confirmaPed.equals("Y")) {
            System.out.println("Gracias por su pedido. Su tarta estará lista pronto.");
        } else {
            System.out.println("Sentimos que no quiera confirmar el pedido. Vuelva pronto.");
        }

        entradaTec.close();
    }
}
