public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
    
    if(age >= 18) {
        if(age >= 100) {
            System.out.println("you can vote in your home only");
        } else {
            System.out.println("you can vote in the voting booth only");
        }
    } else {
        if(age < 0) {
            System.out.println("Enter a valid age number...");
        } else {
            System.out.println("you are not eligible for voting...");
            }
        }
    }
}
