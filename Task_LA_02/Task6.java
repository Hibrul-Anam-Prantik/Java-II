package Task_LA_02;

import java.util.Scanner;

public class Task6 
{
    public static void main(String[] args)
    {
        double num;
        double weight;
        double sumWeightAndNum = 0;
        double sumWeight = 0;
        Scanner sc = new Scanner(System.in);
        for ( int i = 0; i < 5; i++){
            num = sc.nextDouble();
            weight = sc.nextDouble();
            sumWeightAndNum += (num*weight);
            sumWeight += weight;
        }
        double avg = sumWeightAndNum/sumWeight;
        System.out.println("Weighted Average = "+ avg);
        sc.close();
    }    
}