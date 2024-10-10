package Assignments;

abstract class AbstractandConcreteOne {

	abstract void soil();
	
}

 class Water extends AbstractandConcreteOne{
	

	@Override
	void soil() {
		System.out.println("Soil is goood");
		
	}
	
	
}
 
 public abstract class AbstractandConcrete extends AbstractandConcreteOne {
	 
	 public static void main(String args[]) {
		 
		 Water wt=new Water();
		 wt.soil();
	 }

	
 }

