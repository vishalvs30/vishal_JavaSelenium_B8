package OOPS;

class Student {
	
    int id;
    String name;

    
    Student() {
        this(101, "John");
        System.out.println("No-arg constructor called");
    }

    
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

  
    void show() {
        this.display();
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

   
    void callPassObj() {
        helper(this);
    }

    void helper(Student s) {
        System.out.println("Object passed: " + s.name);
    }

   
    Student getObject() {
        return this;
    }

    public static void main(String[] args) {
        Student s1 = new Student();      // this() used
        s1.show();                       // this used to call method
        s1.callPassObj();                // this used to pass object
        Student s2 = s1.getObject();     // this returned as object
        System.out.println("Returned Object Name: " + s2.name);
    }
}
