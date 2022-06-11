package nileshstringprogram;

public class StringReverse {
	public static void main(String[] args) {
		
		 String str = "how are you";
		 String[] word = str.split(" ");
		 for(int i=word.length-1; i>=0; i--) {
			 System.out.println(word[i]);
		 }
		
	}

}
