package Tasks_LA02;

public class Text {
    public static void main(String[] args) {
        int i = 1;   
        int j = 2;   
        while(i <= 120)    
        {
            System.out.print(i);
            if(i != 120){
                System.out.print(", ");
            }
            i += j;
            j++;   
        }
    }
}
