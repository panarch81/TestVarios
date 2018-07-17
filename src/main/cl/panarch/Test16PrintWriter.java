package main.cl.panarch;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Test16PrintWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintWriter pw = new PrintWriter(System.out);
		OutputStreamWriter osw = new OutputStreamWriter(System.out);
		pw.println("hello");
		
		//test1
		int i;
		int j;
		for(i=0,j=0; j<1;++j,i++){
			System.out.println("i:"+i+" j:"+j);
		}
		System.out.println("i:"+i+" j:"+j);
		
		
		do{
			System.out.println("probando do while");
		} while (i<1);
		
		for(int z = 0, b = 1;;){
			
		}
	}

}
