
	import java.util.Scanner;

	public class Fibonacci
	{
	    public static void main(String[] args)
	    {
	        
	    Scanner in = new Scanner(System.in);
	    System.out.println("Ingresa un número:");
	    
		int n= in.nextInt();
		int fibonacci=n , suma=0 , suma1 = 1, cont=0; 
		do {
			fibonacci= suma;
			suma = suma1;
			suma1 = fibonacci + suma;
			
			System.out.println("Fibonacci" + " = n(" + cont + ")");
			cont++;
			in.close();
		}while (cont <=n);		
			
		}//Main
}//Class Fibonacci