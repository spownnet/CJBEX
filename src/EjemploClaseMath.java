public class EjemploClaseMath {

        public static void main(String[] args) {
                //Calcular el valor absoluto de un numero
                int absoluto = Math.abs(-23);
                System.out.println("absoluto = " + absoluto);
                absoluto = Math.abs(23);
                System.out.println("absoluto = " + absoluto);

                //Maximo de dos numeros
                double max = Math.max(4.2,55.2);
                System.out.println("max = " + max);
                
                //Minimo de dos numero
                double min = Math.min(2.3, 3);
                System.out.println("min = " + min);

                //Rendondeo hacia arriba
                double rarriba = Math.ceil(3.5);
                System.out.println("rarriba = " + rarriba);
                //Rendondeo hacia abajo
                double rabajo = Math.floor(3.5);
                System.out.println("rabajo = " + rabajo);

                //Rendondeo
                long entero = Math.round(Math.PI);
                System.out.println("entero = " + entero);


                //Exponencial
                double exp = Math.exp(1);
                System.out.println("exp = " + exp);

                //Logaritmo Natural
                double log = Math.log(19);
                System.out.println("log = " + log);
                
                //Potencia
                double potencia = Math.pow(20, 3);
                System.out.println("potencia = " + potencia);
                
                //Raiz cuadrada
                double qrt = Math.sqrt(4);
                System.out.println("qrt = " + qrt);
                
                //Metodos de trigronometrias
                //Radianes a grado
                double grados = Math.toDegrees(1.57);
                grados = Math.round(grados);
                System.out.println("grados = " + grados);
                //de grado a Radianes
                double radianes = Math.toRadians(90.0);
                System.out.println("radianes = " + radianes);

                //Funcion Seno
                System.out.println("Senos = " + Math.sin(radianes));

                //Funcion coseno
                System.out.println("Coseno = " + Math.cos(radianes));
        }
}
