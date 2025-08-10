package Assignment4;

class Bank {
    double getInterestRate() {
    	return 0.0; 
    	}
}

class SBI extends Bank {
    double getInterestRate() { 
    	return 6.7; 
    	}
}

class ICICI extends Bank {
    double getInterestRate() { 
    	return 7.0; 
    	}
}

class HDFC extends Bank {
    double getInterestRate() { 
    	return 7.5; 
    	}
    }

public class Interest {
	 public static void main(String[] args) {
	        Bank b1 = new SBI();
	        Bank b2 = new ICICI();
	        Bank b3 = new HDFC();
	        System.out.println(b1.getInterestRate());
	        System.out.println(b2.getInterestRate());
	        System.out.println(b3.getInterestRate());
	    }
}
