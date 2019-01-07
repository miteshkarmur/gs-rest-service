package hello;

public class Word {
	
	private String word;
	private Boolean palindrome;
	private Boolean anagramOfPalindrome;
	
	public Word() {
		
	}

	public Word(String word, Boolean palindrome, Boolean anagramOfPalindrome) {
		this.word = word;
		this.palindrome = palindrome;
		this.anagramOfPalindrome = anagramOfPalindrome;
	}

	public String getword() {
		return word;
	}

	public void setword(String word) {
		this.word = word;
	}

	public Boolean getPalindrome() {
		return palindrome;
	}

	public void setPalindrome(Boolean palindrome) {
		this.palindrome = palindrome;
	}

	public Boolean getAnagramOfPalindrome() {
		return anagramOfPalindrome;
	}

	public void setAnagramOfPalindrome(Boolean anagramOfPalindrome) {
		this.anagramOfPalindrome = anagramOfPalindrome;
	}

	@Override
	public String toString() {
		return "Word [word=" + word + ", palindrome=" + palindrome + ", anagramOfPalindrome="
				+ anagramOfPalindrome + "]";
	}
	
	
	

}
