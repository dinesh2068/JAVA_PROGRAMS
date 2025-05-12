package Java_programs;

import java.util.Scanner;

public class switchstate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0;

        while (true) {

            System.out.println("Enter the choice\n1)Add\n2)Subtract\n3)Multiply\n4)Exit");
            int choice = sc.nextInt();
            if (choice == 4) {
                System.err.printf("Exited...");
                System.exit(0);
            } else if (choice <=3) {
                System.out.println("Enter the number1:");
                num1 = sc.nextInt();
                System.out.println("Enter the number2:");
                num2 = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.err.printf("\nThe Addition of %d and %d is %d", num1, num2, num1 + num2);
                        break;
                    case 2:
                        System.err.printf("\nThe Subtraction of %d and %d is %d", num1, num2, num1 - num2);
                        break;
                    case 3:
                        System.err.printf("\nThe Multiplication of %d and %d is %d", num1, num2, num1 * num2);
                        break;
                    case 4:

                        break;
                }
            } else{
                System.out.println("Invalid choice....");
            }
        }
    }
}
