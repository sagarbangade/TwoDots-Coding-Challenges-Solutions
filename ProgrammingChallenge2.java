//Take the input line from argument and return the string true 
//if every single letter of the English alphabet exists in the 
//string, otherwise return the string false. For example: 
//if str is "zacxyjbbkfgtbhdaielqrm45pnsowtuv" then your program 
//should return the string true because every character in the alphabet exists 
//in this string even though some characters appear more than once.


import java.util.Scanner;

public class ProgrammingChallenge2 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter : ");
        String inputLine = s.nextLine();

        // Create a boolean array to mark the presence of characters
        boolean[] alphabetExists = new boolean[26];

        // Convert the input to lowercase to make the comparison case-insensitive
        inputLine = inputLine.toLowerCase();

        for (char c : inputLine.toCharArray()) {
            // Check if the character is a lowercase English alphabet letter
            if (c >= 'a' && c <= 'z') {
                int index = c - 'a';
                alphabetExists[index] = true;
            }
        }

        // Check if all alphabet characters are present
        boolean allAlphabetExists = true;
        for (boolean exists : alphabetExists) {
            if (!exists) {
                allAlphabetExists = false;
                break;
            }
        }

        // Output the result
        if (allAlphabetExists) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
