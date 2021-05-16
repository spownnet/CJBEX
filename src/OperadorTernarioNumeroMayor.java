import java.util.Scanner;

public class OperadorTernarioNumeroMayor {
        public static void main(String[] args) {
                int maximo = 0;

                Scanner sc = new Scanner(System.in);

                System.out.println("Introduca el numero: ");
                int n1 = sc.nextInt();

                System.out.println("Introduca el segundo numero: ");
                int n2 = sc.nextInt();

                System.out.println("Introduca el tercer numero: ");
                int n3 = sc.nextInt();

                maximo = (n1 > n2)? n1: n2;
                maximo =(maximo > n3)? maximo: n3;

                System.out.println("maximo = " + maximo);

        }
}
