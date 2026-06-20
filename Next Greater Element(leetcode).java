import java.util.*;
public class Main
{
    public static void nextGreaterElement(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        // Traversal from right to left 
        for(int i = n - 1; i >= 0; i--) {
            while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }
            st.push(arr[i]);
        }
        System.out.println("This is your next Greater element array");
        for(int i = 0; i < n; i++) {
            System.out.println(ans[i] + " ");
        }
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array...");
		int n = sc.nextInt(); 
	    System.out.println("Enter the elements of an array...");
	    int[] arr = new int[n];
	    for(int i = 0; i < n; i++) {
	        arr[i] = sc.nextInt();
	    }
        nextGreaterElement(arr);
	}
	
}
