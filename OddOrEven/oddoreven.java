package OddOrEven;

import java.util.Scanner;

public class oddoreven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        if(n % 2 == 0){
            System.out.println("This is a even number");
        }
        else{
            System.out.println("This is a odd number");
        }
    }
}
