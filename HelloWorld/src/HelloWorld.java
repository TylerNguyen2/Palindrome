public class HelloWorld {

	public static void main(String[] args) {
		//initializing variables
		String str = "racecar";
		System.out.println("Is " + str + " a palindrome?: " + isPalindrome(str));
	}
	
	//method isPalindrome checking if the argument (a string) is a palindrome (same word forwards and backwards) and returns a boolean result
	public static boolean isPalindrome(String str) {
	    if (str.length() < 2) {
	    	return true;
	    }
	    char first = str.charAt(0);
	    char last = str.charAt(str.length() - 1);
	    //this part uses recursion to go through the string to compare the char at the index of the string with the end of the other,
	    //i.e if a word had 4 letters, it'd check index 0 and 3, then 1 and 2.
	    if (first != last) {
	    	return false;
	    }else {
	    	return isPalindrome(str.substring(1, str.length() - 1));
	    }
	}
}

