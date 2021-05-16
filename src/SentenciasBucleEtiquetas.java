public class SentenciasBucleEtiquetas {
        public static void main(String[] args) {

                bucle1:
                for (int i = 0; i < 7; i++) {

                        System.out.println();
                        for (int j = 0; j < 6; j++) {

                        if (i == 3){
                                continue bucle1;
                        }
                        System.out.print("[i = " + i + " j = " + j + "]");
                        }
                }

                System.out.println("\n================================================");

                etiqueta1:
                for (int i = 0; i < 7; i++) {

                        System.out.println();
                        for (int j = 0; j < 6; j++) {

                                if (i == 3){
                                        break etiqueta1;
                                }
                                System.out.print("[i = " + i + " j = " + j + "]");
                        }
                }
        }

}
