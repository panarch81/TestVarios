package main.cl.panarch;

public class DvdInfo implements Comparable<DvdInfo>{
	private String titulo;
	private String author;
	
	public DvdInfo(String tit, String aut){
		this.titulo = tit;
		this.author = aut;
	}
	
	public String toString(){
		return "Titulo: "+titulo+" de: "+author+"\n";
	}
	public int compareTo(DvdInfo dvd){
		return titulo.compareTo(dvd.titulo);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
}
