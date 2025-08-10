package Assignment4;

class Vehicle {
    void show() {
    	System.out.println("This is a vehicle"); 
    	}
}

class FourWheeler extends Vehicle {
    void showType() { 
    	System.out.println("Four Wheeler"); 
    	}
}

class PetrolFourWheeler extends FourWheeler {
    void fuelType() { 
    	System.out.println("Petrol Vehicle");
    	}
}

class FiveSeaterPetrolFourWheeler extends PetrolFourWheeler {
    void seats() 
    { 
    	System.out.println("Five Seater"); 
    	}
}

class Baleno extends FiveSeaterPetrolFourWheeler {
    void brand() 
    { 
    	System.out.println("Baleno Car"); 
    	}
    }
    
public class MultiInheri {
	public static void main(String[] args) {
        Baleno b = new Baleno();
        b.show();
        b.showType();
        b.fuelType();
        b.seats();
        b.brand();
    }
}
