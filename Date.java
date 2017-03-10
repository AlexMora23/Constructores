public class Date{
	private int año;
	private int mes;
	private int dia;
public Date(){
	año=2017;
	mes=3;
	dia=8;
}
public Date(int año, int mes, int dia){
	this.año=año;
	this.mes=mes;
	this.dia=dia;
}
public int getAño() {
	return año;
}
public void setAño(int año) {
	this.año = año;
}
public int getMes() {
	return mes;
}
public void setMes(int mes) {
	this.mes = mes;
}
public int getDia() {
	return dia;
}
public void setDia(int dia) {
	this.dia = dia;
}
public String mensaje(){
	String mensaje = "La fecha es: ";
	return mensaje;
}
public void setDate(int año, int mes, int dia){
	this.año=año;
	this.mes=mes;
	this.dia=dia;
}
}
