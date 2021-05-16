public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programacion Java";
        String curso2 = new String ("Programacion Java");

        //Comparacion con operador para valores primitivos
        boolean esigual = curso == curso2;
        System.out.println("curso == curso2: " + esigual);

        //Comparacion con el metodo equals del metodo del objetos string
        esigual = curso.equals(curso2);
        System.out.println("curso.equals(curso2): " + esigual);

        //Comparacion con el metodo equialsIgnoreCase del objeto String
        esigual = curso.equalsIgnoreCase(curso2);
        System.out.println("curso.equalsIgnoreCase(curso2): " + esigual);
        
        //Comparacion con operador primitivo == para objetos creados de forma literal
        String curso3 = "Programacion Java";
        esigual = curso == curso3;
        System.out.println("curso == curso3: " + esigual);


    }
}
