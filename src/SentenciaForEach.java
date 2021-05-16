public class SentenciaForEach {
        public static void main(String[] args) {
                int [] numeros = {1,3,5,7,9, 11,13,14};
                
                //Ejemplo ForEach
                for(int num: numeros){
                        System.out.println("num = " + num);
                }

                String[] nombres= {"Edgardo", "Nazir", "Miqueas", "Uziel", "Marvelin", "Ignacio"};

                //ForEach con variables tipo String
                for (String nombre: nombres) {
                        System.out.println("nombre = " + nombre);
                }
        }
}
