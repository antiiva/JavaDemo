//вывод на консоль заданного количества случайных чисел
import java.util.Random;
import java.util.*;

public class RandomRunner{

	//private static int number;
	
	public static void main(String[] args) throws InputMismatchException{
		 int number = 0;
		System.out.println("Enter number: ");
		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNextInt()){
			number = scanner.nextInt();
			for (int i = 0; i < number; i++){
				int res = (int)(new Random().nextDouble()*100);
				System.out.print(res + " ");
			}
			scanner.close();
		}
	}
}