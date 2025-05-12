public class threaddemo extends threading{
    public static void main(String[] args) {
        threaddemo thr = new threaddemo();
        thr.start();

        threaddemo thr2 = new threaddemo();
        thr2.start();


    }
    
    public void run(){
        
        int sum=0;
        for(int i=0;i<5;i++){
            sum+=i;
        }
        System.out.println(sum);
        
    }
}
