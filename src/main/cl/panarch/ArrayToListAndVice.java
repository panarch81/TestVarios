package main.cl.panarch;


import java.util.*;

public class ArrayToListAndVice{

    public static void main(String[] args){
        List<Integer> listaEnteros = new ArrayList<Integer>();
        listaEnteros.add(12);
        listaEnteros.add(10);
        listaEnteros.add(21);

        Object[] arregloEnteros = listaEnteros.toArray();
        Integer[] otroArregloEnteros = listaEnteros.toArray(new Integer[3]);

        List<Person> personas = new ArrayList<Person>();

        personas.add(new Person("Hugo"));
        personas.add(new Person("Paco"));
        personas.add(new Person("Luis"));

        //Collections.sort(personas);//requiere que Persona tenga implementado Comparable compareTo para ser sorted
        System.out.println(personas);

        PersonaSort persort = new PersonaSort();
        Collections.sort(personas, persort);
        System.out.println(personas);

        boolean[] ba = new boolean[5];
        Set s = new HashSet();
        ba[0] = s.add("a");
        ba[1] = s.add(new Integer(42));
        ba[2] = s.add("b");
        ba[3] = s.add("a");
        ba[4] = s.add(new Object());
        for(int x=0; x<ba.length; x++)
            System.out.print(" - "+ ba[x] + " ");
        System.out.println("\n");
        for(Object o : s)
            System.out.println(o + " ");

        int[] enteros = {3,5,6,2};

        Arrays.sort(enteros);

        for(int i=0; i< enteros.length; i++){
            System.out.print(enteros[i]+" - ");
        }

        int[] enterosImpares = {1,5,3,9,11,7};
        PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();

        for(int impar: enterosImpares){
            pq1.offer(impar);
        }
        System.out.println("");
        for(int valor: enterosImpares){
            System.out.print(pq1.poll()+ " ");
        }

        char[] caracteres = new char[10];
        int[] numeros = new int[5];



    }


}