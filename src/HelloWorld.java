import java.io.*;
import java.util.*;

public class HelloWorld {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter your name: ");
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		System.out.println("This is the third branch version!");
		System.out.println("Hello, " + s + ", from secondary Eclipse!");
	}

}
	