
public class Masajista extends SeleccionFutbol{
	String titulacion;
	int aniosExperiencia;
	
	Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia){
	super(id,nombre,apellidos,edad);
	this.titulacion=titulacion;
	this.aniosExperiencia=aniosExperiencia;
}

public String getTitulacion() {
	return titulacion;
}

public void setTitulacion(String titulacion) {
	this.titulacion = titulacion;
}

public int getAñosExperiencia() {
	return aniosExperiencia;
}

public void setAñosExperiencia(int añosExperiencia) {
	this.aniosExperiencia = añosExperiencia;
}
public void darMasaje(){
	System.out.println("Esta dando masaje");
	
}

public String toString() {
	return "Masajista [titulacion= " + titulacion + ", aniosExperiencia= "
			+ aniosExperiencia + ", id= " + id + ", nombre= " + nombre
			+ ", apellidos= " + apellidos + ", edad= " + edad + "]";
}

}
