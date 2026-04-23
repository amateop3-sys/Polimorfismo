package main;

import ejercicio1.*; // IMPORTAMOS LOS PAQUETES Y SUS CONTENIDOS PARA PODER USARLOS
import ejercicio2.*;
import ejercicio3.*;
import ejercicio4.*;
import ejercicio5.*;
import ejercicio6.*;
import ejercicio7.*;
import ejercicio8.*;
import ejercicio9.*;
import ejercicio10.*;


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
		
		
		
		
		
		// EJERCICIO 5
		System.out.println("--------------------------------");
		Transporte tr1= new Avion();
		System.out.println("ESTADO DEL AVION: ");
		tr1.moverse();
		System.out.println("--------------------------------");
		
		
		
		
		// EJERCICIO 6
		System.out.println("--------------------------------");
		Persona p1= new Estudiante("JUAN", "7855V45B", "INGENIERIA");
		p1.presentarse();
		System.out.println("--------------------------------");
		
		
		
		
		
		// EJERCICIO 7
		System.out.println("--------------------------------");
		Vehiculo v1= new Motocicleta();
		System.out.println("ESTADO DE LA MOTO: ");
		v1.encender();
		System.out.println("--------------------------------");
		
		
		
		
		
		
		// EJERCICIO 8
		System.out.println("--------------------------------");
		Producto pro1= new ProductoDigital("CHETTOS", 4.50, "5895FS5");
		pro1.mostrarDescripcion();
		System.out.println("--------------------------------");
		
		
		
		
		
		
		// EJERCICIO 9
		System.out.println("--------------------------------");
		Instrumento ins1= new Guitarra();
		System.out.println("GUITARRA: ");
		ins1.tocar();
		System.out.println("--------------------------------");
		
		
		
		
		
		
		// EJERCICIO 10
		System.out.println("--------------------------------");
		Trabajador tra1= new TrabajadorPorHora(8,55.2);
		System.out.println("PAGO POR HORA: "+tra1.calcularPago());
		System.out.println("--------------------------------");
		
		
		

	}

}
