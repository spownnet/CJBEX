import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
        public static void main(String[] args) {
                Date fecha = new Date();

                System.out.println("fecha = " + fecha);

                SimpleDateFormat dateformat = new SimpleDateFormat("yyyyMMdd");
                SimpleDateFormat timeformat = new SimpleDateFormat("'1'hh'1'mm'1'ss");
                String fechaStr = dateformat.format(fecha);
                String tiempoStr = timeformat.format(fecha);

                long j = 0;
                for (int i = 0; i < 10000000; i++) {
                        j += i;
                }
                System.out.println("j = " + j);

                Date fecha2 = new Date();
                long tiempoFinal = fecha2.getTime() - fecha.getTime();

                System.out.println("Tiempo transcurrido = " + tiempoFinal);

                System.out.println("fechaStr = " + fechaStr);
                System.out.println("tiempoStr = " + tiempoStr);

        }
}
