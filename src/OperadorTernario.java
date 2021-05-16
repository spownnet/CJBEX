import java.util.Scanner;

public class OperadorTernario {
        public static void main(String[] args) {
//                String variable = 7==8? "si es verdadero": "si es falso";
//                System.out.println("variable = " + variable);

                double mate = 0.0;
                double cien = 0.0;
                double hist = 0.0;

                String estado = "";

                Scanner sc = new Scanner(System.in);
                System.out.println("Introduzca la nota de Matematica de 1.00 a 5.00: ");
                mate = sc.nextDouble();
                System.out.println("Introduzca la nota de Ciencia de 1.00 a 5.00: ");
                cien = sc.nextDouble();
                System.out.println("Introduzca la nota de Historia de 1.00 a 5.00: ");
                hist = sc.nextDouble();

                double nota = (mate + cien + hist)/3;


                estado = nota >= 3.00? "Aprobado": "Rechazado";
                System.out.println("Su promedio = " + nota);
                System.out.println("Estado = " + estado);

        }
}
