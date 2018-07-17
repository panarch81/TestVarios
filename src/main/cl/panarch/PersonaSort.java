package main.cl.panarch;

import java.util.Comparator;

/**
 * Created by parenas on 04-07-17.
 */
public class PersonaSort implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());

        //return o1.compareTo(o2);
    }
}
