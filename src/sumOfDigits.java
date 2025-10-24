import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = Integer.valueOf(scanner.nextLine());
        scanner.close();
        System.out.println("The sum of digits of "+num+" is: "+sum(num));
    }
    static int sum(int num){
        int sum = 0;
        while (num!=0){
            sum += num%10;
            num /=10;
        }
        return sum;
    }
}
