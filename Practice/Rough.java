package Practice;

public class Rough {
    public String model="Unknown";

    public int count=0;
    public String s[]= new String[10000]; // assumption

    public void printDetails() {
        System.out.println("Phone Model "+model);

        //System.out.println("Contacts Stored "+count);
        if (count==0) {
            System.out.println("Contacts Stored "+count);
        } else if (count>0 && count<4) {
            System.out.println("Contacts Stored " + count);
            System.out.println("Stored Contacts:");
            for (int i = 0; i < count; i++) {
                System.out.println(s[i]);
            }
        }
        if(count>3){
            System.out.println("Contacts Stored " + (count - 1));
            System.out.println("Stored Contacts:");
            for (int i = 0; i < count - 1; i++) {
                System.out.println(s[i]);
            }
        }
    }

    public void storeContact(String a) {

        this.s[count++] = a;
        // System.out.println("Contact Stored");
        if(count>=4){
            System.out.println("Memory full. New contact can't be stored.");
        } else {
            System.out.println("Contact Stored");
        }
    }
}
