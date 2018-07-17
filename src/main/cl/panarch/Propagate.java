package main.cl.panarch;

import java.util.Scanner;

public class Propagate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		try{
			System.out.println(reverse(input.nextLine()));
		}catch(Exception e){
			System.out.println("Adios ... "+e.getMessage());
		}finally{
			System.out.println("main() method has finished");
		}
	}
	
	public static String reverse(String strOrig) throws Exception{
		String strReverse = "";
		try{
			if(0 == strOrig.length()){
				throw new Exception();
			}
			else{
				
				for (int i = (strOrig.length()-1); i >=0 ; i-- ){
					strReverse += strOrig.charAt(i);
				}
			}
		}
		finally{
			System.out.println("ending program");
		}				
		return strReverse;
	}

}
