package main.cl.panarch;

public enum Meses {
	ENERO(1,"Enero"),
	FEBRERO(2,"Febrero"),
	MARZO(3,"Marzo"),
	ABRIL(4,"Abril");
	
	private Meses(int numeroMes){
		this.numeroMes = numeroMes;
//		for(Meses oneMes : Meses.values()){
//			if(numeroMes == oneMes.numeroMes){
//				this.nameMonth = oneMes.nameMonth;
//			}
//		}
		
	}
	
	private Meses(int numeroMes, String nombreMes){
		this.numeroMes = numeroMes;
		this.nameMonth = nombreMes;
	}
	
	private int numeroMes;
	private String nameMonth;
	
	public String getNameMonth() {
		return nameMonth;
	}

	public void setNameMonth(String nameMonth) {
		this.nameMonth = nameMonth;
	}

	public int getNumeroMes() {
		return numeroMes;
	}
	public void setNumeroMes(int numeroMes) {
		this.numeroMes = numeroMes;
	}
	
	
}
