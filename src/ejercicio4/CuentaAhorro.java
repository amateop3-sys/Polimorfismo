package ejercicio4;

public class CuentaAhorro extends Cuenta{ // HERENCIA DE LA CLASE CUENTA


	public CuentaAhorro(double saldo) {
		super(saldo);
	}


	
	@Override
	public void depositar(double monto) {
		double interes= monto*0.05; // AGREGAMOS UN INTERES
		saldo+= monto+ interes;
		System.out.println("DEPOSITO CON INTERES...");
		System.out.println("SALDO ACTUAL: "+ saldo); // VA ACTUALIZAR NUESTRO SALDO ACTUAL
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
