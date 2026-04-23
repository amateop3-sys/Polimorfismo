package ejercicio10;

public class TrabajadorPorHora extends Trabajador{ // HERENCIA DE LA CLASE TRABAJADOR
	
	// ATRIBUTOS
	private int HorasTrabajadas;
	private double PagoPorHora;
	
	 // CONSTRUCTOR
	public TrabajadorPorHora(int horasTrabajadas, double pagoPorHora) {
		super();
		HorasTrabajadas = horasTrabajadas;
		PagoPorHora = pagoPorHora;
	}

	

	// GETTERS AND SETTERS
	public int getHorasTrabajadas() {
		return HorasTrabajadas;
	}
	public void setHorasTrabajadas(int horasTrabajadas) {
		HorasTrabajadas = horasTrabajadas;
	}


	public double getPagoPorHora() {
		return PagoPorHora;
	}
	public void setPagoPorHora(double pagoPorHora) {
		PagoPorHora = pagoPorHora;
	}



	@Override
	public double calcularPago() { // SOBREESCRITURA DEL METODO CALCULAR PAGO
		return HorasTrabajadas*PagoPorHora; // RETORNAMOS EL TOTAL A PAGAR SUMANDO LAS HORAS DE TRABAJO CON EL PAGO POR HORA
	}
	
	
	
	
	
	
	
	
	

}
