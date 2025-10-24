import java.util.Scanner;

public class CountDigitsInNo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = Integer.valueOf(scanner.nextLine());

        int count = 0, input = num;
        //now use a while loop
        while (true) {
            if (num == 0) {
                break;
            }

            //Extract digits from the number
            num /= 10;
            count++;
        }
        System.out.println("No of digits of "+input+" are: "+count);
        scanner.close();
    }
}
