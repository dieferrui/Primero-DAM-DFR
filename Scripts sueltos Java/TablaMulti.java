public class TablaMulti {

    public static void main(String[] args) {

        System.out.println("Introduzca qué tabla del 1 al 10 desea visualizar: ");
        int tabla = Integer.parseInt(System.console().readLine());

        switch (tabla) {
            case 1:
                Tabla1(); break;
            case 2:
                Tabla2(); break;
            case 3:
                Tabla3(); break;
            case 4:
                Tabla4(); break;
            case 5:
                Tabla5(); break;
            case 6:
                Tabla6(); break;
            case 7:
                Tabla7(); break;
            case 8:
                Tabla8(); break;
            case 9:
                Tabla9(); break;
            case 10:
                Tabla10(); break;
            default:
            System.out.println("No conozco esa tabla."); break;
        }
    }

    public static void Tabla1() {

        int total = 0;
        System.out.println("Tabla del 1:");

        for (int i = 1; i <= 10; i++) {
            total = 1 * i;
            System.out.println("1 por " + i + " es igual a " + total);
        }
    }

    public static void Tabla2() {

        int total = 0;
        System.out.println("Tabla del 2:");

        for (int i = 1; i <= 10; i++) {
            total = 2 * i;
            System.out.println("2 por " + i + " es igual a " + total);
        }
    }

    public static void Tabla3() {

        int total = 0;
        System.out.println("Tabla del 3:");

        for (int i = 1; i <= 10; i++) {
            total = 3 * i;
            System.out.println("3 por " + i + " es igual a " + total);
        }
    }

    public static void Tabla4() {

        int total = 0;
        System.out.println("Tabla del 4:");

        for (int i = 1; i <= 10; i++) {
            total = 4 * i;
            System.out.println("4 por " + i + " es igual a " + total);
        }
    }

    public static void Tabla5() {

        int total = 0;
        System.out.println("Tabla del 5:");

        for (int i = 1; i <= 10; i++) {
            total = 5 * i;
            System.out.println("5 por " + i + " es igual a " + total);
        }
    }

    public static void Tabla6() {

        int total = 0;
        System.out.println("Tabla del 6:");

        for (int i = 1; i <= 10; i++) {
            total = 6 * i;
            System.out.println("6 por " + i + " es igual a " + total);
        }
    }

    public static void Tabla7() {

        int total = 0;
        System.out.println("Tabla del 7:");

        for (int i = 1; i <= 10; i++) {
            total = 7 * i;
            System.out.println("7 por " + i + " es igual a " + total);
        }
    }

    public static void Tabla8() {

        int total = 0;
        System.out.println("Tabla del 8:");

        for (int i = 1; i <= 10; i++) {
            total = 8 * i;
            System.out.println("8 por " + i + " es igual a " + total);
        }
    }

    public static void Tabla9() {

        int total = 0;
        System.out.println("Tabla del 9:");

        for (int i = 1; i <= 10; i++) {
            total = 9 * i;
            System.out.println("9 por " + i + " es igual a " + total);
        }
    }

    public static void Tabla10() {

        int total = 0;
        System.out.println("Tabla del 10:");

        for (int i = 1; i <= 10; i++) {
            total = 10 * i;
            System.out.println("10 por " + i + " es igual a " + total);
        }
    }
}
