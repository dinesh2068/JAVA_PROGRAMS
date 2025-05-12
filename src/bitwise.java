public class bitwise {
    public static void main(String[] args){
        int number = 16;
        if((number & (number -1)) == 0){
            System.out.println("power of 2");
        }else{
            System.out.println("NOt a power of 2");
        }
    }
}
                      