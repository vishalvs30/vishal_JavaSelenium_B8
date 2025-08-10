package assignment3;

public class SortCharac {
	 public static void main(String[] args) {
	        String str = "program";
	        char[] charArr = str.toCharArray();
	        
	        for (int i = 0; i < charArr.length - 1; i++) {
	            for (int j = 0; j < charArr.length - i - 1; j++) {
	                if (charArr[j] > charArr[j + 1]) {
	                    char temp = charArr[j];
	                    charArr[j] = charArr[j + 1];
	                    charArr[j + 1] = temp;
	                }
	            }
	        }
	        
	        String sortedString = new String(charArr);
	        
	        System.out.println("Original string: " + str);
	        System.out.println("Sorted string: " + sortedString);
	    }
}
