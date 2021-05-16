import java.io.IOException;
import java.util.Locale;

public class EjemploEjecutarProgramaSO {
        public static void main(String[] args) {
                Runtime rn = Runtime.getRuntime();
                Process p;


                        try {
                                if (System.getProperty("os.name").toLowerCase().startsWith("windows")) {
                                        p = rn.exec("notepad");
                                }
                                else if (System.getProperty("os.name").toLowerCase().startsWith("mac")) {
                                        p = rn.exec("textedit");
                                }
                                else if (System.getProperty("os.name").toLowerCase().contains("nux") ||
                                        System.getProperty("os.name").toLowerCase().contains("nix")) {
                                        p = rn.exec("gedit");
                                }
                                else {
                                        p = rn.exec("gedit");
                                }
                                p.waitFor();
                        }
                        catch (Exception e) {
                                System.err.println("El Comando es desconocido!!" + e.getMessage());
                                System.exit(1);
                        }

                System.out.println("Se ha cerrado el editor");
                        System.exit(0);

                }
        }

