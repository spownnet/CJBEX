public class ArgumentosLineaComandosCalculadora {
        public static void main(String[] args) {

                if (args.length != 3){
                        System.err.println("Por favor ingresar  una operacion (suma, resta, multi, div) y dos enteros");
                        System.exit( -1);
                }
                String operacion = args[0];
                int a = 0;
                int b = 0;
                double resultado = 0.00;

               //Validaos que sea incluidos valores numericos
                try {
                        a = Integer.parseInt(args[1]);
                        b = Integer.parseInt(args[2]);

                } catch (NumberFormatException e){
                        System.err.println("Debe incluir valores numeros!!");
                        System.exit(-1);
                }

                switch (operacion){
                        case "suma":
                                resultado = a + b;
                                break;
                        case "resta":
                                resultado = a - b;
                                break;
                        case "multi":
                                resultado = a * b;
                                break;
                        case "div":
                                if (b == 0 ){
                                        System.err.println("No se puede dividir por 0");
                                        System.exit(-1);
                                }
                                resultado = (double) a / b;
                                break;
                        default:
                                resultado = a + b;
                                break;
                }

                System.out.println("El resultado de " + operacion + " es: " + resultado);
        }
}
