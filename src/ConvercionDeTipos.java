public class ConvercionDeTipos {

    public static void main(String[] args) {
        //Conversion de tipo String a cualquier tipo primitivo
        String numeroStr = "50";
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "98765.43e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logicoStr = "true";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        //Conversion a tipo Primitivo de String

        int otroNumeroInt = 100;

        System.out.println("otroNumeroInt = " + otroNumeroInt);

        String otroNumeroStr = Integer.toString(otroNumeroInt);

        System.out.println("otroNumeroStr = " + otroNumeroStr);
        
        otroNumeroStr = String.valueOf(otroNumeroInt);

        System.out.println("otroNumeroStr = " + otroNumeroStr);
        
        double otroRealDouble = 1.23456e6;
        System.out.println("otroRealDouble = " + otroRealDouble);
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        otroNumeroStr = String.valueOf(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        //Conversion tipos entre primitivos

        int i =42767;
        short s = (short) i; //marcar error por que i tiene mas bites de s, lo que se hace es aplicar un cast al tipo de dato a convertir
        System.out.println("s = " + s);
        long l = i; //no marca error por que i tienes menos bites que l
        System.out.println("l = " + l);
        System.out.println(Short.MAX_VALUE);

        char b = (char) i;
        System.out.println("b = " + b);
        float f = (float) i;
        System.out.println("f = " + f);

    }

}
