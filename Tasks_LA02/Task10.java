package Tasks_LA02;

import java.util.Scanner;
public class Task10 
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int money = sc.nextInt();
    int note500 = 500;
    int count500 = 0;
    int note100 = 100;
    int count100 = 0;
    int note50 = 50;
    int count50 = 0;
    int note10 = 10;
    int count10 = 0;
    int note5 = 5;
    int count5 = 0;
    int note1 = 1;
    int count1 = 0;
    int sum = 0;    
    for(int i = note500; i <= money; i += note500){
      sum += note500;
      if(sum <= money){
        count500 ++;
      }
    }
    int restMoney = money - sum;
    sum = 0;
    if (sum < money){
      for(int i = note100; i <= restMoney; i += note100){
        sum += note100;
        if(sum <= restMoney){
          count100 ++;
        }
      }
    }
    restMoney = restMoney - sum;
    sum = 0;
    if (sum < restMoney){
      for(int i = note50; i <= restMoney; i += note50){
        sum += note50;
        if(sum <= restMoney){
          count50 ++;
        }
      }
    }
    restMoney = restMoney - sum;
    sum = 0;
    if (sum < restMoney){
      for(int i = note10; i <= restMoney; i += note10){
        sum += note10;
        if(sum <= restMoney){
          count10 ++;
        }
      }
    }
    restMoney = restMoney - sum;
    sum = 0;
    if (sum < restMoney){
      for(int i = note5; i <= restMoney; i += note5){
        sum += note5;
        if(sum <= restMoney){
          count5 ++;
        }
      }
    }
    restMoney = restMoney - sum;
    sum = 0;
    if (sum < restMoney){
      for(int i = note1; i <= restMoney; i += note1){
        sum += note1;
        if(sum <= restMoney){
          count1 ++;
        }
      }
    }
    if(count500 != 0){
      System.out.println(count500 + " " + note500 + "\'s note");
    } 
    if(count100 != 0){
      System.out.println(count100 + " " + note100 + "\'s note");
    }
    if(count50 != 0){
      System.out.println(count50 + " " + note50 + "\'s note");
    }
    if(count10 != 0){
      System.out.println(count10 + " " + note10 + "\'s note");
    }
    if(count5 != 0){
      System.out.println(count5 + " " + note5 + "\'s note");
    }
    if(count1 != 0){
      System.out.println(count1 + " " + note1 + "\'s note");
    }
    sc.close();
  }
}