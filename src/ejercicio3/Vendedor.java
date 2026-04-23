package ejercicio3;

public class Vendedor extends Empleado{ // HERENCIA
	
	
	private double comision; // ATRIBUTO UNICO

	public Vendedor(String nombre, double comision) {
		super(nombre);
		this.comision = comision;
	}

	
	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}


	@Override
	public String resumen() { // SOBREESCRIBIMOS EL METODO RESUMEN, VA A RETORNAR EL NOMBRE Y LA COMISION
		return "NOMBRE: "+nombre+ "\nCOMISION: "+comision;
	}

	
	
	
	
	
	
	
	
	
	
	
	

}
