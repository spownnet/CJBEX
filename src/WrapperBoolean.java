public class WrapperBoolean {
        public static void main(String[] args) {
                Integer num1, num2;
                num1 = 1;
                num2 = 2;
                boolean primitivoBoolean = num1 > num2; //false
                Boolean objetoBoolean = Boolean.valueOf(primitivoBoolean);
                Boolean objetoBoolean2 = Boolean.valueOf("false");
                Boolean objetoBoolean3 = false;

                System.out.println("primitivoBoolean = " + primitivoBoolean);
                System.out.println("objetoBoolean = " + objetoBoolean);
                System.out.println("objetoBoolean2 = " + objetoBoolean2);

                //La comparacion de objetos Boolean si se puede compara con el ==
                System.out.println("Comparando dos objetos boolean? " + (objetoBoolean==objetoBoolean2));
                System.out.println("Comparando dos objetos boolean? " + (objetoBoolean.equals(objetoBoolean2)));
                System.out.println("Comparando dos objetos boolean? " + (objetoBoolean3==objetoBoolean2));
                System.out.println("Comparando dos objetos boolean? " + (objetoBoolean==objetoBoolean3));
                
                boolean primitivoBoolean2 = objetoBoolean.booleanValue();

                System.out.println("primitivoBoolean2 = " + primitivoBoolean2);



        }
}
