package main;

import ejercicio1.*; // IMPORTAMOS LOS PAQUETES Y SUS CONTENIDOS PARA PODER USARLOS
import ejercicio2.*;
import ejercicio3.*;
import ejercicio4.*;





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
		
		
		
		
		
		// EJERCICIO 3
		System.out.println("--------------------------------");
		Empleado em1= new Vendedor("JUAN", 5222.22);
		System.out.println( em1.resumen());
		System.out.println("--------------------------------");
		
		
		
		
		
		
		// EJERCICIO 4
		System.out.println("--------------------------------");
		Cuenta c1= new CuentaAhorro(1000);
		c1.depositar(500);
		System.out.println("--------------------------------");
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
