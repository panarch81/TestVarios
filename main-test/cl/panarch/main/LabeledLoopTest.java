package cl.panarch.main;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test; 

public class LabeledLoopTest {
	Person youngPerson; 
	LabeledLoop procesador;
	public static final String ANOTHER_YEAR = "Another year.";
	public static final String GET_YOUR_DRIVERS_LICENCE = "get your driver's license";
	
	@Before
	public void initialization(){
		youngPerson = new Person("Mary");
		procesador = new LabeledLoop();
		procesador.setMessageToPerson("");
	}
	
	@Test
	public void shouldGiveAnotherYearMessageAndGetYourDriverLicenseMessageWhenAgeUnder16(){
		
		youngPerson.setAge(15);
		
		assertTrue(procesador.getMessageForPerson(youngPerson).contains(ANOTHER_YEAR));
		assertTrue(procesador.getMessageForPerson(youngPerson).contains(GET_YOUR_DRIVERS_LICENCE));
	}
	
	
	@Test
	public void shouldNotGiveGetYourDriverLicenseMessageWhenAgeOver16(){
		youngPerson.setAge(16);
		
		assertTrue(!procesador.getMessageForPerson(youngPerson).contains(GET_YOUR_DRIVERS_LICENCE));
		
	}
}
