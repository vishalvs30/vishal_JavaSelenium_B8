package OOPS;

public class login {
    
    String username="John"; 
	private String password;
	
	public String getPassword() {
		return password;
	}
    public void setPassword(String password) {
		this.password = password;
	}

    public static void main(String[] args) {
     login l=new login();
     l.setPassword("John@123");
     System.out.println("Username: "+ l.username);
     System.out.println("Password: " + l.getPassword());
	}

}
