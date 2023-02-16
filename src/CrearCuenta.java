
public class CrearCuenta {

	public static void main(String[] args) {
		//Variable           = Valor
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.saldo = 1000;
		primeraCuenta.deposita(200);
		//primeraCuenta.pais = "Peru"; No compila porque no esta definido dentro de cuenta 
		System.out.println(primeraCuenta.getsaldo());
		
		// primeraCuenta.saldo += 100;
		primeraCuenta.deposita(100);
		System.out.println(primeraCuenta.getSaldo());
		
		Cuenta segundaCuenta = new Cuenta();
		segundaCuenta.depositar(500);
		
		System.out.println("primera Cuenta tiene " + primeraCuenta.getSaldo());
		System.out.println("segunda Cuenta tiene " + segundaCuenta.getSaldo());
		System.out.println(primeraCuenta.getAgencia());
		System.out.println(primeraCuenta.getNumero());
		System.out.println(segundaCuenta.getAgencia());
		
		System.out.println(segundaCuenta.saldo);
		System.out.println(primeraCuenta.saldo);
		
		// segundaCuenta.agencia = 146;
		segundaCuenta.setAgencia(146);
		System.out.println("Ahora la segunda cuenta esta en la agencia " + segundaCuenta.getAgencia());
		
		if (primeraCuenta == segundaCuenta) {
			System.out.println("Misma cuenta ");
		} else {
			System.out.println("Cuentas diferentes ");
		}
		
		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);
	}
}
