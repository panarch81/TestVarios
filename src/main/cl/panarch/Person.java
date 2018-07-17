package main.cl.panarch;

public class Person implements Comparable<Person>{
	private int age;
	private String name;
	
	public Person(String name){
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Object getMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean equals(Object o){
		if(o instanceof Person &&  ((Person)(o)).name.equals(this.name)){
			return true;
		}
		else{
			return false;
		}
	}

	public int hashCode(){
		return this.name.length();
	}

	public String toString(){
		return "Persona name:"+this.getName()+" and age:"+this.getAge();
	}

	@Override
	public int compareTo(Person o) {
		return (this.getName().compareTo(o.getName()));
	}
}
