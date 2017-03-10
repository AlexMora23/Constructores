public class Punto {
private int x;
private int y;
public int xy;

public Punto(){
	x=0;
	y=0;
}
public Punto(int x, int y){
	this.x=x;
	this.y=y;
}
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}
public String mensaje(){
	String mensaje = "Los Valores de X y Y son: ";
	return mensaje;
}
public int getXY(){
	return xy;
}
public void setXY(int x, int y){
	this.x=x;
	this.y=y;
}
public double Distancia(int x, int y){
	double distancia = (x*x)+(y*y);
	double Distancia = Math.pow(distancia,(1/2));
	return Distancia;
}
public double distanciaOtro(int x1, int y1){
	double distanciaOtro = 12;
	return distanciaOtro;
}
public double distance(){
	double distance = 10;
	return distance;
}
}
