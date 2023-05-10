/*Example 1
 * Input: x = 121
   Output: true
   Explanation: 121 reads as 121 from left to right and from right to left.

   Example 2
   Input: x = -121
   Output: false
   Explanation: From left to right, it reads -121. From right to left, it becomes 121-.
   Therefore it is not a palindrome.
 */

//import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        //Scanner scan = new Scanner(System.in);
        //System.out.print("Enter integer to check if the number is palondrome: ");
        //int nums = scan.nextInt();

        int x = 121; 
        System.out.print(isPalindrome(x));
    }
    
    public static boolean isPalindrome(int x) {
        if(x<0 || x!=0 && x%10 ==0 ) return false;
        int check=0;
        while(x>check){
            check = check*10 + x%10;
            x/=10;
        }
        return (x==check || x==check/10);
    }
}
