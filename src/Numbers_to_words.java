import java.util.Scanner;

public class Numbers_to_words {

    public static void main(String[] args) {
        String[] num2words1 = {
                "", "One", "Two", "Three", "Four", "Five",
                "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
                "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
                "Eighteen", "Nineteen"
        };

        String[] num2words2 = {
                "", "", "Twenty", "Thirty", "Forty", "Fifty",
                "Sixty", "Seventy", "Eighty", "Ninety"
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number between 0 and 999: ");
        int num = sc.nextInt();
        String result = "";

        if (num == 0) {
            result = "Zero";
        } else if (num >= 1 && num <= 19) {
            result = num2words1[num];
        } else if (num >= 20 && num <= 99) { 
            int tens = num / 10;
            int ones = num % 10;
            result = num2words2[tens]; 
            if (ones > 0) {
                result += " " + num2words1[ones];
            }
        } else if (num >= 100 && num <= 999) { 
            int hundreds = num / 100; 
            int remainder = num % 100; 
            result = num2words1[hundreds] + " Hundred";

            if (remainder > 0) {
                result += " and ";
                if (remainder <= 19) {
                    result += num2words1[remainder];
                } else {
                    int tens = remainder / 10;
                    int ones = remainder % 10;
                    result += num2words2[tens]; 
                    if (ones > 0) {
                        result += " " + num2words1[ones]; 
                    }
                }
            }
        }

        else {
            result = "Number Out Of Range";
        }

        System.out.println("Converted to word it becomes: " + result);
    }

}