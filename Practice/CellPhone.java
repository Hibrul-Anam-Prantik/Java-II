package Practice;

public class CellPhone{
  
    public String model ="unknown";
    
    int count =0;
   // String a1[] = new String []{String a, String b,String c};
    
    
    
    public void printDetails(){
      System.out.println(" Phone Model " + model );
      
      System.out.println( "Contacts Stored "  + count );
      if( count ==0    ){
         
      }else if( count>0 && count<4 ){
        //System.out.println( " Contacts Stored " + count );
  //      System.out.println( a1[count] );
         ////System.out.println(b1);
          //System.out.println(c1);
      }
    }
    public void storeContact(String a ){
  //     a1[count]=a;
       
       count++;
       if( count>3 ){
         System.out.println("Memory full. new contact can't be stored.");
         System.out.println( "Phone model "  + model );
         System.out.println("Stored contacts : ");
         System.out.println();
  //       System.out.println(a1);
         
       }
    }
   }