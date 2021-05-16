import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
        public static void main(String[] args) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

                Scanner sc = new Scanner(System.in);
                System.out.println("Ingrese una fecha con formato: \"yyyy-MM-dd\" ");
                try {
                        Date fecha = sdf.parse(sc.next());
                        System.out.println("fecha = " + fecha);
                        System.out.println("sdf.format(fecha) = " + sdf.format(fecha));

                        Date fecha2= new Date();
                        //Comparacion de fechas mediante metodos after / before / equals
                        if (fecha.after(fecha2)){
                                System.out.println("Fecha del usuario es superior a fecha2");
                        } else if (fecha.before(fecha2)){
                                System.out.println("Fecha del usuario es anterior que fecha2");
                        } else if (fecha.equals(fecha2)){
                                System.out.println("Fecha del usuario es igual que Fecha2");
                        }

                        //Comparacion de fechas mediante metodo compareTo
                        //Si el resultado del compateTo es superior a 0
                        //quiere decir que es mayor si no es menor
                        if (fecha.compareTo(fecha2) > 0){
                                System.out.println("CompareTo: Fecha del usuario es superior a fecha2");
                        } else if(fecha.compareTo(fecha2)<0){
                                System.out.println("CompareTo: Fecha del usuario es inferios a fecha2");
                        } else if (fecha.compareTo(fecha2 ) == 0){
                                System.out.println("CompareTo: Fecha del usuario es igual a fecha2");
                        }
                } catch (ParseException e) {
                        System.err.println("La fecha tiene un formato incorrecto: " + e.getMessage());
                        System.err.println("El formato de fecha debe ser \"yyyy-MM-dd\"");
                        //System.exit(1);
                        main(args);
                }
        }
}
