public class TestTime {
public static void main(String [] args){
	Time t1 = new Time();
	System.out.println(t1.mensaje()+t1.getHora()+":"
	+t1.getMinu()+":"+t1.getSegu());
	int second = t1.nextSecond();
	System.out.println("Despues de un segundo la hora es "+t1.getHora()+":"+t1.getMinu()+":"+ second);
	
	Time t2 = new Time(12,25,17);
	System.out.println(t2.mensaje()+t2.getHora()+":"
	+t2.getMinu()+":"+t2.getSegu());
	int time = t2.nextSecond();
	System.out.println("Despues de un segundo la hora es "+t2.getHora()+":"+t2.getMinu()+":"+ time);
	
	Time t3 = new Time(15,34,56);
	System.out.println(t3.mensaje()+t3.getHora()+":"
	+t3.getMinu()+":"+t3.getSegu());
	int tim = t3.nextSecond();
	System.out.println("Despues de un segundo la hora es "+t3.getHora()+":"+t3.getMinu()+":"+ tim);
}
}

