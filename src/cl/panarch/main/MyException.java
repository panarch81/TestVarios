package cl.panarch.main;

public class MyException {
	static String[] foods = {}; 
	class BadFoodException extends Exception{

		public BadFoodException(String message){
			super(message);
		}
		
	}
	
	public static void main(String[] args) throws BadFoodException{
		// TODO Auto-generated method stub
		foods = args;
		for(String oneFood : foods){
			checkFood(oneFood);
		}
	}
	
	public static void checkFood(String food) throws BadFoodException{
		MyException ex = new MyException();
		if("Carne".equals(food) || "animal".equals(food)){
			throw ex.new BadFoodException(":(");
		}
		else{
			System.out.println("ok "+food);
		}
		
	}
} 

