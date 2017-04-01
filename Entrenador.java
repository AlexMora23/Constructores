public class Entrenador extends SeleccionFutbol {
	int idFederacion;
	
	Entrenador(int id, String nombre, String apellidos, int edad,
			int idFederacion){
		super(id,nombre,apellidos,edad);
		this.idFederacion=idFederacion;
		
	}

	public int getIdFederacion() {
		return idFederacion;
	}

	public void setIdFederacion(int idFederacion) {
		this.idFederacion = idFederacion;
	}
	public void planificarEntrenamiento(){
		System.out.println("Se encuentra entrenando");
	}

	public String toString() {
		return "Entrenador [idFederacion= " + idFederacion + ", id= " + id
				+ ", nombre= " + nombre + ", apellidos= " + apellidos + ", edad= "
				+ edad + "]";
	}
	
}
