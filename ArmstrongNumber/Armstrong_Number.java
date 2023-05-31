package ArmstrongNumber;

public class Armstrong_Number {
    public static void main(String[] args) {
        int num = 153;
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
        System.out.println(arm);
    }
}
