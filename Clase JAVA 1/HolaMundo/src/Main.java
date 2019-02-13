import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//System.out.println("Hola mundo");
	
	System.out.println("------INIICIO PROGRAMA------------");
	
    Scanner sc = new Scanner(System.in);
    /* 
    String cadena = sc.next();
    
    System.out.println("Mi cadena introducida es: "+cadena);
    */
    
    
    float entradaA = sc.nextInt();
    System.out.println("Entrada A -----> "+entradaA);
    
    float entradaB = sc.nextInt();
    System.out.println("Entrada B -----> "+entradaB);
    
    suma(entradaA, entradaB);
    multi(entradaA, entradaB);
    divi(entradaA, entradaB);
    
    System.out.println("------FIN PROGRAMA------------");
	
	//llamada a metodos
	/*	
	suma(3, 2);
	resta(3, 2);
	
	int a = 2;
	int b = 4;
	*/	
	/*tipos primitivos*/
		/*
		int numero = 0;
		
		boolean boleano = false;
		
		char letra = 'a';
		
		double double1 = 2.00;
		
		float decimal =  2.33333f;
		*/
		/*estos dos no son primitivos*/
		/*
		Integer numero2 = 1;
		Character letra2;
		*/
	
	
		
	}
	
	//Metodo suma 
	public static void suma (float a, float b) {
		
		float resultado = a + b; 
		
		System.out.println("El resultado de mi suma es: "+resultado);
		
		
	}
	
		//Metodo multiplicacion
	public static void multi (float a, float b) {
		
		float resultado = a * b; 
		
		System.out.println("El resultado de mi multi es: "+resultado);
		
		
	}
	
		//Metodo division 
	public static void divi (float a, float b) {
		
		float resultado = a / b; 
		
		System.out.println("El resultado de mi divi es: "+resultado);
		
		
	}
	/*
	//Metodo resta
	public static void resta (int a, int b) {
		
		int resultado = a - b; 
		
		System.out.println("El resultado de mi resta es: "+resultado);
		
		
	}
*/
}
