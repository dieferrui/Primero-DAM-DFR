public class BilleteTren {

    public static void main(String[] args) {

        int tipoBillete = 0;
        double precioViaje = 0d;
        int tarjeta = 0;
        double precioFinal = 0d;

        do {
            System.out.println("Introduzca su tipo de billete:\n1. Sencillo.\n2. Ida y vuelta.");
            tipoBillete = Integer.parseInt(System.console().readLine());

            System.out.print("Introduzca la distancia (en km) entre el origen y destino: ");
            int distancia = Integer.parseInt(System.console().readLine());

            switch (tipoBillete) {
                case 1: 
                    precioViaje = 0.33d * distancia; 
                    break;
                case 2: 
                    precioViaje = 0.26d * 2 * distancia; 
                    break;
                default: 
                    System.out.println("Tipo de billete inválido.");
            }
        } while (tipoBillete != 1 && tipoBillete != 2);

        System.out.println("¿Posee usted tarjeta interraíl?\n1. Sí.\n2. No.");
        tarjeta = Integer.parseInt(System.console().readLine());


        if (tarjeta == 1) {
            precioFinal = precioViaje * 0.75;
        } else if (precioViaje >= 110) {
            precioFinal = precioViaje * 0.90;
        } else if (precioViaje >= 50) {
            precioFinal = precioViaje * 0.95;
        } else {
            precioFinal = precioViaje;
        }

        System.out.printf("El precio de su billete es de %.2f euros.", precioFinal);
    }
}
