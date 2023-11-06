//Write a function myCode(str) which takes str as
//parameter (in string type) and display following output,
//where str contains 5 (as an example) which represents number of rows:
//
//    *
//   ***
//  *****
// *******
//*********



import java.util.Scanner;

public class ProgrammingChallenge3 {


    public static void main(String[] args) {
        // Arguments will be read by STDIN
        Scanner s = new Scanner(System.in);
        String inputLine = s.nextLine();

        // Parse the input as an integer
        System.out.print("Enter number: ");
        int n = Integer.parseInt(inputLine);

        // Call the myCode function and print the output
        String output = myCode(n);
        System.out.print(output);
    }

    public static String myCode(int n) {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            // Add spaces before each asterisk to create the pyramid shape
            for (int j = 0; j < n - i; j++) {
                result.append(" ");
            }

            // Add asterisks for the current row
            for (int j = 0; j < 2 * i - 1; j++) {
                result.append("*");
            }

            // Add a newline character to move to the next row
            result.append("\n");
        }

        return result.toString();
    }
}
