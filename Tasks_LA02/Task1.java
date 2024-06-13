package Tasks_LA02;
/*Using while loops, write a java code to display/print the following serieses:
    a. 2, 6, 10, 14, 18, 22, 26, 30, 34, 38, 42, 46, 50
(Hint: Identify the start, end, and common increment)

    b. 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, 66, 78, 91, 105, 120
(Hint: at each iteration, the increment amount also increases)
 */

public class Task1 
{
    public static void main(String[] args)
    {
        // a: 2, 6, 10, 14, 18, 22, 26, 30, 34, 38, 42, 46, 50
        System.out.print("(a) ");
        int i = 2;   // start = 2;
        while(i <= 50)    // end = 50
        {
            System.out.print(i);
            if(i != 50){
                System.out.print(", ");
            }
            i+=4;    // common increment = 4
        }
        // b: 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, 66, 78, 91, 105, 120
        System.out.println();
        System.out.print("(b) ");
        int j = 1;   // start = 1;
        int increment = 2;   // initial increment = 2
        while(j <= 120)    // end = 120
        {
            System.out.print(j);
            if(j != 120){
                System.out.print(", ");
            }
            j += increment;
            increment++;    //  increases everytime 
        } 
    }
}
