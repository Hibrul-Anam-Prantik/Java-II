package OOP;

import java.util.Scanner;

public class Array_Student_Info {
    public static void main(String[] args) {
        Designer ds = new Designer();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of the students: ");
        int num = sc.nextInt();
        ds.infoCollecter(num);
        ds.sort();
        ds.showDetails();
        sc.close();
    }
}

//
class Designer {
    public int length;
    public String[] names;
    public int[] id;
    Scanner sc = new Scanner(System.in);

    void infoCollecter(int length) {
        this.length = length;
        names = new String[length];
        id = new int[length];
        System.out.println("Enter the Name & ID of the Students-");
        for (int i = 0; i < length; i++) {
            System.out.print(i + 1 + ". Name: ");
            names[i] = sc.nextLine();
            System.out.print("ID: ");
            id[i] = sc.nextInt();
            sc.nextLine();
        }
        sc.close();
    }

    void sort() {
        for (int i = 0; i < length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < length; j++) {
                if (id[min] > id[j]) {
                    min = j;
                }
            }
            // Swap ID
            int tempId = id[min];
            id[min] = id[i];
            id[i] = tempId;
            // Swap Name
            String tempName = names[min];
            names[min] = names[i];
            names[i] = tempName;
        }
    }

    void showDetails() {
        System.out.println("Students' Details:");
        for (int i = 0; i < length; i++) {
            System.out.println(i + 1 + ". Name: " + names[i] + " - ID: " + id[i]);
        }
    }
}