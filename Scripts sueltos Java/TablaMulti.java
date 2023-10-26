public class TablaMulti {

    public static void main(String[] args) {

        System.out.println("Introduzca qué tabla del 1 al 10 desea visualizar: ");
        int tabla = Integer.parseInt(System.console().readLine());

        TablaMul(tabla);
    }
    
    public static void TablaMul(int tabla) {

        int total = 0;
        System.out.println("Tabla del " + tabla + ":");

        for (int i = 1; i <= 10; i++) {
            total = tabla * i;
            System.out.println(tabla + " por " + i + " es igual a " + total);
        }
    }
}
