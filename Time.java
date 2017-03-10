public class Time {
private int hora;
private int minu;
private int segu;

public Time(){
	hora=00;
	minu=00;
	segu=00;
}
public Time(int hora, int minu, int segu){
	this.hora=hora;
	this.minu=minu;
	this.segu=segu;
}
public int getHora() {
	return hora;
}
public void setHora(int hora) {
	this.hora = hora;
}
public int getMinu() {
	return minu;
}
public void setMinu(int minu) {
	this.minu = minu;
}
public int getSegu() {
	return segu;
}
public void setSegu(int segu) {
	this.segu = segu;
}
public String mensaje(){
	String mensaje = "La Hora Es: ";
	return mensaje;
}
public void SetTime(int hora, int minu, int segu){
	this.hora=hora;
	this.minu=minu;
	this.segu=segu;
}
public int nextSecond(){
	int nextSecond=segu+1;
	return nextSecond;
}
}
