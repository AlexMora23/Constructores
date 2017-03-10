public class Radio {
private double radio;
private String color;

public Radio(){
	radio=1.0;
	color= "rojo";

}
public Radio(double r, String c){
	radio = r;
	color= c;
   
		
}
public double getRadio(){
	return radio;
}
public String getColor(){
	return color;
	
}
public double getArea(){
return radio*radio*Math.PI;	
}
}
