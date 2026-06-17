public class Main {
    
    public static int tiling(int n){
        // base condition 
        if(n < 4){
            return 1;
        }
        
        // logic 
        return tiling(n - 1) + tiling(n - 4);
    }
    
	public static void main(String[] args) {
	    System.out.println(tiling(5));
	}
}
