
public class PruebaConstructor {
	
	public static void main(String[] args) {
		Cuenta cuenta1 = new Cuenta(555); 
		Cuenta cuenta2 = new Cuenta(456);
		Cuenta cuenta3 = new Cuenta(167);
		
		System.out.println(Cuenta.getTotal());
	}

}
