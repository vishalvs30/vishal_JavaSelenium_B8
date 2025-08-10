package OOPS;

abstract class Animal{
	abstract void sound();
		
	void eat(){
       
	}
}
class lion extends Animal{
	void sound() {
		System.out.println("Roarr");
	}
}

public class Animalsimulator {
  public static void main(String[] args) {
	lion li = new lion();
	li.sound();
}
}
