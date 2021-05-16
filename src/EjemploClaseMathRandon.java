import java.util.Random;

public class EjemploClaseMathRandon {
        public static void main(String[] args) {
                
                String[] colores = {"azul", "amarillo", "verde", "rojo", "negro"};
                
                
                double rando = Math.random();
                System.out.println("rando = " + rando );

                
                rando *= colores.length;
                
                System.out.println("rando = " + rando);
                
                rando = Math.floor(rando);
                System.out.println("rando = " + rando);

                System.out.println("colores[(int) rando] = " + colores[(int) rando]);


                Random random = new Random();
                int randomInt = random.nextInt(7);
                System.out.println("randomInt = " + randomInt);

                long randomLong = random.nextLong();
                System.out.println("randomLong = " + randomLong);

                int randoIntBetween = 15 + random.nextInt(25-15);
                System.out.println("randoIntBetween = " + randoIntBetween);

                randomInt = random.nextInt(colores.length);
                System.out.println("colores = " + colores[randomInt]);
        }
}
