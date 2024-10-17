package Assignments;


interface InhOne{
	void become();
}

class whatBecome implements InhOne{

	@Override
	public void become() {
		// TODO Auto-generated method stub
		System.out.println("Become doctor");
	}
	
	
}
public class InheritInterfaceProperty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new whatBecome().become();
	}

}
