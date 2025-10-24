import java.util.Scanner;

public class LargestOf3Nos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three nos separated by commas: ");
        String numbers = scanner.nextLine();
        int a = Integer.valueOf(numbers.split(",")[0]);
        int b = Integer.valueOf(numbers.split(",")[1]);
        int c = Integer.valueOf(numbers.split(",")[2]);

        int largestNo = 0;
        if (a>b && a>c){
            largestNo = a;
        } else if (b>a && b>c) {
            largestNo = b;
        } else {
            largestNo = c;
        }
        System.out.println("Largest of "+a+","+b+","+c+" is "+largestNo);

    }
}
