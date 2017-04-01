abstract class SeleccionFutbol {
	 public int id;
	 public String nombre;
	 public String apellidos;
	 public int edad;
	 
public SeleccionFutbol(int id, String nombre, String apellidos, int edad){
			this.id=id;
			this.nombre=nombre;
			this.apellidos=apellidos;
			this.edad=edad;

}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellidos() {
	return apellidos;
}

public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}

public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad = edad;
}
public void viajar(){
	System.out.println("Esta viajando");
}
public void concentrarse(){
	System.out.println("Esta en concentracion");
}
public void entrenamiento(){
	System.out.println("Esta en entrenamiento");
}
public void partidoFutbol(){
	System.out.println("Esta en Partido de Cuartos de Final");
}	
}
