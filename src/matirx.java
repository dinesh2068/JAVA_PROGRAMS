public class matirx {
    public static void main(String[] args) {
        // int[][] mat = {{3,0,0,0,0},{0,3,0,0,0},{0,0,1,0,0},{0,0,0,4,0},{0,0,0,0,5}};
        // int[][] mat = {{3,0,0},{2,3,0},{1,2,3}};
        // int[][] mat = {{1,2,3},
        //                 {0,3,3},
        //                 {0,0,3}};
        int[][] mat = {{2,3,6},
                        {3,4,5},
                        {6,5,9}};
        boolean flag = true;

        for (int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if( mat[i][j] != mat[j][i]){
                    flag = false;
                    
                }
                }
        }
        
        if (flag){
            System.out.println("It is a Symmetric matrix");
        }
        else{
            System.out.println("It is an ASymmetric matrix");
        }
    }
}
