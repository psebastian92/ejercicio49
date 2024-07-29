package funciones;

import java.util.Scanner;

public class funciones {
	static Scanner entrada = new Scanner(System.in); // este Scanner es global a toda la clase
	static String apellido; // variable global "apellido"
	static float altura = 1.8f; // variable global "altura", flotante, que se le asigna 1,8
	
	// FUNCION VACIA LLAMADA INGRESARNOMBRE(). No espera ningun parametro, solo tiene instrucciones. 
	public static void ingresarNombre() {
		System.out.println("Ingresa tu nombre: ");
		String nombre = entrada.nextLine();
		System.out.println("Ingresa tu apellido: ");
		apellido = entrada.nextLine();
	}
	
	// FUNCION FLOTANTE LLAMADA ALMACENARALTURA(). Espera como parámetro un numero flotante, almacenado en "Altura".
	public static float almacenarAltura(float Altura) {
		System.out.println("Ingrese la altura de la persona: ");
		altura = entrada.nextFloat();
		return altura;
	}
	
	// FUNCION ENTERA LLAMADA FILTRAREDAD(). Espera un parámetro entero, almacenado en "Edad"
	public static int filtrarEdad(int Edad) {
		
		if (Edad >=18) {
		System.out.println(Edad+" años: Edad permitida.");
		}
		else {
			System.out.println(Edad+"años: Edad NO permitida.");
			Edad = -1; //Esto es solo una lógica pensada por el programador. No es obligatorio.
		}
		
		return Edad;
	}
	
	// FUNCION ANALIZARSITRABAJA (con parámetro "respuesta" del tipo String)
	public static boolean analizarSiTrabaja (String respuesta) {
		
		if (respuesta.equalsIgnoreCase("si")) { // ¿es "respuesta" igual a "sí"? (ignorando mayus y minus)
			return true;
		} else {
			return false;
		}
	}
	
	// FUNCION CANTIDADANIMALES VOID (CON PARÁMETROS "perros" y "gatos", ambos enteros)
	public static void cantidadAnimales(int perros, int gatos) {
		System.out.println("La cantidad de perros es: "+ perros);
		System.out.println("La cantidad de gatos es: "+ gatos);
	}

	
	// FUNCION PRINCIPAL
	public static void main(String[] args) {
		ingresarNombre();
		System.out.println("");
		
		System.out.println("Apellido: "+apellido);
		System.out.println("La altura de la persona es: " + almacenarAltura(altura));
		System.out.println("");
		
		System.out.println("La edad de la persona es: "+filtrarEdad(15) );
		// Un syso tambien es una funcion. Dentro de ella, se llama a la funcion "filtrarEdad()".
		System.out.println("");
		
		System.out.println("Trabaja? "+ analizarSiTrabaja("no") );
		System.out.println("");
		
		cantidadAnimales(5, 7); 
		// Por programa, le paso como argumento "5" a "perros", y "7" a "gatos" (ver función en línea 49)
		System.out.println("");
	}

}