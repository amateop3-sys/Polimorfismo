package ejercicio8;

public class ProductoDigital extends Producto{ // HERENCIA DE LA CLASE PRODUCTO

	private String codigo; // ATRIBUTO ADICIONAL

	
	public ProductoDigital(String nombre, double precio, String codigo) {
		super(nombre, precio);
		this.codigo = codigo;
	}
	

	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	@Override
	public void mostrarDescripcion() { // SOBREESCRITURA DEL METODO MOSTRARDESCRIPCION
		System.out.println("NOMBRE: "+nombre +"\nPRECIO: "+precio +"\nCODIGO: "+codigo);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
