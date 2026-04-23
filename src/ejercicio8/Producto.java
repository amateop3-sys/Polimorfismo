package ejercicio8;

public class Producto {
	
	protected String nombre; // ATRIBUTOS
	protected double precio;
	
	// CONSTRUCTOR
	public Producto(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	
	
	
	// METODO MOSTRAR LA DESCRIPCION
	public void mostrarDescripcion() {
		System.out.println("NOMBRE DE PRODUCTO: "+nombre + "\nPRECIO: "+precio);
	}
	
	
	
	
	
	
	

}
