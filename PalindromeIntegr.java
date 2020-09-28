package java_fundamentals;

import java.util.Scanner;

public class PalindromeIntegr {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        String input=s.nextLine();

        while(!"END".equals(input)){
            int number=Integer.parseInt(input);
            if(isPalindrome(number)) System.out.println("true");
            else System.out.println("false");
            input=s.nextLine();
        }
    }

    private static boolean isPalindrome(int number) {
        int orginalNumber=number;
        int palindrome=0;
        while (number > 0) {
            int digit=number%10;
            palindrome=palindrome*10+digit;
            number/=10;
        }
        boolean result=orginalNumber==palindrome;
        return result;
    }

}
