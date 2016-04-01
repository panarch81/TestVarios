package cl.panarch.main;

import java.util.Scanner;

public class SubStringManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        String strToProcess = in.nextLine();
        int n = in.nextInt();
        
        String strLower = strToProcess.substring(0,n);
        String strHigher = strToProcess.substring(0,n);
        for (int i =0;(i+n)<= strToProcess.length(); i++){
            String aux = strToProcess.substring(i,(n+i));
            System.out.println("aux:"+aux);
            if(strLower.compareTo(aux) > 0 ){
                strLower= aux;
            }
            if(strHigher.compareTo(aux) < 0){
                strHigher = aux;
            }
            
        }
        System.out.println(strLower);
        System.out.println(strHigher);
    }
	}


