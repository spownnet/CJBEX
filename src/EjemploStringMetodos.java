import java.util.Locale;

public class EjemploStringMetodos {
    public static void main(String[] args) {
       String nombre = "Edgardo";
        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Edgardo\") = " + nombre.equals("Edgardo"));
        System.out.println("nombre.equals(\"edgardo\") = " + nombre.equals("edgardo"));
        System.out.println("nombre.equalsIgnoreCase(\"edgardo\") = " + nombre.equalsIgnoreCase("edgardo"));
        System.out.println("nombre.compareTo(\"Edgardo\") = " + nombre.compareTo("Edgardo"));
        System.out.println("nombre.compareTo(\"edgardo\") = " + nombre.compareTo("edgardo"));
        System.out.println("nombre.charAt(3) = " + nombre.charAt(3));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));
        System.out.println("nombre.substring(2) = " + nombre.substring(2));
        System.out.println("nombre.substring(0, nombre.length()-2) = " + nombre.substring(0, nombre.length()-2));

        //Segunda parte de metodos String
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\",\".\") = " + trabalenguas.replace("a","."));
        System.out.println("trabalenguas.indexOf(\"a\") = " + trabalenguas.indexOf("a"));
        System.out.println("trabalenguas.lastIndexOf(\"a\") = " + trabalenguas.lastIndexOf("a"));
        System.out.println("trabalenguas.indexOf(\"z\") = " + trabalenguas.indexOf("z"));
        System.out.println("trabalenguas.lastIndexOf(\"z\") = " + trabalenguas.lastIndexOf("z"));
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("t"));
        System.out.println("trabalenguas.startsWith(\"lenguas\") = " + trabalenguas.startsWith("lenguas"));
        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas"));
        System.out.println(" trabalenguas ");
        System.out.println("trabalenguas.trim() = " + trabalenguas.trim());
    }
}
