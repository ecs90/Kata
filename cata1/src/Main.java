import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserte un mes y un año en el formato mm-yyyy");
        String fecha = scanner.nextLine();
        System.out.println(getDiaSemana(fecha));
    }

    public static final boolean getDiaSemana(String fecha) {
        String Valor_dia = null;
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaIngresada = null;
        try {
            fechaIngresada = df.parse("13-" + fecha);
        } catch (ParseException e) {
            System.err.println("No se ha podido parsear la fecha.");
            e.printStackTrace();
        }
        GregorianCalendar fechaCalendario = new GregorianCalendar();
        fechaCalendario.setTime(fechaIngresada);
        int diaSemana = fechaCalendario.get(Calendar.DAY_OF_WEEK);
        //La semana esta en formato dom = 1, viernes = 6
        if (diaSemana == 6)
            return true;
        return false;
    }
}