public class Felicidades {

    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            LocalDate fechaHoy = LocalDate.now();
            Period edad;
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            int añosEdad = 0;
            long diasFaltan = 0;
            long diasPasados = 0;

            System.out.println("Introduzca su fecha de nacimiento con el formato (dd-mm-yyyy): ");
            String fechaUsuario = scan.next();
            LocalDate fechaNacimiento = LocalDate.parse(fechaUsuario, dtf);

            // Calculamos la edad del usuario y se la damos.
            edad = Period.between(fechaNacimiento, fechaHoy);
            añosEdad = edad.getYears();
            System.out.println("A dia de hoy usted tiene " + edad.getYears() + " años.");

            // Calculamos la fecha de cumpleaños del usuario.
            LocalDate fechaCum = fechaNacimiento.plusYears(añosEdad);

            if (fechaCum.isBefore(fechaHoy)) {
                LocalDate nextCum = fechaCum.plusYears(1);
                diasPasados = ChronoUnits.DAYS.between(fechaCum, fechaHoy);
                diasFaltan = ChronoUnits.DAYS.between(nextCum, fechaHoy);
                System.out.printf("Tu cumpleaños ha sido hace %l días.");
                System.out.printf("Faltan %l días para tu cumpleaños", diasFaltan);
            } else if (fechaHoy.isBefore(fechaCum)) {
                diasFaltan = ChronoUnits.DAYS.between(nextCum, fechaHoy);
                horasFaltan = diasFaltan * 24;
                System.out.printf("Faltan %l días, es decir, %l horas, para tu cumpleaños", diasFaltan, horasFaltan);
            } else {
                System.out.println("Hoy es tu cumpleaños. ¡Feliz cumpleaños!");
            }
    }
}
