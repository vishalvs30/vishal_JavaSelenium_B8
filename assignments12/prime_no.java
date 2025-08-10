package assignments12;

public class prime_no {
	public static void main(String[] args) {
		int n=12,c=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0){
				c++;
			}
		}
		if(c==2) {
			System.out.println("Prime No");
		}
		else {
			System.out.println("Not a prime no");
		}
	}
}
