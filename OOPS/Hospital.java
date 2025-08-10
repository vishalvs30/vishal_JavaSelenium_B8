package OOPS;

public class Hospital {
	void hospitalInfo() {
        System.out.println("This is Apollo Hospital, Bengaluru.");
    }
}
class Doctor extends Hospital{
	 void doctorInfo() {
	        System.out.println("Dr. Arjun: General physician");
	    }
}
class Nurse extends Hospital{
	void nurseInfo() {
        System.out.println("Nurse Priya: Assists in patient care and medicine.");
    }
}
class Accountant extends Hospital {
    void accountantInfo() {
        System.out.println("Mr. Ravi: Handles billing and salaries.");
    }

}
class Gynac extends Doctor{
	void gynacInfo() {
        System.out.println("Dr. Sneha: Gynecologist, takes care of women and childbirth.");
    }
}
class Endo extends Doctor{
	 void endoInfo() {
	        System.out.println("Dr. Rakesh: Endocrinologist, treats diabetes and thyroid.");
	    }
}
class cardiac extends Doctor{
	void cardiacInfo() {
        System.out.println("Dr. Mehta: Cardiologist, treats heart problems.");
    }
}
class Operation extends cardiac{
	void operationInfo() {
        System.out.println("Heart Surgery Team: Does bypass, valve replacements.");
    }
}
class OPD extends cardiac{
	 void opdInfo() {
	        System.out.println("Cardiac OPD: Treats minor chest pain, BP checks.");
	    }
}
class Payments extends Accountant{
	void paymentsInfo() {
        System.out.println("Handles payment from patients & pays vendors.");
    }
}
class Documentation extends Accountant{
	 void documentationInfo() {
	        System.out.println("Maintains all patient records and bills.");
	    }
}

		

