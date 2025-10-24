import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string to count the vowels: ");
        String input = scanner.nextLine();
        System.out.println("The number of vowels in " + input + " is: " + countVowels(input));
    }

        static int countVowels(String input){
            int count = 0;
            input = input.toLowerCase();
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);

                if (c == 'a' || c=='e'||c=='i'||c=='o'||c=='u'){
                    count++;
                }
            }
            return count;
        }
    }

