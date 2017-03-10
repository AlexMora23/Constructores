public class Principal {
	public static void main(String [] args){
		Radio r1 = new Radio(2.0, "azul");
	
		System.out.println("El circulo "+r1.getColor() + " tiene un radio de: "
		+ r1.getRadio() + " y area de "+ r1.getArea());
		
		Radio r2 = new Radio(2.0, "rojo");
		
		System.out.println("El circulo "+r2.getColor() + " tiene un radio de: "
	    + r2.getRadio() + " y area de "+ r2.getArea());;
		
	    Radio r3 = new Radio();
		System.out.println("El circulo "+r3.getColor() + " tiene un radio de: "
		+ r3.getRadio() + " y area de "+ r3.getArea());
	}
}

