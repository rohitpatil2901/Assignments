package Assignments;

class Bone {

	public Bone() {

		System.out.println("Bone");
	}

	Bone(int a) {
		this(true);
		System.out.println("BTwo");

	}

	Bone(int a,int b) {
		System.out.println("BThree");
	}

	Bone(String r) {
		System.out.println("BFour");
	}

	Bone(boolean s) {
		System.out.println("BFive");
	}

}

public class DemoTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Bone(true);
		new Bone();
		new Bone("Rohit");
		new Bone(10,20);
		new Bone(4);
	}

}
