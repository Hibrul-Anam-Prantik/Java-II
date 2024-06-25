package Practice;

public class Rough {
    public static void main(String[] args) {
        // Original array with duplicates
        int[] originalArray = {-5, 10, 14, 10, -7, 10};

        // New array to store unique elements (same size as original)
        int[] uniqueArray = new int[originalArray.length];
        int uniqueCount = 0; // To keep track of number of unique elements 

        // Iterate through the original array
        for (int i = 0; i < originalArray.length; i++) {
            // Check if originalArray[i] is already in uniqueArray
            boolean isDuplicate = false; // Flag 
            for (int j = 0; j < uniqueCount; j++) {
                if (originalArray[i] == uniqueArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not a duplicate, add to uniqueArray
            if (!isDuplicate) {
                uniqueArray[uniqueCount] = originalArray[i];
                uniqueCount++;
            }
        }

        // Print unique array
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(uniqueArray[i] + " ");
        }
        for ( int i = 0; i < uniqueCount; i++)
        {
            int count = 0;
            for(int j = 0; j < originalArray.length; j++)
            {
                if(uniqueArray[i] == originalArray[j]){
                    count++;
                }
            }
            System.out.println(uniqueArray[i]+" - "+count+" times");
        }
    }
}
