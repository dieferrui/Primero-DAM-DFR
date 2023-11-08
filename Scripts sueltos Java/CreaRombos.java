public class CreaRombos {

    public static void main(String[] args) {

        System.out.print("Introduzca el número de líneas desde el inicio hasta la mitad del rombo: ");
        int n = Integer.parseInt(System.console().readLine());
        
        /*
        Tal y como está declarado el rombo en el ejercicio, la línea
        central constará de n * 2 - 1 almohadillas, que también es el
        número total de líneas.
        */
        
        int clave = n * 2 - 1;

        // Esta función construye la pirámide

        for (int fil = 0; fil < n; fil++) {

            for (int col = 1; col < clave + 1; col++) {

                if (col < (n - fil) || col > (n + fil)) {
                    System.out.print("·");
                } else {
                    System.out.print("@");
                }
            }

            System.out.println();
        }
        
        // La siguiente función debe construir el resto del rombo

        /*
        for (int fil = (n - 1); fil >= 1; n--) {

            for (int col = 1; col < clave + 1; col++) {

                if (col )
            }
        }
        */
        
    }
}
