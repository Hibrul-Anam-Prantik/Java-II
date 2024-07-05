package Practice;

public class Rough {
    public static void main(String[] args) {
        String s = "adamm";
        s = s.toLowerCase();
        int k = 1;
        int l = 0;
        for (int j = 0;; j++) {
            String ns = "";
            for (int i = 0; i < s.length(); i++) {
                char c1 = s.charAt(l++);
                if (i == 0) {
                    char c2 = s.charAt(k++);
                    ns += c2;
                    ns += c1;
                } else if (i == 1) {
                    continue;
                } else {
                    ns += c1;
                }
            }
            System.out.println(ns);
            if (j == 10) {
                break;
            }
        }
    }
}
