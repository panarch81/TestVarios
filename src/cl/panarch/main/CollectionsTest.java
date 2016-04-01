package cl.panarch.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class CollectionsTest {
	
	private List<String> miLista = new ArrayList<String>();
	private Map<String, String> miMap = new HashMap<String, String>();
	
	
	public void llenaLista(){
		miLista.add("perro");
		miLista.add("gato");
		miLista.add("pajaro");
		
		Collections.sort(miLista);
		System.out.println(miLista);
	}
	
	public void populateHashMap(){
		miMap.put(null, "1");
		miMap.put(null, null);
	}

	public void printHash(){
		System.out.println(miMap.toString());
	}
	
	public static void main(String [] args){
		boolean unFlag = 9 > 11;
		CollectionsTest ct = new CollectionsTest();
		ct.llenaLista();
		ct.populateHashMap();
		ct.printHash();
		
		List<String> nombres = new ArrayList<String>();
		
		String unNombre= "Paola";
		nombres.add(unNombre);
		nombres.add("Catalina");
		nombres.add("Ernestina");
		System.out.println(nombres.size());
		System.out.println(nombres.contains("Paola"));
		nombres.remove("Paola");
		System.out.println(nombres.size());
		System.out.println(nombres.contains("Paola"));
		
		List<DvdInfo> dvdList = new ArrayList<DvdInfo>();
		DvdInfo dvd1 = new DvdInfo("Romeo y Julieta","Shakespiare");
		dvdList.add(dvd1);
		DvdInfo dvd2 = new DvdInfo("Star trek","Olaf Pooley");
		dvdList.add(dvd2);
		DvdInfo dvd3 = new DvdInfo("Dr. Who","Olaf Pooley");
		dvdList.add(dvd3);

		System.out.println(dvdList);
		Collections.sort(dvdList);
		System.out.println(dvdList);
		
		System.out.println("dvd3:"+dvd3);
		
		Iterator<DvdInfo> it = dvdList.iterator();
		while (it.hasNext()){
			DvdInfo dvd = (DvdInfo)it.next();
			System.out.println("dvd1:"+dvd.getTitulo());
		}
		
		Map<String, String> unMap = new HashMap<String,String>();
		unMap.put("1", "es gatito");
		unMap.put("2", "es perrito");
		unMap.put("3", "es osito");
		unMap.put("4", "es pollito");
		
		//Map.Entry
		Iterator<Map.Entry<String,String>> itMap = unMap.entrySet().iterator();
		
		List<Map.Entry<String, String>> listaDeMapElements = new ArrayList<Map.Entry<String,String>>();
		
		while(itMap.hasNext()){
			Map.Entry<String,String> elemMap = (Map.Entry<String, String>)itMap.next();
			System.out.println("elem:"+elemMap.getValue());
			listaDeMapElements.add(elemMap);
		}
		
		List<List<Map.Entry<String, String>>> listaDeListas = new ArrayList<List<Map.Entry<String,String>>>();
	    listaDeListas.add(listaDeMapElements);
	    
	    Iterator<List<Map.Entry<String, String>>> otroIterator = listaDeListas.iterator();
	    
	}
	
	
}
