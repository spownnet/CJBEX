public class PasarPorValor {
        public static void main(String[] args) {
                Integer i = 10;
                System.out.println("iniciamos el metodo main con i = " + i);

                test(i);

                System.out.println("Finaliza el metodo main con el valor de i = " + i);
        }

        public static  void test(Integer x){
                System.out.println("Iniciamos el metodo test con x = " + x);

                x = 35;

                System.out.println("Fina el metodo test con x = " + x);
        }
}
