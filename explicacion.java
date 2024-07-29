package funciones;

import java.util.Scanner;

public class explicacion {
	static Scanner entrada = new Scanner(System.in);
	static int n1, n2;
	// VARIABLES GLOBALES n1, n2: debo colocar al principio la palabra "static"
	
	public static void ingresarDatos() {
		System.out.println("Ingresa el primer numero a sumar: ");
		n1 = entrada.nextInt();
		
		System.out.println("Ingresa el primer numero a sumar: ");
		n2 = entrada.nextInt();	
	}
	
	public static int sumar(int num1, int num2) { // PARÁMETROS n1 y n2
	
		int suma = num1 + num2;
		
		System.out.println("El resultado de la suma es: "+suma);
		
		return suma;
	}
	
	// VOID (VACÍO): estas funciones NO devuelven valores. 
	public static void saludar() {
		System.out.println("Hola");
		System.out.println("Chau");
		System.out.println("");
	
	}
	public static void main(String[] args) {
		saludar();
		ingresarDatos();
		System.out.println("Resultado de la suma: " + sumar(n1,n2) );
		
		
	}
}
