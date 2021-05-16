public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        String nombreArchivo = "MiAcrhivo.dtsx";
        String extensionArchivo = nombreArchivo.substring(nombreArchivo.lastIndexOf(".")+1, nombreArchivo.length());
        System.out.println("nombreArchivo = " + nombreArchivo);
        System.out.println("extensionArchivo = " + extensionArchivo);
    }
}
