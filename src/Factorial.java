import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = Integer.valueOf(scanner.nextLine());

        scanner.close();

        System.out.println("The factorial of "+num+" is: "+factorial(num));
    }

    static int factorial(int num){
       int factorial = 1;
        if (num==0||num==1){
            return 1;
        }
        for (int i=1; i<=num; i++){
            factorial *=i;
        }
        return factorial;
    }
}
