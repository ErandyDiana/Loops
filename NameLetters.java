import java.util.Scanner;
public class NameLetters {

	public static void main(String[] args) {
		Scanner console = new Scanner( System.in );
		System.out.println("Ingresa tu nombre: ");
		String name = console.next();
		int cantidad = String.valueOf(name).length();
		printNameLength( name );
		printNameCharacter( name );
		
		console.close();

	}
private static void printNameLength( String name ) {
	System.out.println(name.length());
}
private static void printNameCharacter( String name )
	(int cantidad = String.valueOf( name ).length();
		for(int num=0;num<cantidad;num++) {
			System.out.println(name.charAt(num));

		}// for
}// main
