public class sum_nat{
    public static void main(String[] args) {
        int num = 5;
        int sum = sumnat(num);
        
        System.out.println("print: "+sum);
    }
    
    public static int sumnat(int num ){
        if (num == 1 || num == 0)
        return 1;
        else
        return num+sumnat(num-1);
S
    }
}