package Assignments;

import java.util.Date;

public class CurrentTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d1=new Date();
		long l1=d1.getTime();
		System.out.println("Current time in milliseconds: "+l1);
		
		Date d2=new Date(d1.getTime()-(1000*60*60*24*4));
		System.out.println("Date 4 days ago: "+d2);
		
		String d3=d2.toString();
		
		String month=d3.substring(4, 7);
		System.out.println("Month: "+month);
		
		String year=d3.substring(d3.length()-4);
		System.out.println("Year: "+year);
		
		String date=d3.substring(8, 10);
		System.out.println("Date: "+date);
		
		String dateformat=date.concat("-").concat(month).concat("-").concat(year);
		System.out.println("Date in dd-mm-yyyy format: "+dateformat);
		
		
	}

}
