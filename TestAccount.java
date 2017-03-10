public class TestAccount {
public static void main(String [] args){
	Account a1 = new Account();
	
	System.out.println("El titular con Numero de Cuenta= "
	+a1.getAccountNumber()+" Tiene un saldo de= "+ a1.getBalance()+ a1.mensaje());

	Account a2 = new Account(14238524,289.3);
	
	System.out.println("El titular con Numero de Cuenta= "
	+a2.getAccountNumber()+" Tiene un saldo de= "+ a2.getBalance()+ a1.mensaje());
	
Account a3 = new Account(12131231,345.4);
	
	System.out.println("El titular con Numero de Cuenta= "
	+a3.getAccountNumber()+" Tiene un saldo de= "+ a3.getBalance()+ a1.mensaje());
}
}
