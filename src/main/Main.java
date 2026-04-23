package main;

import ejercicio1.*;
import ejercicio2.*;

public class Main {

	public static void main(String[] args) {


		// EJERCICIO 1
		System.out.println("--------------------------------");
		Animal an1= new Perro();
		an1.hacerSonido();
		System.out.println("--------------------------------");
		
		
		
		
		// EJERCICIO 2
		System.out.println("--------------------------------");
		Figura f1= new Rectangulo(55.2, 55.24);
		System.out.println("AREA: "+f1.area());
		System.out.println("--------------------------------");
		
		
		
		
		
		
		
		
		
		

	}

}
