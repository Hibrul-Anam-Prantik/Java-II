package Tasks_LA02;

/*Using for loop or while loop, write a java program that displays the following palindromic sequence of numbers:
(A palindromic sequence of numbers means the sequence stays the same when the numbers are reversed)
     2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 18, 16, 14, 12, 10, 8, 6, 4, 2
 */
public class Task2 
{
    public static void main(String[] args) 
    {
        // 2, 4, 6, 8, 10, 12, 14, 16, 18, 20,
        for(int i = 2; i <= 20; i+=2)
        {
            System.out.print(i+", ");
        }
        // 18, 16, 14, 12, 10, 8, 6, 4, 2
        int i = 18;
        while(i >= 2)
        {
            System.out.print(i);
            if(i != 2){
                System.out.print(", ");
            }
            i-=2;
        }
    }    
}
