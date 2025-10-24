import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word = scanner.nextLine();
        scanner.close();

//        String firstCharacter = String.valueOf(word.charAt(0));

        if (isWordPalindrome(word)) {
            System.out.println(word + " is palindrome!");
        } else {
            System.out.println(word + " is not palindrome.");
        }
    }

    static boolean isWordPalindrome(String word) {
        word = word.replaceAll("\\s+", "").toLowerCase();
        int firstIndex = 0, lastIndex = word.length() - 1;
        while (firstIndex < lastIndex) {
            if (word.charAt(firstIndex) != word.charAt(lastIndex)) {
                return false;
            }
            firstIndex++;
            lastIndex--;
        }
        return true;
    }
}
