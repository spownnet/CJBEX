public class WrapperOperadoresRelacionales {
        public static void main(String[] args) {
                Integer num1 = Integer.valueOf(1000);
                Integer num2 = num1;

                System.out.println("num1 = " + num1);
                System.out.println("num2 = " + num2);

                System.out.println("Son el mismo Objeto? "+ (num1==num2));

                num2 = 1000;

                //comparacion por la referencia del objeto
                System.out.println("Son el mismo Objeto? "+ (num1==num2));

                //metodo equal del objeto para compara por el valor del objeto
                System.out.println("tienes el mismo valor? " + (num1.equals(num2)));

                //comparando haciendo uso del merdo intValue con el operador ==
                System.out.println("tienen el mismo valor? " + (num1.intValue() == num2.intValue()));

                num2= 2000;
                //Comparando con el operador > <
                //En este caso lo que hace es un auto Anboxing o desempaquetar haciendo uso
                //del intValue
                boolean  condicion = num1 > num2;
                System.out.println("condicion = " + condicion);

                boolean  condicion2 = num1.intValue() > num2.intValue();
                System.out.println("condicion = " + condicion2);

        }
}
