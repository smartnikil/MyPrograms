package LeapYear;
import java.util.Scanner;
public class leap_year_gates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your year:");
        int year = sc.nextInt();
        if((year % 400 == 0)||(year % 100 != 0 && year % 4 == 0)){
            System.out.println("It is a leap year");
        }
        else{
            System.out.println("It is NOT a leap year");
        }
    }
}
