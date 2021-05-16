import javax.swing.*;

public class SentenciaForArreglo {
        public static void main(String[] args) {
                String [] nombre = {"Edgardo","Pepe","Maria", "Bea","Pto", "Nazir","Uziel"};
                int count = nombre.length;


                for (int i = 0; i <count ; i++) {
                        if (nombre[i].equalsIgnoreCase("Pepe") ||
                            nombre[i].equalsIgnoreCase("pto")){
                                continue;
                        }
                        System.out.println("No-"+ i + " nombre = " + nombre[i]);
                }

                String nombreBuscar = JOptionPane.showInputDialog("Ingrese un nombre a buscar: Ejemplo \"Edgardo\" o \"Uziel\"");

                System.out.println("nombreBuscar = " + nombreBuscar);

                boolean encontrado = false;
                for (int i = 0; i < count; i++) {
                        if(nombre[i].equalsIgnoreCase(nombreBuscar)){
                                encontrado = true;
                                break;
                        }
                }
                if (encontrado){
                        JOptionPane.showMessageDialog(null, nombreBuscar + " Fue encontrado!!");
                }else{
                        JOptionPane.showMessageDialog(null, nombreBuscar + " no existe en el sistema!!");
                }
        }
}
