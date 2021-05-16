public class OperadorInstanceOfTiposGenericos {
        public static void main(String[] args) {
                Object texto = "Creando un objeto de la clase String";
                Number num = 7;
                Boolean b1 = texto instanceof String;
                System.out.println("Texto es del tipo String = " + b1);
                b1 = texto instanceof Object;
                System.out.println("Texto es del tipo Object = " + b1);

                b1 = texto instanceof Integer;
                System.out.println("b1 = " + b1);
                
                boolean b2 = num instanceof Integer;
                System.out.println("num es del tipo Integer = " + b2);
                b2 = num instanceof Number;
                System.out.println("num es del tipo Number = " + b2);
                b2 = num instanceof Object;
                System.out.println("num es del tipo Object = " + b2);

                Double decimal = 54.56;
                b2 = decimal instanceof Number;
                System.out.println("decimal es del tipo Number = " + b2);

                b1 = b1 instanceof Boolean;
                System.out.println("b1 es del tipo Boolean = " + b1);
        }
}
