package OOPS;

public class consChain {

	public consChain() {
		System.out.println("this is superclass constructor");
		
	}
 
}
class sub extends consChain{

	public sub() {
		super();
		System.out.println("This is subclass constructor");
	}
	
}
class main1{
	public static void main(String[] args) {
		sub sub = new sub();
	}
}
