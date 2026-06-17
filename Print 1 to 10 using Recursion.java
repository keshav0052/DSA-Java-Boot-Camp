public class Main {
        
    public static void printNumber(int n) {
        // base condition 
        if(n > 10){
            return;
        }
        // logic 
        System.out.print(n + " ");
        printNumber(n+1);
    }    
	public static void main(String[] args) {
	    printNumber(1);
	}
}
