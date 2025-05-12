package Java_programs;

public class Exception {
    public static void main(String[] args){
        int num1 = 40;
        int num2 = 0;
        float div = 0;

        try{
        div = num1/num2;
        }
        catch(ArithmeticException e){
                System.out.println("Zero division is not possible"+e);
                e.printStackTrace();
        }
        finally{
            System.out.println("Please learn basic maths");
        }
        System.out.println(div);
    }
}
