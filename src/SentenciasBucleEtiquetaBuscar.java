public class SentenciasBucleEtiquetaBuscar {
        public static void main(String[] args) {

                String line= "UNB+UNOA:2+GTPBR:ZZZ+MAEU:ZZZ+200611:1507+35765'";
                String componente = "MAEU";

                int lentComponente = componente.length();
                int lenline = line.length() - lentComponente;

                int cantidad = 0;

                buscar:
                for (int i = 0; i <= lenline;) {
                        int k = i;
                        for (int j = 0; j < lentComponente; j++) {
                        if (line.charAt(k++) != componente.charAt(j)){
                                i++;
                                continue buscar;
                        }
                        }
                        cantidad++;
                        i = i + lentComponente;
                }

                System.out.println("Encontrado = " + cantidad + " veces la palabra '" + componente + "' en la linea");

        }
}
