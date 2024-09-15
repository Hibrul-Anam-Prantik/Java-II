package Practice;

import java.util.Scanner;

public class Rough {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases
        String vowels = "aeiou"; // The cycle of vowels

        // For each test case
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); // Length of the string to be generated

            StringBuilder result = new StringBuilder();

            // Generate the string of length n by cycling through the vowels
            for (int j = 0; j < n; j++) {
                result.append(vowels.charAt(j % 5)); // Use modulus to cycle through the vowels
            }

            // Output the result for this test case
            System.out.println(result.toString());
        }

        scanner.close();
    }
}
