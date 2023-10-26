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
        final String FRESA = "fresa";
        final String MANZA = "manzana";
        final String CHOCO = "chocolate";
        final String CH_BLANCO = "blanco";
        final String CH_NEGRO = "negro";

        while (true) {
            System.out.println("Escoja el sabor de su tarta: manzana, fresa o chocolate.");
            sabor = System.console().readLine();

            if (!FRESA.equalsIgnoreCase(sabor) && !CHOCO.equalsIgnoreCase(sabor) && !MANZA.equalsIgnoreCase(sabor)) {
                System.out.println("Introduzca un sabor válido.");
            } else {
                switch (sabor) {
                case MANZA:
                    precioBase = 18.0d;
                    break;
                case FRESA:
                    precioBase = 16.0d;
                    break;
                case CHOCO:
                    while (true) {
                        System.out.println("Escoja el tipo de chocolate: blanco o negro.");
                        choco = entradaTec.nextLine();

                        if (!CH_BLANCO.equalsIgnoreCase(choco) && !CH_NEGRO.equalsIgnoreCase(choco)) {
                            System.out.println("Introduzca un sabor de chocolate válido.");
                        } else {
                            if (choco.equalsIgnoreCase(CH_BLANCO)) {
                                precioBase = 15.0d;
                            } else {
                                precioBase = 14.0d;
                            }
                            break;
                        }
                    }
                    break;
                }
                break;
            }
        }

        System.out.println("¿Quiere nata? (Y/N): ");
        String nata = entradaTec.nextLine();
        if (nata.equalsIgnoreCase("Y")) {
            precioNata = 2.50d;
        }

        System.out.println("¿Quiere nombre? (Y/N): ");
        String nombre = entradaTec.nextLine();
        if (nombre.equalsIgnoreCase("Y")) {
            precioNombre = 2.75d;
            System.out.print("Escriba el nombre de la tarta: ");
            nombreTarta = entradaTec.nextLine();
        }

        System.out.println("Tarta de " + sabor + " " + choco + ": " + precioBase + "$.");
        if (nata.equalsIgnoreCase("Y")) {
            System.out.println("Con nata: 2,50$.");
        }
        if (nombre.equalsIgnoreCase("Y")) {
            System.out.println("Con nombre " + nombreTarta + ": 2,75$.");
        }
        System.out.println("Total: " + (precioBase + precioNata + precioNombre) + "$.");

        System.out.println("¿Desea confirmar el pedido (Y/N): ");
        String confirmaPed = entradaTec.nextLine();

        if (confirmaPed.equalsIgnoreCase("Y")) {
            System.out.println("Gracias por su pedido. Su tarta estará lista pronto.");
        } else {
            System.out.println("Sentimos que no quiera confirmar el pedido. Vuelva pronto.");
        }

        entradaTec.close();
    }
}
