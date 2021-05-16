public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        String a = "A";
        String b = "B";
        String c = a;
        StringBuilder sb = new StringBuilder(a);

        long inicial = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++){

            //c = c.concat(a).concat(b).concat("\n"); //Rendimiento: 500 Iteracciones = 15ms, 1000 Iteracciones = 16ms
            //c += a+b+"\n"; //Rendimeinto: 500 Iteracciones = 31ms, 1000 Iteracciones = 31ms
            //Con StringBuilder Esta mas optimo independientemente de la cantidad de interacciones.
            sb.append(a).append(b).append("\n"); //Rendimiento: 500 Iteracciones = 0ms, 1000 Iteracciones = 0ms
        }

        //podemor invocar el recolecto de basura de forma implisita
        System.gc();

        long fin = System.currentTimeMillis();

        System.out.println("\nTiempo transcurrido: "+(fin - inicial) + "ms");
        System.out.println("c = " + c);
        System.out.println("sb.toString() = " + sb.toString());

        System.exit(0);
    }
}
