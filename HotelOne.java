package Assignments;

interface resort{
	
	String Baliresort();
	String Goaresort();
}

interface  resorttwo extends resort{
	
	String Dubairesort();
	String Omanresort();
	
}

abstract class asianResorts implements resorttwo,resort{
	
	
}

abstract class FirstOwnerOfResort extends asianResorts{
	
}

class SecondOwnerOfResort extends FirstOwnerOfResort{

	String s="R";
	@Override
	public String Dubairesort() {
		// TODO Auto-generated method stub
		System.out.println("Dubai");	
		return s;
		
	}

	@Override
	public String Omanresort() {
		// TODO Auto-generated method stub
		System.out.println("OmanOILCanteen");
		return "OmanOIL";
		
	}

	@Override
	public String Baliresort() {
		// TODO Auto-generated method stub
		System.out.println("Bali");
		return "BaliTourism";
	}

	@Override
	public String Goaresort() {
		// TODO Auto-generated method stub
		System.out.println("Goa");
		return "Goa SeaSide";
	}
	
	
}


public class HotelOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondOwnerOfResort sO=new SecondOwnerOfResort();
		sO.Baliresort();
		sO.Dubairesort();
		sO.Goaresort();
		sO.Omanresort();
	}

}
