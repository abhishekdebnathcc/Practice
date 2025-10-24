import java.util.Scanner;

public class SwapTwoNos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.print("Enter second number: ");
        int num2 = Integer.valueOf(scanner.nextLine());
        System.out.println("The two given nos are: "+num1+" and "+num2);

        //Swap two numbers now without creating a third variable

        //assign the sum of two nos to the first no
        num1 += num2;

        //assign the original value of num1 to num2
        num2 = num1-num2;

        //assign the original value of b to a

        num1 -= num2;

        System.out.println("The swapped nos are: "+num1+" and "+num2);



    }
}
