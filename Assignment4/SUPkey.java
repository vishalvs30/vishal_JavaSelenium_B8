package Assignment4;
class Parent {
    int value = 10;
    void display() { 
    	System.out.println("Parent method"); 
    	}
}

class Child extends Parent {
    int value = 20;
    void show() {
        System.out.println(super.value);
        super.display();
    }
}

public class SUPkey {
	 public static void main(String[] args) {
	        Child c = new Child();
	        c.show();
	    }
}
