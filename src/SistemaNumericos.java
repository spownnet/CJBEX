import javax.swing.*;
import java.io.IOException;

public class SistemaNumericos {
    public static void main(String[] args) {


        String numeroStr = JOptionPane.showInputDialog(null, "Introduzaca el valor: ");

        int numeroDecimal = 0;

         try {
             numeroDecimal = Integer.parseInt(numeroStr);
         } catch (NumberFormatException e) {
             JOptionPane.showMessageDialog(null, "Debe ingresar un valor valido");
             main(args);
             System.exit(0);
         }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "numero binario de numeroDecimal = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        //Transformar a nuemero binario la variable numeroDecimal
        System.out.println(resultadoBinario);

        //Se antepone el valor 0b al valor binario para que el compilador comprenda que el valor es binario
        int numeroBinario = 0b111110100;

        System.out.println("numeroBinario = " + numeroBinario);

        //Transforma de numero decima a octal

        String resultadoOctal = "numero Octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);

        //Se ante pone el valor 0 para indicarle al compilador que el valor es un valor Octal
        int numeroOctal = 0764;

        System.out.println("numeroOctal = " + numeroOctal);

        String resultadoHexadecimal = "numero hexadecimal de " + numeroDecimal + " = "+ Integer.toHexString(numeroDecimal);
        //Transformar a numero hexadecimal
        System.out.println(resultadoHexadecimal);

        //Se antepone el valor 0x para indicar al compilador que el valor es un hexadecimal
        int numeroHexadecimal = 0x1f4;

        System.out.println("numeroHexadecimal = " + numeroHexadecimal);

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHexadecimal;


        JOptionPane.showMessageDialog(null, mensaje);


    }
}
