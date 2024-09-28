package Task_LA_09.Rez5;

public class SmartPhoneTester{
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


class Smartphone {
    private String name="";
    public  String[] fetaure=new String[10];
    public String[] properties=new String[10];
    public int count;
    public Smartphone(){}
    public  Smartphone(String a){
        name=a;
    }
    public void addFeature(String a,String b){
        if(name.equals("")){
            System.out.println("Feature can not be added without phone name");
        }
        else {
            boolean flag=false;
            for(int i=0;i<count;i++){
                if(fetaure[i].equals(a)){
                    properties[i]+=", "+b;
                    flag=true;
                    continue;

                }

            }
            if(!flag){
                fetaure[count] = a;
                properties[count] = b;
                count++;
            }
        }

    }
    public void printDetail(){
        System.out.println("Phone Name: "+name);
        for(int i=0;i<count;i++){
            System.out.println(fetaure[i] + ": " + properties[i]);
//            System.out.print(":");
//            System.out.print(" ");
//            System.out.print(properties[i]);
//            System.out.println();
        }
    }
    public void updateName(String a){
        name=a;
    }
}