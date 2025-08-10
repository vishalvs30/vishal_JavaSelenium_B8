package OOPS;

public class Main {
	 public static void main(String[] args) {
	        Gynac g = new Gynac();
	        g.hospitalInfo();       // From Hospital
	        g.doctorInfo();         // From Doctor
	        g.gynacInfo();          // Specific

	        OPD opd = new OPD();
	        opd.cardiacInfo();      // From Cardiac
	        opd.opdInfo();          // OPD duty

	        Documentation doc = new Documentation();
	        doc.accountantInfo();   // Accountant base
	        doc.documentationInfo(); // Specific to documentation
	    }
}
