
public class TestReferencia2 {

	public static void main(String[] args) {
	Cliente diego = new Cliente();
	diego.nombre = "Diego";
	diego.documento = "45444332";
	diego.telefono = "999922222";
	
	Cuenta cuentaDeDiego = new Cuenta();
	cuentaDeDiego.agencia = 1;
	cuentaDeDiego.titular = diego;
	
	System.out.println(cuentaDeDiego.titular.documento);
	System.out.println(cuentaDeDiego.titular);
	System.out.println(diego);
	
  }
}
