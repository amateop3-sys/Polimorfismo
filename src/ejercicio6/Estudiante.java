package ejercicio6;

public class Estudiante extends Persona{ // HERENCIA DE CLASE PADRE PERSONA

	   private String nombre; // ATRIBUTOS PROPIOS
	   private String carnet;
	   private String carrera;
	   
	   
	
	   public Estudiante(String nombre, String carnet, String carrera) {
		super();
		this.nombre = nombre;
		this.carnet = carnet;
		this.carrera = carrera;
	}


	

	   public String getNombre() {
		return nombre;
	}

	   public void setNombre(String nombre) {
		   this.nombre = nombre;
	   }




	   public String getCarnet() {
		   return carnet;
	   }
	   public void setCarnet(String carnet) {
		   this.carnet = carnet;
	   }




	   public String getCarrera() {
		   return carrera;
	   }
	   public void setCarrera(String carrera) {
		   this.carrera = carrera;
	   }


	   
	   // SOBREESCRITURA DEL METODO PRESENTARSE
	   @Override
	   public void presentarse() {
		System.out.println("NOMBRE: "+nombre+ "\nCARNTE: "+carnet+ "\nCARRERA: "+ carrera);
	   
	   }
	
	

}
