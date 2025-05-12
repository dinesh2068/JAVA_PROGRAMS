import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {5,10,15};
        for (int i=0;i<arr.length;i++){
            if (arr[i]>arr[i+1]){
                System.out.println("Increasing");
            }
            else{
                System.out.println("Decreasing");
            }
        }
    }
}
