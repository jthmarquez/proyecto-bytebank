//entidad Cuenta:
public class Cuenta {
      private double saldo;
      private int agencia = 1;
      private int numero;
      private Cliente titular = new Cliente();
     
      private static int total = 0;
      
      public Cuenta(int agencia, int numero) {
    	  this.agencia = agencia;
    	  this.numero = numero;
    	  System.out.println("Estoy creando una cuenta " + this.numero);
    	  Cuenta.total ++;
    	  if (agencia <= 0) {
    		  System.out.println("No se permite 0");
    		  this.agencia = 1;
    	  } else {
    		  this.agencia = agencia;
    	  }
    	  total++;
    	  System.out.println("Se van creando: " + total + " cuentas");
      }
      
     //no retorna valor 
     public void depositar(double valor) {
    	 //esta cuenta   esta cuenta
    	 //this account  this account
    	 //this object
    	 this.saldo += valor;
      }
     
     //retorna valor 
     public boolean retirar(double valor) {
    	 if (this.saldo >= valor) {
    		 this.saldo -= valor;
    		 return true;
    	 } else {
    		 return false;
    	 }
     } 
     
    public boolean transferir (double valor, 
    		                   Cuenta cuenta) {
    	if (this.saldo >= valor) {
    		this.saldo = this.saldo - valor;
    		cuenta.depositar(valor);
    		return true;
    	} else {
    		return false;
    	}
    }
    
    public double getSaldo() {
    	return this.saldo;
    } 
    
    public int getAgencia() {
    	return agencia;
    } 
    
    public void setAgencia(int agencia) {
        if (agencia > 0) {
            this.agencia = agencia;
        }
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        }
    }
    
   public void setTitular(Cliente titular) {
	   this.titular = titular;
   }
   
   public Cliente getTitular() {
	   return titular;
   }
   
   public static int getTotal() {
	   return Cuenta.total;
   }
}

   