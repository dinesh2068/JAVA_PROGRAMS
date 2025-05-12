import java.util.Scanner;

public class shift {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number  = sc.nextInt();
        int shift = number >> 1;
        System.out.println(" "+shift);
    }
}
