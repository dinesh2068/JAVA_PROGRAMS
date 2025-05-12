public class recursion_gcd {
    public static void main(String[] args){
        int a = 12;
        int b = 18;

        int result = recugcd(a,b);
        System.out.printf("The Gcd of %d and %d is : %d",a,b,result);
    }

    private static int recugcd(int a, int b) {
        if(b != 0)
           return recugcd(b, a%b);

        return a;
    }

}