
public class PrincipalSF {
public static void main(String[] argumentos){
	Entrenador ent1= new Entrenador(1,"Marco","Gomez",30,12);
	Masajista mas1= new Masajista(4,"Mario","Perez",23,"Tecnico",5);
	Futbolista fut1= new Futbolista(5, "Juan", "Mercedes",20,9,"Defensa");
	
	System.out.println(mas1.toString());
	System.out.println(ent1.toString());
	System.out.println(fut1.toString());
}
}
