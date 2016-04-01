package cl.panarch.main;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringInmutabilityTest {

	@Test
	public void shouldReturnSameStringWhenResultNotReasignedtest() {
		StringInmutability inm = new StringInmutability();
		inm.setOrigWord("Happy");
		inm.setNewWord("Thursday");
		assertEquals("Happy",inm.callConcatOnString(inm.getOrigWord(), inm.getNewWord()));
		assertEquals(5,inm.getOrigWord().length());
	}

	
	@Test
	public void shouldReturnConcatedNewStringWhenReasigned(){
		StringInmutability inm = new StringInmutability();
		inm.setOrigWord("Happy");
		inm.setNewWord("Thursday");
		
		String result = inm.reasignWhatConcatenateToString(inm.getOrigWord(), inm.getNewWord());
		assertEquals("HappyThursday",result);
		
	}
}
