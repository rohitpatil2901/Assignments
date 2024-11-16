package Encapsulation;


class encp{
	
	private String Account="493893489833";

	public String getAccount() {
		return Account;
	}

	public void setAccount(String account) {
		Account = account;
	}
	
	
}                            
public class EncapsulationOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		encp e=new encp();
		e.setAccount("2222222222");
		System.out.println(e.getAccount());
	
	}

}
