package ReverseAnInteger;

import java.util.Scanner;

public class reverse_integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number:");
        int num = sc.nextInt();
           int res=0;
        while (num > 0) {
            int rem = num % 10;
            num = num / 10;
            res = res * 10 + rem;
        }
        System.out.print("The reversed number is:" + num);
    }
}
