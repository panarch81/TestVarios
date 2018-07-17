package main.cl.panarch;

import java.util.Scanner;

public class ManejadorSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String numeroMesReq = input.nextLine();
		
		Meses someMes = Meses.valueOf(numeroMesReq);
		switch(someMes){
			case ENERO:
			case FEBRERO:
				System.out.println("Estamos en Verano Chicos!");
				break;
			case MARZO:
				System.out.println("Afirmense, empezó la jungla");
			default:
				System.out.println("y hay que seguir laburando ");
			
		}
	}
}
	/**
	 * public class EnumTest {
        private enum Currency {
        PENNY("1 rs"), NICKLE("5 rs"), DIME("10 rs"), QUARTER("25 rs");
        private String value;
        private Currency(String brand) {
              this.value = brand;
        }

        @Override
        public String toString() {
              return value;
        }
  }

  public static void main(String args[]) {

        Currency[] currencies = Currency.values();

        // enum name using name method
        // enum to String using toString() method
        for (Currency currency : currencies) {
              System.out.printf("[ Currency : %s,
                         Value : %s ]%n",currency.name(),currency);
        }
  }
}
	 */
	 


