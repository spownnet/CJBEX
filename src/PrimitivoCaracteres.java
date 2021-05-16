public class PrimitivoCaracteres {
    public static void main(String[] args) {

        var caracter = '\u0024';
        var decimal = 36;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("caracter = decimal: " + (caracter==decimal));

        char simbolo = '$';
        char espacio = '\u0020'; // Simbolo espacio
        char retroceso = '\b'; // caracter especial para eliminar un caracter
        char tabulacion = '\t'; //Caracter especial tabulacion
        char nuevaLinea = '\n'; //Caracter especial salto de linea
        char retornoCarro = '\r'; //Caracter especial retorno de carro.

        System.out.println("simbolo = " + simbolo);
        System.out.println("caracter =  simbolo: " + (caracter== simbolo));

        System.out.println("char corresponde en bytes a: " + System.lineSeparator() + Character.BYTES);
        System.out.println("char corresponde en bites a:" + tabulacion + Character.SIZE);
        System.out.println("el valor minimo de un char es: " + Character.MIN_VALUE);
        System.out.println("el valor maximo de un char es: " + Character.MAX_VALUE);


    }
}
