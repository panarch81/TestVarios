package cl.panarch.main;

public class OperatorsOnArrays {
	enum dias {M,T,TR};
	public static void main(String[] args) {
		int largoAll = args.length;
		int largoElement = args[0].length();
		// TODO Auto-generated method stub
		float f1 = 2.3f;
		float[][] f2 = {{42.0f},
						{1.7f,2.3f},
						{2.6f, 2.7f}};
		float[] f3 = {2.7f};
		Long x = 42L;
		//1.
		//if(f1==f2){//COMPILATION ERROR!! INCOMPATIBLE tipo de operandos
			//System.out.println("f1 = 2.3f es igual a float[][] f2");
		//2.	
		if(f1==f2[2][1]){
			System.out.println("f1 = 2.3f es igual a 2.7f");
			System.out.println("f2[2][1]:"+f2[2][1]);
		}
		else{//****
			System.out.println("f1 = 2.3f NO es igual a 2.7f PERO COMPILA");
			System.out.println("f2[2][1]:"+f2[2][1]);//f2[2][1]:2.7
		}
		//3.
		if(x==f2[0][0]){//****
			System.out.println("Long x = 42 es igual a 42.0f COMPILA");
			System.out.println("f2[0][0]:"+f2[0][0]);////f2[0][0]:42.0
		}
		else{
			System.out.println("Long x = 42 NO es igual a 42.0f COMPILA");
			System.out.println("f2[0][0]:"+f2[0][0]);
			
		}
		//4.
		//if(f1==f2[1,1])//no compila!!
			
		//5.
		if(f3==f2[2]){//COMPILA : arreglo compare con otro arreglo
			System.out.println("COMPILA e iguales: f3:"+f3);
			System.out.println("f2[2]:"+f2[2]);
			
		}
		else{//************
			System.out.println("COMPILA NO iguales: f3:"+f3);//COMPILA NO iguales: f3:[F@17aedbde
			System.out.println("f2[2]:"+f2[2]);//f2[2]:[F@58e4d7f7
		}
	}

}
