    public static void printNumber(int n) {
        // base condition 
        if(n < 1){
            return;
        }
        // logic 
        System.out.print(n + " ");
        printNumber(n - 1);
    }    
	public static void main(String[] args) {
	    printNumber(10);
	}
}
