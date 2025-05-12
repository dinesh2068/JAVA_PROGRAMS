import java.util.Scanner;

public class unique_char {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter string 1:");
    String s1 = sc.nextLine();
    System.out.println("Enter string 2:");
    String s2 = sc.nextLine();

    char result = 0;
    String concat = s1 + s2;
    char[] chars = concat.toCharArray();

    for(int i=0;i<chars.length;i++){
        result = (char) (result ^ chars[i]);
    }
    System.out.println("Unique: "+result);

}  
}
