package Java_programs;

public class patterns {
    // public static void main(String[] args) {
    //     int m = 10, k = 1;
    //     for (int i = m; i >= 1; i--) {
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print(k + " ");
    //             k++;
    //         }
    //         System.out.println("");
    //     }
    // }
    public static void main(String[] args) {
        int m = 10,k=1;
        for( int i=m ;i>=1;i--){
            for(int j=i;j>=1;j++){
                System.out.print(k + " ");
                k++;
            }
            System.out.println("");
        }
    }

}