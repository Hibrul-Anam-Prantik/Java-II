package Tasks_LA02;

public class Task11 
{
    public static void main(String[] args) 
    {
        // a) Square pattern
        int termA = 5;
        for(int i = 1; i <= termA; i++)
        {
            for(int j = 1; j <= termA; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // b) Triangle pattern
        int termB = 5;
        for(int i = 1; i <= termB; i++)
        {
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }    
}
