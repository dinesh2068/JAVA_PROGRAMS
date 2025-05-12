public class threading {
    public static void main(String[] args) {
        threading thread = new threading();
        thread.start();

        threading thread2 = new threading();
        thread2.start();

        threading thread3 = new threading();
        thread3.start();
        
    }
    
    protected void start() {
        for(int i=0;i<5;i++){
            System.out.println(i);
        }
    }
}
