public class WrapperInteger {
        public static void main(String[] args) {

                int intPrimitivo = 32767;
                Integer intObjeto = Integer.valueOf(intPrimitivo);
                Integer intObjeto2 = intPrimitivo;

                System.out.println("intObjeto = " + intObjeto);

                int num = intObjeto2;
                System.out.println("num = " + num);
                int num2 = intObjeto2.intValue();
                System.out.println("num2 = " + num2);

                String valorTvLcd = "34";
                Integer valor = Integer.valueOf(valorTvLcd);

                System.out.println("valor = " + valor);

                Short shortObjeto = intObjeto.shortValue();

                System.out.println("shortObjeto = " + shortObjeto);


                Byte byteObjeto = intObjeto.byteValue();
                System.out.println("byteObjeto = " + byteObjeto);

                Long lonObjeto = intObjeto.longValue();
                System.out.println("lonObjeto = " + lonObjeto);

        }
}
