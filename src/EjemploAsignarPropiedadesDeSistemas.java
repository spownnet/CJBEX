import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistemas {
        public static void main(String[] args) {

                try {
                        //Leemos el archivo
                        FileInputStream fis = new FileInputStream("src/config.properties");
                        Properties p = new Properties(System.getProperties());
                        //Cargamos el archivo de propiedades en la propiedades
                        p.load(fis);
                        p.setProperty("mi.propiedad.personalizado","mi valor guardado en el objeto propertie");
                        //Actualizamos la propiedad personalizadas del sistema
                        System.setProperties(p);
                        //Listamos las propiedades del sistema en donde se adicionaron las personalizadas
                        System.getProperties().list(System.out);
                        
                        //Utilizar nuestra propiedades personalizadas
                        System.out.println("p.getProperty(\"config.autor.nombre\") = " + p.getProperty("config.autor.nombre"));

                } catch (FileNotFoundException e) {
                        //e.printStackTrace();
                        System.err.println("no existe el archivo = " + e.getMessage());
                        System.exit(1);
                } catch (IOException e) {
                        //e.printStackTrace();
                        System.err.println("Error al cargar las propiedades personalizadas = " + e.getMessage());
                        System.exit(1);
                }


        }
}
