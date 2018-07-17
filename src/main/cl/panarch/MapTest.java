package main.cl.panarch;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {

        public static void main(String[] args) {
            Map<Object, Object> m = new HashMap<Object, Object>();
            m.put("k1", new Person("aiko"));


            Person d1 = new Person("clover");
            m.put(d1, "Hola");

            for(Object o : m.values()){
                System.out.println("- "+o);
            }

            for(Map.Entry<Object,Object> element: m.entrySet()){
                System.out.println("k:"+element.getKey() + " v:"+element.getValue());
            }

            System.out.println(m.get(d1));
            d1.setName("magnolia");
            System.out.println(m.get(d1));
            System.out.println(d1.getName());
            d1.setName("clover");
            System.out.println(m.get(new Person("clover")));


           //Collections.sort();


            Map<String,Person> superHeroes = new TreeMap<>();
            superHeroes.put("Batman",new Person("Bruce"));
            superHeroes.put("Superman",new Person("Clark"));
            superHeroes.put("Wolverine",new Person("Logan"));




        }
}
