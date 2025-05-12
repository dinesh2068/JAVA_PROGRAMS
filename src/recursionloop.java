public class recursionloop {
  public static void main(String[] args) {
    int start = 1;
    int end = 100;
    interate(start,end);
    }
    
    public static void interate(int start,int end){
        if (start>end)
        return;

        System.out.println( start);
        interate(start+1, end);
    }


}
