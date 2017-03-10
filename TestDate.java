public class TestDate {
public static void main(String [] args){
	Date d1 = new Date();
	System.out.println(d1.mensaje()+d1.getDia()+"/"+d1.getMes()+"/"+d1.getAño());
	
	Date d2 = new Date(2016,9,4);
	System.out.println(d2.mensaje()+d2.getDia()+"/"+d2.getMes()+"/"+d2.getAño());
	
	Date d3 = new Date(1910,9,15);
	System.out.println(d3.mensaje()+d3.getDia()+"/"+d3.getMes()+"/"+d3.getAño());
	
}
}
