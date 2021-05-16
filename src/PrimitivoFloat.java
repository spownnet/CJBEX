public class PrimitivoFloat {


    public static void main(String[] args) {
        float realFloat = 0.00000000015f;//1.5e-10f;//0.00000000015f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("tipo float corresponde a byte a = " + Float.BYTES);
        System.out.println("tipo float corresponde a bite a = " + Float.SIZE);
        System.out.println("el valo minimo de un float = " + Float.MIN_VALUE);
        System.out.println("el valo maximo de un float = " + Float.MAX_VALUE);

        double realDouble = 3.4028235E38;
        System.out.println("realDouble = " + realDouble);
        System.out.println("tipo double corresponde a byte a = " + Double.BYTES);
        System.out.println("tipo double corresponde a bite a = " + Double.SIZE);
        System.out.println("el valo minimo de un double = " + Double.MIN_VALUE);
        System.out.println("el valo maximo de un double = " + Double.MAX_VALUE);

        float pi = 45.0f;
        System.out.println("pi = " + pi);
    }
}
