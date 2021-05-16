class Persona{
        private String nombre;

        public void setNombre(String nombre){
                this.nombre = nombre;
        }

        public String getNombre(){
                return this.nombre;
        }
}

public class PasarPorReferencia2 {
        public static void main(String[] args) {
                Persona persona = new Persona();

                persona.setNombre("Edgardo");

                System.out.println("iniciamos el metodo main");

                System.out.println("persona.getNombre() = " + persona.getNombre());

                System.out.println("Antes de llamar al metodo Test");
                test(persona);

                System.out.println("Despues de llamar al metodo Test");
                System.out.println("persona.getNombre() = " + persona.getNombre());

                System.out.println("Finaliza el metodo main !");
        }

        public static  void test(Persona persona){
                System.out.println("Iniciamos el metodo test a modificar el objeto persona");

                persona.setNombre("Nazir");

                System.out.println("Finaliza el metodo test de modificar el objeto persona");
        }
}
