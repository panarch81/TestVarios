package main.cl.panarch;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringInmutability {
	private String origWord;
	private String newWord;
	
	private Set conjunto1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringInmutability inmut = new StringInmutability();
		inmut.setOrigWord("Happy ");
		inmut.setNewWord("Friday");
		System.out.println(inmut.callConcatOnString(inmut.getOrigWord(), inmut.getNewWord()));
		
		String x = "este es X";
		System.out.println(x.toString());//este es X
		
		StringBuffer gatitoCambiante = new StringBuffer("Gato ");
		gatitoCambiante.append("de mirada distraida");
		System.out.println(gatitoCambiante);//Gato de mirada distraida
		                                    //0123456789012345
		gatitoCambiante.delete(5, 15);
		System.out.println(gatitoCambiante); //Gato distraida
		gatitoCambiante.replace(13, 14, "o");//01234567890123
		System.out.println(gatitoCambiante); //Gato distraido
		gatitoCambiante.deleteCharAt(4);     //01234
		System.out.println(gatitoCambiante);
	}

	public Set populateASet(String unString, List<String> listString){
		conjunto1 = new HashSet();
		conjunto1.add(unString);
		conjunto1.addAll(listString);
		return conjunto1;
	}
	
	public String callConcatOnString(String palabraOrig, String palabraToConcatenate){
		palabraOrig.concat(palabraToConcatenate);
		return palabraOrig;
	}
	
	public String reasignWhatConcatenateToString(String palabraOrig, String palabraToConcatenate){
		return palabraOrig.concat(palabraToConcatenate);
	}

	public String getOrigWord() {
		return origWord;
	}

	public void setOrigWord(String origWord) {
		this.origWord = origWord;
	}

	public String getNewWord() {
		return newWord;
	}

	public void setNewWord(String newWord) {
		this.newWord = newWord;
	}

	public Set getConjunto1() {
		return conjunto1;
	}

	public void setConjunto1(Set conjunto1) {
		this.conjunto1 = conjunto1;
	}
	
}
