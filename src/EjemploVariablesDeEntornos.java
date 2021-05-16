import java.util.Map;

public class EjemploVariablesDeEntornos {
        public static void main(String[] args) {
                Map<String, String> varEnv = System.getenv();

                System.out.println("varEnv = " + varEnv);

                System.out.println("||=============================||");
                System.out.println("||Listando variables de Entorno||");
                System.out.println("||=============================||");
                for (String key:
                     varEnv.keySet()) {
                        System.out.println("key[" + key + "] => valor["+ varEnv.get(key)+ "]");
                }

                String username = System.getenv("USERNAME");
                System.out.println("username = " + username);
                String javahome = System.getenv("JAVA_HOME");
                System.out.println("javahome = " + javahome);
                String temDir = System.getenv("TEMP");
                System.out.println("temDir = " + temDir);
                String path = System.getenv("Path");
                System.out.println("path = " + path);

                //Obteniendo un valor dentro del mapa.
                String path2 = varEnv.get("Path");
                System.out.println("path2 = " + path2);


        }
}
