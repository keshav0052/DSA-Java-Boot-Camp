import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		boolean palindrome = true;
		
		int left = 0;
		int right = str.length() - 1;
		
		while(left < right) {
		    if(str.charAt(left) != str.charAt(right)) {
		        palindrome = false;
		        break;
		    }
		    left++;
		    right--;
		}
		if(palindrome) {
		    System.out.println("Given string is a palindrome...");
		} else {
		    System.out.println("Given string is not a Palindrome...");
		}
	}
}
