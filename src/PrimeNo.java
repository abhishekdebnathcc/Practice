import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = Integer.valueOf(scanner.nextLine());

        if (isPrime(num)) {
            System.out.println("No factors are present for " + num + "\nHence it is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
