import java.util.Scanner;

public class Octal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = Integer.valueOf(scanner.nextLine());

        scanner.close();

        System.out.println("The octal of "+num+" using java's prebuilt method is: "+Integer.toOctalString(num));
        System.out.println("The octal of "+num+" using my method is: "+octal(num));
    }

    static int octal(int num){
        int octalNo = 0, remainder = 0, indice = 1;
        while (num!=0){
            remainder = num%8;      //get the remainder
            octalNo =octalNo+indice*remainder; //
            indice *=10;
            num /=8;
        }
        return octalNo;
    }
}
