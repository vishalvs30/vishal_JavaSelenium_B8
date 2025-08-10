package assignment3;

public class countWords {
	 public static void main(String[] args) {
	        String sentence = "Java is a programming language";
	        String[] words = sentence.split(" ");
	        
	        System.out.println("Sentence: " + sentence);
	        System.out.println("Number of words: " + words.length);
	    }
}
