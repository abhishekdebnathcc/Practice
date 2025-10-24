import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Panagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence to check if its a panagram: ");
        String input = scanner.nextLine();
        if (isPanagram(input)){
            System.out.println(input+" is a panagram.");
        } else {
            System.out.println(input+" is not a panagram");
        }
    }
    static boolean isPanagram(String input){
        input = input.toLowerCase();
        Set<Character> charSet = new HashSet<>();

        for (int i=0;i<input.length();i++ ){
            char temp = input.charAt(i);
            if (temp>='a'&&temp<='z'){
                charSet.add(temp);
            }
        }
        return charSet.size()==26;
    }
}
