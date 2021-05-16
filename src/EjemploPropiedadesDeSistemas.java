import java.util.Properties;

public class EjemploPropiedadesDeSistemas {
        public static void main(String[] args) {
                String username = System.getProperty("user.name");
                System.out.println("username = " + username);

                String home = System.getProperty("user.home");

                System.out.println("home = " + home);

                String workspace = System.getProperty("user.dir");

                System.out.println("workspace = " + workspace);

                String javaversion = System.getProperty("java.version");

                System.out.println("javaversion = " + javaversion);

                String lineseparator = System.getProperty("line.separator");
                String lineseparator2 = System.lineSeparator();

                System.out.println("Seperadado de " + lineseparator + "linea");
                System.out.println("Seperadado de " + lineseparator2 + "linea");

                Properties p = System.getProperties();

                p.list(System.out);


        }
}
