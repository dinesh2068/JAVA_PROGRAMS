public class count_bit {
    public static void main(String[] args) {
        int input =10;
        int mask=1;
        int counter =0;
        for(int i=0;i<32;i++){
            if((input&mask)!=0){
                counter++;
            }
            mask=mask<<1;
        }
        System.out.println(counter);
    }
}
