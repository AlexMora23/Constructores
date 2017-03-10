public class Account {
private int accountNumber;
private double balance;

public Account(){
	accountNumber=19982509;
	balance=0.0;
}
public Account(int accountNumber, double balance){
	this.accountNumber=accountNumber ;
	this.balance=balance;
}
public Account(int a){
	accountNumber=a;
}

public int getAccountNumber(){
	return accountNumber;
}
public double getBalance(){
	return balance;
}
public void setBalace(double b){
	this.balance=balance;
}
public void credito(double amount1){
	amount1 = 4000;
}
public void debito(double amount2){
	amount2= 7000;
}
public String mensaje(){
	String mensaje = " Fin de la operacion";
	return mensaje;
}
}
