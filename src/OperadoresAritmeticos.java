import javax.swing.*;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int i = 5, j = 4,suma = i + j;
        System.out.println("suma = " + suma);
        System.out.println("(i+j) = " + (i+j));
        int resta = i - j;
        System.out.println("resta = " + resta);
        System.out.println("(i - j) = " + (i - j));
        
        int multiplicacion = i * j;
        System.out.println("multiplicacion = " + multiplicacion);

        int division = i/j;
        System.out.println("division = " + division);
        
        float division2 = (float)i/j;
        System.out.println("division2 = " + division2);
        
        int resto = i % j;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduza el numero"));
        if (numero % 2 == 0 ){
            System.out.println("Es par el valor = " + numero);
        } else {
            System.out.println("Es inpar el valor = " + numero);
        }

    }
}
