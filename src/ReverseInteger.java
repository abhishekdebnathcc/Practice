import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        int num = Integer.valueOf(scanner.nextLine());

        System.out.println("Reverse of "+num+" is "+intReverse(num));
    }

    static int intReverse(int num){
        //Extract the last digits of the number
        int reversedNo = 0, digit=0;
        while (num!=0){
             digit = num%10;
            reversedNo = reversedNo*10+digit;
            num /=10;
        }
        return reversedNo;
    }
}
