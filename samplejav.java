package Java_programs;
// import java.util.*;

// public class samplejav {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number");
//         int n = sc.nextInt();
//         int temp = n;
//         int rem = 0;
//         int digit = 0;
//         int a =0 , count = 0;
//         if (n<0){
//             a = Math.abs(n);
//             temp = a;

//         }
//         while (temp > 0){
//             rem = temp%10;
//             digit = digit*10+ rem;
//             temp/=10;
//             count++;
//         }
//         System.out.println("The reversed Number is "+digit+"\nNo of Iterations "+count);
//         if (n == digit){
//             System.out.println("The Number is Palindrome");

//         }else{
//             System.out.println("The Number is not a Palindrome");
//         }
//     }
// }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// import java.util.*;

// public class samplejav{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         String name = sc.nextLine();
//         int i=0;
//         String v = ""; 
//         // char var = name.charAt(0);
//         for(i=name.length()-1;i>=0 ;i--){
//             v = v + name.charAt(i);

//     }   
//     // System.out.println(v);
//     if (name.equals(v)){
//         System.out.println("The Given Word is Palindrome");
//     }
//     else{

//         System.out.println("The Given Word is not a Palindrome");
//     }
// }   
// }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// import java.util.*;

// public class samplejav{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         LinkedList list  = new LinkedList<>();
//         int n = sc.nextInt();
//         int i,j;
//         // boolean flag;

//         for(i=1;i<=n;i++){
//             int count=0;
//             for (j=1;j<=i;j++){
//             if (i%j == 0){
//                     count++;
//             }
//             }
//             if (count == 2){
//                 list.add(i+" Prime");
//             }
//             else{
//                 list.add(i+" Not Prime");
//             }
//             if (count  ==2){
//                 System.out.println(i+" Prime");

//             }
//             else{
//                 System.out.println(i+" Not Prime");
//             }
//         }        System.out.println("Prime list:\n"+list);        
//     }
// }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// import java.util.*;
// public class samplejav{
//     public static void main(String[] args) {

//         // Scanner sc = new Scanner(System.in);
//         int a=12,b=18;
//         int x = a, y = b;
//         int result = 0;

//         while(b>0){
//             if ((b&1)==1){
//                 result +=a;
//             }
//             a<<=1;
//             b>>=1;
//         }
//         System.out.printf("The Mutiplicatoin of %d and %d is %d",x,y,result);
//     }
// }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// import java.util.*;

// public class samplejav{
//     public static void main(String[] args) {
//         int dividend = 18;
//         int divisor  = 6;
//         int quotient  = 0,rem = 0;

//         while (dividend >= divisor){
//             int tempdivisor = divisor;
//             int mul = 1;

//             while ((tempdivisor << 1) <= dividend) {
//                 tempdivisor <<= 1;
//                 mul <<= 1;
//             }
//             dividend-=tempdivisor;
//             quotient+=mul;

//         }
//         rem = dividend;
//         System.out.printf("Quotient = %d \nRemainder = %d",quotient,rem);

//     }
// }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// import java.math.BigInteger;
// import java.util.*;

// public class samplejav{
//     public static void main(String[] args) {
//         System.out.println("Enter the Number:");
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int count = 0;
//         // int temp = num;
//         // int j = 5;
//         int i = 0;
//         // int count1 =0,count2 = 0;
//         // int factfor = 0,factwhile= 0;
//         int factiter  = 0,factzero=0;
//         BigInteger fact = BigInteger.ONE;
//         for (i=1;i<=num;i++){
//             fact = fact.multiply(BigInteger.valueOf(i));
//             factiter++;
//         }
//         for(i=5;i<=num;i*=5){
//             count+=num/i;
//             // count1+=num/i;
//             // factfor ++;
//             factzero++;
//         }
//         // while(j<=temp){
//         //     count += num/j;
//         //     // count2+=temp/j;

//         //     j*=5;
//         //     factzero++;
//         //     // factwhile++;
//         // }
//         System.out.printf("The Factorial of %d is %d and the count of zero is %d",num,fact,count);
//         System.out.printf("\n\nThe Number of iterations in FInding the factoiral is %d \n\nThe Number of iterations in Finding the trailing zeros is %d",factiter,factzero);
//         // System.out.printf("The Number of zeros in for loop is %d \nThe Number of Zeros in while loop is %d",count1,count2);
//         // System.out.printf("\nThe Total iteration is for loop is %d\nThe Total iteration in while loop is %d",factfor,factwhile);
//     }
// }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// import java.util.Scanner;

// public class samplejav {

//     @SuppressWarnings("resource")
//     public static void main(String[] args){
//         System.out.println("Enter the Number: ");
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         // for (int i=1;i<=num;i++){
//         //     ARMstrong(i);
//         // }
//         ARMstrong(num);
//     }
//     static void ARMstrong(int num){
//         int len = Integer.toString(num).length();
//         int temp=num;
//         int digit =0;
//         int rem = 0;
//         while (num != 0) {
//             int power = 1;
//             rem = num%10;
//             for (int i =0 ; i<len;i++){
//                 power*=rem;
//             }
//             digit +=power;
//             // digit += Math.pow(rem, len);
//             num/=10;
//         }
//         if (temp == digit){
//             System.out.println("The Number "+temp+" is a ARMstrong number");
//         }else{
//             System.out.println("The Number "+temp+" is a not ARMstrong number");
//         } 
//     }
// }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// import java.util.*;

// public class samplejav {

//     public static void main(String[] args) {
//         System.out.println("Enter the number: ");
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int temp = num;
//         int digit = 1;
//         for (int i = 2; i < num; i++) {
//             if (num % i == 0) {
//                 digit += i;
//             }

//         }
//         if (temp == digit) {
//             System.out.println("The given Number " + temp + " is a Perfect NUmber");
//         } else {
//             System.out.println("The given Number " + temp + " is a not Perfect NUmber");

//         }

//     }
// }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// import java.util.Scanner;

// public class samplejav {
//     public static void main(String[] args) {
//         System.out.println("Enter the NUmber: ");
//         Scanner sc = new Scanner(System.in);
//         float num = sc.nextFloat();
//         float left = 1;
//         float right = num;
//         float cube = 0;
//         while (left <= right) {
//             float mid = (left + right) / 2;
//             cube = mid * mid * mid;
//             if (cube > num) {
//                 right = mid;
//             } else {
//                 left = mid;
//             }
//         }

//         System.out.println("The Cube root of " + num + " is " + cube);
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class samplejav {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1:");
        int num1 = sc.nextInt();
        System.out.println("Enter the number2:");
        int num2 = sc.nextInt();
        System.out.println("Enter the choice\n1)Add\n2)Subtract\n3)Multiply");
        int operator = sc.nextInt();
        switch (operator) {
            case 1:
                System.err.printf("The Addition of %d and %d is %d",num1,num2,num1+num2);
                break;
            case 2:
                System.err.printf("The Subtraction of %d and %d is %d",num1,num2,num1-num2);
                break;
            case 3:
                System.err.printf("The Multiplication of %d and %d is %d",num1,num2,num1*num2);
                break;
            default:
            System.err.printf("No operator found");
            break;
        }
    }
}