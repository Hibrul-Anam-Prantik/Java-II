package Tasks_LA03;
import java.util.Scanner;

public class Rough {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] enteredWords = new String[100]; // Assumption: max 100 words can be entered
        int wordCount = 0;

        while (true) {
            String str = sc.next().toLowerCase();

            // Check if the word has been entered before
            boolean wordExists = false;
            for (int i = 0; i < wordCount; i++) {
                if (enteredWords[i].equals(str)) {
                    wordExists = true;
                    break;
                }
            }

            if (wordExists) {
                System.out.println("Please enter another word.");
                continue;
            }

            boolean isValid = true;
            int[] charCount = new int[26]; // Array to count occurrences of each letter

            for (char c : str.toCharArray()) {
                charCount[c - 'a']++;
                if (charCount[c - 'a'] > 1) {
                    System.out.println("\"" + c + "\" has been counted " + charCount[c - 'a'] + " times in the word \"" + str + "\".");
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                enteredWords[wordCount++] = str;
                System.out.println("You entered " + str + ".");
                break;
            } else {
                System.out.println("Please enter another word.");
            }
        }

        sc.close();
    }
}
