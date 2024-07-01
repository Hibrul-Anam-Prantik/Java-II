package Tasks_LA03;

import java.util.Scanner;

public class Rezoan {
    

    public static void main (String [] args) {
         Scanner sc=new Scanner(System.in);
       int n=0;
       int t=0;
       boolean flag=true;
    
       while(flag){
        String s=sc.nextLine();
           int[] a=new int[123];
        for(int i=0;i<=s.length()-1;i++){
        int x=(int) s.charAt(i);
        a[x]++;
       }
        for(int i=97;i<123;i++){
       
        if(a[i]>1){
            n=a[i];
            char c=(char) i;
            System.out.println(c+ " has been counted "+n+" times in the word "+s);  
            t++;
             System.out.println("please enter another word ");
        }
         
       }
       if(t==0){
           flag=false;
           System.out.println("you entered "+s); 
       }
       t=0;
       }
    }
}

