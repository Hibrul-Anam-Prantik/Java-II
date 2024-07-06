package Tasks_LA04;

public class CellPhone {
    public String model = "unknown";
    public String[] arr = new String[1000];
    int count = 0;

    void printDetails() {
        System.out.println("Phone Model " + model);
        // System.out.println("Length of Array: "+arr.length);
        if (count == 0) {
            System.out.println("Contacts Stored " + count);
        } else if (count <= 3) {
            System.out.println("Contacts Stored " + count);
            System.out.println("Stored Contacts:");
            for (int i = 0; i < count; i++) {
                System.out.println(arr[i]);
            }
        } else {
            System.out.println("Memory full. New contact can't be stored.");
            System.out.println("Contacts Stored " + (count - 1));
            for (int i = 0; i < count-1; i++) {
                System.out.println(arr[i]);
            }
        }
    }

    void storeContact(String str) {
        System.out.println("Contact Stored");
        arr[count] = str;
        count++;
    }
}
