public class Main {
        
    public static int factorial(int n) {
        // base condition 
        if(n == 1 || n == 0){
            return 1;
        }
        // logic 
        return n * factorial(n - 1);
    }    
	public static void main(String[] args) {
	    System.out.println(factorial(5));
	}
}
