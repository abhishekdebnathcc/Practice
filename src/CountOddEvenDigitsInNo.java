import java.util.Scanner;

public class CountOddEvenDigitsInNo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = Integer.valueOf(scanner.nextLine());

        System.out.println("The number of odd and even digits are : " + oddEvenDigits(num));
    }

    static String oddEvenDigits(int num) {
        int digit = 0, even = 0, odd = 0;
        //run a loop
        while (true) {
            if (num == 0) {
                break;
            }

            //extract digits from the number
            digit = num % 10;

            //check the digit for odd and even count
            if (digit % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            //trim the number by a single digit
            num /= 10;

        }
        return odd+" and "+even;
    }
}
