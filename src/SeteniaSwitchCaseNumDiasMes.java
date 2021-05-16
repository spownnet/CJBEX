import java.util.Scanner;

public class SeteniaSwitchCaseNumDiasMes {
        public static void main(String[] args) {

                Scanner s = new Scanner(System.in);
                System.out.println("Introduzca el numero del mes (1 - 12)");
                int month = s.nextInt();
                System.out.println("Introduzca el año (YYYY)");
                int year = s.nextInt();

                int daynum;

                switch(month){
                        case 1:
                        case 3:
                        case 5:
                        case 7:
                        case 8:
                        case 10:
                        case 12:
                           daynum = 31;
                           break;
                        case 4:
                        case 6:
                        case 9:
                        case 11:
                                daynum = 30;
                                break;
                        case 2:
                                if (((year % 400) == 0) || (((year % 4) == 0) && !((year % 100) == 0)))
                                {daynum = 29;}
                                 else
                                {daynum = 28;}
                                 break;
                        default:
                                daynum = -1;
                }

                System.out.println("Cantidad de Dias = " + (daynum>0? daynum: "invalido"));

        }
}
