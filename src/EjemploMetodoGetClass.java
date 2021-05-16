import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
        public static void main(String[] args) {
                String texto = "Hola que Tal!!";

                //Para obtener toda la estructura del objeto con getClass
               Class strClass = texto.getClass();

                System.out.println("strClass.getName() = " + strClass.getName());
                System.out.println("strClass.getName() = " + strClass.getSimpleName());
                System.out.println("strClass.getName() = " + strClass.getPackage());
                System.out.println("strClass.getName() = " + strClass.getPackageName());
                System.out.println("strClass.getName() = " + strClass);

                for (Method m:
                     strClass.getMethods()) {
                        System.out.println("m.getName() = " + m.getName());
                }
                
                Integer num = 4323;
                Class intClass = num.getClass();
                System.out.println("intClass.getSimpleName() = " + intClass.getSimpleName());

                for (Field f:
                     intClass.getFields()) {
                        System.out.println("f.getName() = " + f.getName());
                }
                System.out.println("intClass.getSuperclass().getSuperclass() = " + intClass.getSuperclass());
                System.out.println("intClass.getSuperclass().getSuperclass() = " + intClass.getSuperclass().getSuperclass());

                Class objClass = intClass.getSuperclass().getSuperclass();
                for (Method m:
                     objClass.getMethods()) {
                        System.out.println("Clase Object methods = " + m);
                }
        }
}
