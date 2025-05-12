public class complement {
    public static void main(String[] args){
        int a = 5 , b = 6;
        int result = 0;
        int last_bit = a&1;
        result = last_bit | 1;
        System.out.println(result);
        
    }
}
