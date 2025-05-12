import java.util.Arrays;

public class twoarradd {
    public static void main(String[] args) {
        int[] arr1 = {1,4,9,13,42};
        int[] arr2 = {3,5,7,24,63};

        int[] newarr = new int[arr1.length+arr2.length];

        for(int i=0;i<arr1.length;i++){
            newarr[i] = arr1[i];
        }
        
        for(int i=0;i<arr2.length;i++){
            newarr[arr1.length+i] = arr2[i];
        }   

        Arrays.sort(newarr);
        System.out.println(Arrays.toString(newarr));
    }
}
