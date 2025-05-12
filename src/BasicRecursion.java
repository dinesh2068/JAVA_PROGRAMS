public class recusion_reverse {
    public static void main(String[] args) {
        String str = "four";
        String result = reverse(str);
        System.out.println("The reversed string: "+ result);
    }

    private static String reverse(String str) {
        if (str.length() == 0)
        return str;

        else
        {
        String dr = reverse(str.substring(1)) + str.charAt(0);
        System.out.println(dr);
        return dr;
        }
    }
}
