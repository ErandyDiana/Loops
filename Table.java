
	import java.util.Scanner;

	public class Table
	{
	    public static void main(String[] args)
	    {
	        Scanner console = new Scanner(System.in);
	        boolean comprobar = true;
	        // variable que solo toma valores de verdadero o falso
	        
	        int n, i=1;
	      //Ciclo mostrar tabla de multiplicar del número de entrada dado.
	    	while ( comprobar == true) {
	        // while, si no sabemos cuantas veces se va repetir el ciclo 
	        System.out.println("Iingresa un número entero positivo: ");
	        n = console.nextInt();
	        if (n > 0) {
	        	while (i<=10) {
	        		 System.out.println(n+" por "+i+" es igual a: "+n*i );i++;
	     /*   	 for(int i = 1; i >= 10; i++)
	        		 System.out.println(n+" por "+i+" es igual a: "=+n*i ");
	        }
	        //el ciclo for lo usamos siempre y cuando sabemos cuantas veces se va a repetir un bucle, en este es del 1 al 10
	        */
	        
	        	}		 
	        comprobar = false;
	        }
	        //terminar el ciclo while para que no lo corra infinitas veces
	        else {
	        	 System.out.println("El número ingresado no es correcto. " + "Inténtelo nuevamente.");
	        }//else
	        
	     	}//while 
	    }// main
	    }// class Table