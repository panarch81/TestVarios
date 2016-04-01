package cl.panarch.main;

public class WraperConverters {
	private Integer intValor = new Integer(0);
	int miValorInt = 0;
	
	public void haceTest(){
		Integer integerValue = Integer.valueOf("110000",2);
		System.out.println("imprimo un valor Integer usando Integer.valueOf(110000,2):"+integerValue);
		intValor = integerValue;
		
		Long longValor = Long.valueOf("101011",2);
		System.out.println("imprimo un valor Long ahora usando Long.valueOf(101011,2):"+longValor);
	}
	
	public void haceTest2(){
		System.out.println("intValor:"+intValor);
		System.out.println("intValor.byteValue():"+intValor.byteValue());
		System.out.println("intValor.longValue():"+intValor.longValue());
		miValorInt = Integer.parseInt("9");
	}
}
