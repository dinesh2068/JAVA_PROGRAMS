public class recursion {
    public static void main(String[] args){
        msg(5);
    }

    static void msg(int count){
        if (count<1)
        return;

        System.out.println("hello");
        msg(count-1);
    }
}
