public class Main {
    
    public static int fibo(int n){
        // base condition 
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        
        // logic 
        return fibo(n - 1) + fibo(n - 2);
    }
    
	public static void main(String[] args) {
	    System.out.println(fibo(6));
	}
}
