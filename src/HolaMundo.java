import java.util.Locale;

public class HolaMundo {

    public static void main(String[] params){

        String saludar = "Hola Mundo desde Java";
       System.out.println("Hola Mundo desde Java");
        System.out.println("saludar.toUpperCase(Locale.ROOT) = " + saludar.toUpperCase(Locale.ROOT));

        int numero = 10;
        int numero2 = 5;


        boolean valor = true;

        if (valor) {
            System.out.println("numero = " + numero);
            numero = 11;
        }
        System.out.println("numero2 = " + numero2);

        var numero3 = "15";

        String nombre;

        nombre = "Edgardo";

        if (numero > 10){
            nombre = "Nazir";
        }

        System.out.println("nombre = " + nombre);

    }

}
