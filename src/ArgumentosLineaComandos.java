public class ArgumentosLineaComandos {
        public static void main(String[] args) {

                if (args.length == 0){
                        System.out.println("Debe ingresar un argumento");
                        System.exit(-1);
                }

                for (int i = 0; i < args.length; i++) {
                        System.out.println("argumentos = " + i + " : " + args[i]);
                }
        }
}
