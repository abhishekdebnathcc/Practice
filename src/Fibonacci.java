import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of fibonacci numbers: ");
        int num = Integer.valueOf(scanner.nextLine());
        int firstNo = 0, secondNo = -1, sum = 0;
        System.out.print(firstNo+"\t"+secondNo);
        for (int i = 2; i < num; i++) {

            sum = firstNo+secondNo;
            firstNo = secondNo;
            secondNo = sum;
            System.out.print("\t"+sum);
        }
    }
}
