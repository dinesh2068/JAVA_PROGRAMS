public class reverse_bit {
    public static void main(String[] args) {
        int number = 10;
        int result = 0;
        for (int i =0 ;i<32;i++){
            result <<=1;
            int bit  = number & 1;
            result = result | bit ;
            number >>= 1;

        }
        System.out.println(result);
    }
}
