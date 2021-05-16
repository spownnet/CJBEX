public class OperadoresAsignacion {
        public static void main(String[] args) {
                int i = 5;
                int j = i + 4;

                i += 2; //Es lo mismo que decir i = i + 2
                System.out.println("i = " + i);

                i += 5;
                System.out.println("i = " + i);

                j -= 4; // j = j - 4
                System.out.println("j = " + j);

                j *= 3; // j = j * 3
                System.out.println("j = " + j);

                String sqlString = "select * from clientes as c";
                sqlString += " where cliente_id = 1"; //sqlString = slqString + " where cliente_id = 1"
                System.out.println("sqlString = " + sqlString);

        }
}
