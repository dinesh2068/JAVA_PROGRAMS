public class recursion_fact{
    public static void main(String[] args) {
        int num = 5;
        int fact = factorial(num);
        
        System.out.println("print: "+fact);
    }
    
    public static int factorial(int num ){
        if (num == 1 || num == 0)
        return 1;
        else
        return num*factorial(num-1);

    }
}