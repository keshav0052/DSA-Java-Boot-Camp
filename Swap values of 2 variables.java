public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        
        a = sc.nextInt();
        b = sc.nextInt();
        
        // swapping 
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println(a);
        System.out.println(b);
    }
}
