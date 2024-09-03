public class MobilePhone 
{
     public int contacts;
     public String[] name;
     public int[] num;
     public int capacity;
     int idxName;   // to access the names of the array
     int idxNum;    // to access the contact-number of the array
     
     public void setContactCapacity(int capacity) {
          this.capacity = capacity;
          name = new String[capacity];
          num = new int[capacity];
          idxName = 0;
          idxNum = 0;
     }
     
     public void details() {
          System.out.println("Total Contacts: " + contacts);
          System.out.println("Contact List:");
          if(contacts > 0) {
               for(int i = 0; i < contacts; i ++) {
                    System.out.println(name[i] + ":" + num[i]);
               }
          }
     }
     
     public void addContact(String name, int num) {
          if(contacts < capacity) {
               this.name[idxName ++] = name;
               contacts ++;
               this.num[idxNum ++] = num;
               System.out.println("The contact of " + name + " is added.");
          } else {
               System.out.println("Storage Full!!");
          }
     }
     
     public void makeCall(int num) {
          boolean saved = false;
          for(int i = 0; i < contacts; i ++) {
               if(this.num[i] == num) {
                    System.out.println("Calling " + name[i] + " . . .");
                    saved = true;
                    break;
               } 
          }
          if(!saved) {
               System.out.println("Calling " + num + " . . .");
          }
     } 
}
