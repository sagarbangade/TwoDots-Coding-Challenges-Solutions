//problem statement is Programming Challenge 1


//Take the input line from argument, which will contain only 
//alphabetic characters and spaces, and return the first non-repeating 
//character. For example: if str is "agettkgaeee" then your program 
//should return k. The string will always contain at least one character 
//and there will always be at least one non-repeating character.


//Examples
//Input: "abcdef"
//Output: a 
//Input: "hello world hi hey"
//Output: w


import java.util.HashMap;
import java.util.Scanner;

public class ProgrammingChallenge1 {


    public static void main(String[] args) {
        // Arguments will be read by STDIN
        Scanner s = new Scanner(System.in); // do not change this
        System.out.print("Enter : ");
        String inputLine = s.nextLine(); // do not change this

        // Initialize a hash table to count character occurrences
        HashMap<Character, Integer> charCounts = new HashMap<>();

        // Count occurrences of each character
        for (char ch : inputLine.toCharArray()) {
            charCounts.put(ch, charCounts.getOrDefault(ch, 0) + 1);
        }

        // Find the first non-repeating character
        for (char ch : inputLine.toCharArray()) {
            if (charCounts.get(ch) == 1) {
                System.out.println(ch);
                break;
            }
        }
    }
}
