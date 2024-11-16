package Encapsulation;

public class ThisKeyword {

	String name="Rohit";
	
	String useOfThis(String name) {
		 this.name=name;
		return name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisKeyword Th=new ThisKeyword();
		String updateName=Th.useOfThis("Sameer");
		
		System.out.println("Updated name: "+ updateName);
		
		System.out.println("Instance String value: "+ Th.name);
	}

}
