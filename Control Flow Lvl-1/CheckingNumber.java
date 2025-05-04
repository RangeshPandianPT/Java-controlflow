import java.util.Scanner;

public class CheckingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter The Number : ");
        int n = scanner.nextInt();

        if (n > 0) {   
            System.out.println("Number is Positive");
        } 
		else if (n <0){
            System.out.println("The Number is Negative.");
        }
		else {
			System.out.println("The Number is Zero.");
			}
		 
        scanner.close();
    }
}
