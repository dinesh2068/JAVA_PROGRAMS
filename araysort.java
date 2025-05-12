import java.util.Arrays;

public class araysort {
    public static void main(String[] args) {
        int [] arr = {3,5,7,24,63};
        int ele = 53;

        int[] newarr = new int[arr.length+1];
        for(int i=0;i<arr.length;i++)
        {
            newarr[i] = arr[i];
        }
        newarr[newarr.length-1] = ele;
        Arrays.sort(newarr);

       
        for(int i=0;i<newarr.length;i++)
        {
            System.out.println(newarr[i]);
        }
    }3
    
}
