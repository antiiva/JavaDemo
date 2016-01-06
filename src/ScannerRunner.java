import java.util.*;

public class ScannerRunner{
	public static void main(String[] args){
		System.out.println("Input your name and press Enter...");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		System.out.println("Hello, " + s);
		scanner.close();
	}
}