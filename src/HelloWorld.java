import java.util.Scanner;


public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Name = "";
		float myNumber = 0;
		Scanner input = new Scanner(System.in);
         System.out.println("Enter Your Name: ");
         Name = input.nextLine();
         System.out.printf("Your name is: %s ", Name);
         System.out.print("Rate this program from 1 to 10: ");
         myNumber = input.nextFloat();
         System.out.printf("Your ratings are %.2f", myNumber);
         
	}

}
