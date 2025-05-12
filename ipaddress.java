import java.util.ArrayList;
import java.util.List;

public class ipaddress {
    public static void main(String[] args) {
        String s = "25525511135";
        List<String> result = new ArrayList<>();

        for (int i = 1; i <= 3 && i < s.length(); i++) {
            for (int j = i + 1; j <= i + 3 && j < s.length(); j++) {
                for (int k = j + 1; k <= j + 3 && k < s.length(); k++) {
                    String s1 = s.substring(0, i);
                    String s2 = s.substring(i, j);
                    String s3 = s.substring(j, k);
                    String s4 = s.substring(k);

                    if ((s1.length() > 1 && s1.startsWith("0")) || (s2.length() > 1 && s2.startsWith("0")) ||
                        (s3.length() > 1 && s3.startsWith("0")) || (s4.length() > 1 && s4.startsWith("0"))) {
                        continue;
                    }

                    int n1 = Integer.parseInt(s1);
                    int n2 = Integer.parseInt(s2);
                    int n3 = Integer.parseInt(s3);
                    int n4 = Integer.parseInt(s4);

                    if (n1 >= 0 && n1 <= 255 && n2 >= 0 && n2 <= 255 && n3 >= 0 && n3 <= 255 && n4 >= 0 && n4 <= 255) {
                        result.add(s1 + "." + s2 + "." + s3 + "." + s4);
                    }
                }
            }
        }

        System.out.println(result);
    }
}
