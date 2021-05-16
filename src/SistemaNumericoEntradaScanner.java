import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemaNumericoEntradaScanner {
    public static void main(String[] args) {

        System.out.flush();

        //Objeto para leer de consola los valores a convertir
        Scanner input = new Scanner(System.in);

        System.out.println("Introduca el valor numero a Convertir: ");
        //String inputStr = input.nextLine();

        int numeroDecimal = 0;

        try{
            numeroDecimal = input.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Error en el valor ingresado intente de nuevo....");
            main(args);
            System.exit(0);
        }

        //Se muestra el numero Decimal original que introdujo el usuario
        String resultadoDecimal = "numeroDecimal = " + numeroDecimal;

       //Convertir Numero Decimal a numero binario
        String resultadoBinario = "numero binario de numeroDecimal " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

       //Convertir Numero Decimal a numero Octal
        String resultadoOctal = "numero Octal de numeroDecimal " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);

        //Convertir Numero Decimal a Hexadecimal
        String resultadoHexadecimal = "numero Hexadecimal de numeroDecimal " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = resultadoDecimal;
               mensaje += "\n"+resultadoBinario;
               mensaje += "\n"+resultadoOctal;
               mensaje += "\n"+resultadoHexadecimal;

        //Imprimir resultados de la conversion
        System.out.println("============================");
        System.out.println("mensaje : \n" + mensaje);
        System.out.println("============================");

    }
}

