import java.util.Scanner;


public class OperadoresLogicosLogin {
        public static void main(String[] args) {

/*
                String[] userNames = new String[2];
                String[] passwords = new String[2];

                userNames[0] = "Edgardo";
                passwords[0] = "123456";

                userNames[1] = "Admin";
                passwords[1] = "12345";
*/
                String[] userNames = {"Edgardo","Admin","Nazir"};
                String[] passwords = {"123456", "12345", "54321"};

                Scanner read = new Scanner(System.in);
                System.out.println("Introduzca el Usuario: ");
                String usr = read.nextLine();
                System.out.println("Intruduzca el Paswword: ");
                String pwd = read.nextLine();

                boolean esAutenticado = false;

                //Revision de Usuario/contraseña en arreglo
                for (int i = 0; i< userNames.length; i++) {

                        //Mejora con operador Ternario
                        esAutenticado = (userNames[i].equals(usr) && passwords[i].equals(pwd))? true:esAutenticado;

//                        if (userNames[i].equals(usr) && passwords[i].equals(pwd)
//                        ) {
//                                esAutenticado = true;
//                                break;
//                        }
                }

                //Mejora con Operador Ternario
                String mensaje = esAutenticado? "Bienvenido: ".concat(usr).concat("!!!"):
                        "Lo sentimos el usuario o contraseña son incorrectas";

                System.out.println(mensaje);

                //Validacion de que si encontro un usuario que cumple con la autenticacion
//                if (esAutenticado){
//                        System.out.println("Bienvenido: ".concat(usr).concat("!!!"));
//                } else {
//                        System.out.println("Lo sentimos el usuario o contraseña son incorrectas");
//                }
        }
}
