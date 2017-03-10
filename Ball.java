public class Ball {
private double x;
private double y;
private double xStep;
private double yStep;
public double xy;
public double xyStep;
public Ball(){
	x=0;
	y=0;
}
public Ball(double x, double y, double xStep, double yStep){
	this.x=x;
	this.y=y;
	this.xStep=xStep;
	this.yStep=yStep;
}
public double getX() {
	int x= 3;
	return x;
}

public void setX(double x) {
	this.x = x;
}

public double getY() {
	int y= 7;
	return y;
}

public void setY(double y) {
	this.y = y;
}

public double getxStep() {
	return xStep;
}

public void setxStep(double xStep) {
	this.xStep = xStep;
}

public double getyStep() {
	return yStep;
}

public void setyStep(double yStep) {
	this.yStep = yStep;
}
public String mensaje(){
	String mensaje = " Las coordenadas del balon son: ";
	return mensaje;
}
public double getXY(){
	return xy;
}
public void setXY(double x, double y){
	this.xy=xy;
}
public double getXYStep(){
	return xyStep;
}
public void setXYStep(double xStep, double yStep){
	this.xStep=xStep;
	this.yStep=yStep;
	
}
}
