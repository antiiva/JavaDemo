import java.io.*;

public class ReadCharRunner{
	public static void main(String[] args){
		int x;
		while (true){
		try{
			x = System.in.read();	
			char c = (char) x;
			System.out.println("The code of symbol " + c + " is " + x);
		} catch (IOException e){
			System.err.println("error " + e);
		}
		}
	}
}