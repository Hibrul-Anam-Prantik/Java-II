package Practice;

public class SubString {
    public static void main(String[] args) {
        String s = new String("12:01:00AM");
        String amPM = s.substring(s.length() - 2);
        String hour = s.substring(0, 2);
        String str = s.substring(2, s.length() - 2);
        String time = "";
        // System.out.println(amPM);
        // System.out.println(hour);
        // System.out.println(str);
        int hourInt = Integer.parseInt(hour);
        System.out.println(hourInt);
        if(amPM.equals("AM")) {
            if(hourInt == 12) time = "00" + str;
            else time = s.substring(0, s.length() - 2);
        } else {
            if(hourInt != 12) hourInt += 12;
            time = hour + str;
        }
        System.out.println(time);
    }
}