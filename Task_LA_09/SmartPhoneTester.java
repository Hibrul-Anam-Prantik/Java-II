package Task_LA_09;

import java.net.SocketOption;
import java.net.StandardSocketOptions;

public class SmartPhoneTester
{
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone();
        System.out.println("1===================");
        s1.addFeature("Display", "6.1 inch");
        System.out.println("2===================");
        s1.updateName("Samsung Note 20");
        s1.addFeature("Display", "6.1 inch");
        s1.printDetail();
        System.out.println("3===================");
        Smartphone s2 = new Smartphone("Iphone 12 Pro");
        s2.addFeature("Display", "6.2 inch");
        s2.addFeature("Ram", "6 GB");
        System.out.println("4===================");
        s2.printDetail();
        s2.addFeature("Display", "Amoled panel");
        s2.addFeature("Ram", "DDR5");
        System.out.println("5===================");
        s2.printDetail();
        System.out.println("6===================");
    }
}

class Smartphone
{
    String name;
    String[] features = new String[10];
    String[] properties = new String[10];
//    int count = 0;
    int index = 0;

    Smartphone() {}

    Smartphone(String name) {this.name = name;}

    void addFeature(String feature, String property) {
        if(name == null ) System.out.println("Feature can not be added without phone name");
        else {
            boolean flag = false;
            for(int i = 0; i < index; i++) {
                if(features[i].equals(feature)) {
                    properties[i] += ", " + property;
                    flag = true;
                }
            }
            if(!flag) {
                features[index] = feature;
                properties[index] = property;
                index ++;
            }
        }
    }

    void updateName(String name) {this.name = name;}

    void printDetail() {
        System.out.println("Phone Name: " + name);
        for(int i = 0; i < index; i++) {
            System.out.println(features[i] + ": " + properties[i]);
        }
    }
}