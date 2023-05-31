package ArmstrongNumber;

import java.util.Scanner;

public class ArmStrongNumber_amz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        int temp = num;
        int length = 0;
        while(temp!=0){
            length = length + 1;
            temp = temp/10;
        }
        int temp1 = num;
        int rem;
        int arm = 0;
        while(temp1 !=0){
            int mul = 1;
            rem = temp1 % 10;
            for(int i = 1;i<=length;i++){
                mul = mul * rem;
            }
            arm = arm + mul;
            temp1 = temp1/10;
        }
        System.out.println(arm == num);
    }
}
