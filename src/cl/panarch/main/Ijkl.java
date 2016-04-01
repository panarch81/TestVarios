package cl.panarch.main;

public class Ijkl {
	static String s = "";
	public static void main(String[] args){
		//Abcd has x=10  y=20 valor=9
		//Efgh extends de Abcdf y redefine X e y
		Efgh oref1 = new Efgh();
		System.out.println("Efhg.x:"+oref1.x + "Efhg.y:"+oref1.y+" valor:"+oref1.getValor());//Efhg.x:80 Efhg.y:70 valor:9
		System.out.println("to String: "+oref1);//to String: x:10 y:20 valor:9 //usa el metodo toString de Abcd
		System.out.println("valor:"+oref1.getValor());//valor:9
		
		Abcd oref2 = new Efgh();
		System.out.println("2:"+oref2.x);//2:10//en realidad es de tipo Abcdf
		System.out.println(oref2.y);//20
		System.out.println(oref2.getValor());//9
		
		int [][][][][] arrayOfInts = new int[5][4][5][][];
		int [][][][][] arrayOfInts2 = new int[][][][][]{ { {{{1,2},{4,9}}, { {101,22},{44,45},{6,7} },{{11,33}},{{},{}}}}};
		System.out.println("arrayOfInts2[0][0][0][0][1]:"+arrayOfInts2[0][0][0][0][1]);//2
		System.out.println("arrayOfInts2[0][0][0][1][0]:"+arrayOfInts2[0][0][0][1][0]);//4
		System.out.println("arrayOfInts2[0][0][1][0][0]:"+arrayOfInts2[0][0][1][0][0]);//101
		System.out.println("arrayOfInts2[0][0][1][1][0]:"+arrayOfInts2[0][0][1][1][0]);//44
		int[][] twoDee = {{1,2,9,8},{3,4,7},{9,9,7,7,0}};
		int [][]two2Dee = new int[1][];
		int [][][] treeDee =  {{{4,5,21},{1,2,3},{8,9}},{{4,6},{3,11}},{{1,7},{}}};
		
		System.out.println("elemento del arreglo, del arreglo del arreglo:"+treeDee[0][0][2]);//21
		
		//ejercicio 9 - pag 283
		int x = 4; Boolean y = true;
		short[] sa = {1,2,3};
		
		doStuff(x,y);
		doStuff(x);
		doStuff(sa, sa);
		System.out.println("s:"+s);
	}
	static void doStuff(Object o) { s+= "1";}
	static void doStuff(Object... o) { s+= "2";}
	static void doStuff(Integer... i) { s+= "3";}
	static void doStuff(Long l) { s+= "4";}
}
