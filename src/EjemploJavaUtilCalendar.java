import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
        public static void main(String[] args) {

                Calendar calendario = Calendar.getInstance();

                //definimos el calendario
                //calendario.set(2020, Calendar.OCTOBER, 23, 14,30, 70);

                calendario.set(Calendar.YEAR, 1983);
                calendario.set(Calendar.MONTH, Calendar.FEBRUARY);
                calendario.set(Calendar.DAY_OF_MONTH, 9);
                calendario.set(Calendar.HOUR_OF_DAY, 20);
                calendario.set(Calendar.MINUTE, 10);
                calendario.set(Calendar.SECOND, 20);

                Date fecha = calendario.getTime();
                System.out.println("fecha sin formato = " + fecha);
                SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd '1'hh'1'mm'1'ss");
                String fechaFormateada = sdf.format(fecha);
                System.out.println("fecha con formato = " + fechaFormateada);

        }
}
