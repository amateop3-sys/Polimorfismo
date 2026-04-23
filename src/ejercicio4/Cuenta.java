package ejercicio4;

public class Cuenta {

	
	protected double saldo;

	public Cuenta(double saldo) {
		super();
		this.saldo = saldo;
	}
	
	
	public void depositar(double monto) {
		saldo+=monto;
		System.out.println("SALDO ACTUAL: "+saldo);
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
