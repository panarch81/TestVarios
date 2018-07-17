package main.cl.panarch;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arreglo de enteros primitivos
		int[] datos  = {4,5,2,6,9,4,6,1};		
		removeDuplicates(datos);
		
		//arreglo de Integers
		Integer[] enterosArray = {3,4,2,6,3,6,8,2,1};
		
		removeDuplicates(enterosArray);
		
		
		RemoveDuplicatesFromArray obj2 = new RemoveDuplicatesFromArray();
		String unString = "gatitopollo";//"anitalavalatina";
		
		if(obj2.espalindromo(unString))
			System.out.println("encontrado palindromo");
		else
			System.out.println("not found palindromo");
		
		//dado un arreglo, verlo como matriz y recuperar el elemento
		
		Integer[] arreglo2 = {1,2,3,4,5,6,7,8,9};
		int tamanoMax = arreglo2.length;
		int index = 0;
		if(tamanoMax%3==0){
			
			Integer[][] matriz2 = new Integer[3][3]; 
			for(int i = 0; i<3; i++){				
				for(int j= 0; j<3 ;j++){
					matriz2[i][j] = arreglo2[index];
					index++;
				}	
			}	
			
			for(int i = 0; i<3; i++){				
				for(int j= 0; j<3;j++){
					System.out.print(" "+matriz2[i][j]);
					
				}	
				System.out.println("");
			}
		}
		
		//dado 4, en que posicion de la matriz, indicar la posicion en el arreglo
		//(1,0) -> 3
		//(1,1) -> 
		//(2,1) -> 3*2+1 =7

		System.out.println("Palindromo: "+optimizedPalibdromoCheck("anitalavalatina"));
		System.out.println("Palindromo2: "+optimizedPalibdromoCheck("ramoncho"));
	}
	 
	public boolean espalindromo(String palabra){
		char[] caracteres = palabra.toCharArray();
		String retorno = "";
		for (int i = caracteres.length -1; i >=0; i--)
			retorno += caracteres[i];
		if(palabra.equals(retorno))
			return true;
		System.out.println("reverso:"+retorno);
		return false; 
	}
	
	public static int[] removeDuplicates (int[] arg0) {
		Set<Integer> setEnteros = new HashSet<Integer>();
	    for(int i=0; i< arg0.length; i++){
	    	setEnteros.add(new Integer(arg0[i]));
	    }
	    
	    Integer[] prelistaRetorno = (Integer[]) setEnteros.toArray(new Integer[setEnteros.size()]);
	    int[] listaRetorno = new int[setEnteros.size()] ;
	    for(int j= 0; j<setEnteros.size(); j++ ){
	    	listaRetorno[j] = prelistaRetorno[j].intValue();
	    	System.out.println(prelistaRetorno[j].intValue());
		}
	    return listaRetorno;
	 }
	
	public static Integer[] removeDuplicates (Integer[] enterosArray){
		Set<Integer> enterosSet = new HashSet<Integer>(Arrays.asList(enterosArray));
		Integer[] arregloSinDuplicados = enterosSet.toArray(new Integer[enterosSet.size()]);
		System.out.println("****");
		System.out.println(Arrays.toString(arregloSinDuplicados));
		return arregloSinDuplicados; 
	}

	public static boolean optimizedPalibdromoCheck(String palabra){
		char[] palabraAsCharArray = palabra.toCharArray();
		int leftIndex = 0;
		int rightIndex = palabraAsCharArray.length - 1;

		while(leftIndex < rightIndex){
			if(palabraAsCharArray[leftIndex] != palabraAsCharArray[rightIndex]) return false;
			leftIndex++;
			rightIndex--;
		}
		return true;
	}
}
