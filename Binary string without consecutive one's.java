public class Main {
    
    public static int binaryString(int n){
        // base condition 
        if(n == 0){
            return 1;
        }
        if(n == 1){
            return 2;
        }
        
        // logic 
        return binaryString(n - 1) + binaryString(n - 2);
    }
    
	public static void main(String[] args) {
	    System.out.println(binaryString(5));
	}
}
