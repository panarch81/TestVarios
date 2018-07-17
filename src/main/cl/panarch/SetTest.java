package main.cl.panarch;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

    public static void main(String[] args) {

        Set chicasSuper = new HashSet();
        chicasSuper.add(new Person("Bellota"));
        chicasSuper.add(new Person("Burbuja"));
        chicasSuper.add(new Person("Bombon"));

        Iterator<Person> itChicas = chicasSuper.iterator();
        while(itChicas.hasNext()){
            Person chica = itChicas.next();
            System.out.println(chica);
        }


        Set chiflados = new TreeSet();
        chiflados.add(new Person("Moe"));
        chiflados.add(new Person("Larry"));
        chiflados.add(new Person("Curly"));


        Iterator<Person> itChiflados = chiflados.iterator();
        while(itChiflados.hasNext()){
            Person chiflado = itChiflados.next();
            System.out.println(chiflado);
        }



    }
}
