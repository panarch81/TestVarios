package main.cl.panarch;

public class LabeledLoop {
	private String messageToPerson = "";

	

	public String getMessageForPerson(Person youngPerson) {
		// TODO Auto-generated method stub
		outer:
		while(youngPerson.getAge()<= 21){
			youngPerson.setAge(youngPerson.getAge()+1);
			while(youngPerson.getAge() == 16){
				setMessageToPerson("get your driver's license");
				continue outer;
			}
			setMessageToPerson("Another year.");
		}
		return getMessageToPerson();
	}



	public String getMessageToPerson() {
		return this.messageToPerson;
	}



	public void setMessageToPerson(String messageToPerson) {
		this.messageToPerson += messageToPerson + " \n";
	}
	
	
}
