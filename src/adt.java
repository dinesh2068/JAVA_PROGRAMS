class listdemo {
    static int[] data = new int [10];
    static int size = 0;

    public static void add(int x){
        if (size<data.length){
            data[size++] = x;

        }
        else{
            System.out.println("list is full");
        }
        
    }

    public static void remove(){
        if (size>0){
            size--;            
        }
        else{
            System.out.println("list is empty");
        }
    } 
    public static void get(int index){
        int flag= 0;
        for(int i=0;i<size;i++){
            if(i == index){
                flag = 1;
               System.out.println("Element at index "+index+" is "+data[i] );
            }
        }
        if (flag == 0){
            System.out.println("Element not found");
        }
    }

    public static int getsize(){
        return size;
    }

    public static void rotate(int[] data){


    }
}


public class adt {
    public static void main(String[] args) {
     
        listdemo.add(6);
        listdemo.add(12);
        listdemo.add(18);
        listdemo.get(2);
        listdemo.remove();
        System.out.println("size of the list:"+listdemo.getsize());
    }
}
