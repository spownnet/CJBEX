public class EjemploStringMetodosArreglos {
    public static void main(String[] args) {
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());
        char[] arreglo = trabalenguas.toCharArray();
        for (int i = 0; i < arreglo.length; i++){
            System.out.println("arreglo[i] = " + arreglo[i]);
        }

        System.out.println("trabalenguas.split(\"a\") = " + trabalenguas.split("a"));
        String[] arregloSplit = trabalenguas.split("a");
        for (int i = 0; i < arregloSplit.length; i++){
            System.out.println("arregloSplit[i] = " + arregloSplit[i]);
        }

        String nombreArchivo = "Alguna.imagen.pdf";
        //no se puede utilizar solo el caracter punto .
        //por que es parte de una palabra reservada en expresiones regulares
        // las opciones son: [.] (caracter especial punto) o \\. (escape)
        String[] arregloSplit2 = nombreArchivo.split("\\.");

        for (int i = 0; i < arregloSplit2.length; i++){
            System.out.println("arregloSplit2[i] = " + arregloSplit2[i]);
        }
        System.out.println("Extension = " + arregloSplit2[arregloSplit2.length-1]);
    }
}
