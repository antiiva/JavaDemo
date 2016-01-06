import java.util.Scanner;

public class CheckPassword {

	public static void main(String[] args) {
		String password = "Intel";
		System.out.print("Enter password: ");
		Scanner scan = new Scanner(System.in);
		if (scan.hasNext()){
			String attempt = scan.next();
			if (password.equals(attempt))
				System.out.println("Password is correct!");
			else System.out.println("Access denied.");
		}
		scan.close();
	}

}
