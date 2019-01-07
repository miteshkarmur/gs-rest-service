package hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WordController {
	
	static final int NO_OF_CHARS = 256;
	
	@GetMapping("/words/{word}")
	public Word getWordInfo(@PathVariable String word) {

		Boolean palindrome=checkPalindrome(word);
		Boolean anagramOfPalindrome=checkAnagram(word);

		Word w=new Word(word, palindrome, anagramOfPalindrome);
		return w;

	}

	private Boolean checkAnagram(String word) {
		int[] count = new int[NO_OF_CHARS]; 
		  
        for (int i = 0; i < word.length(); i++) 
            count[word.charAt(i)]++; 
  
        int odd = 0; 
        for (int i = 0; i < NO_OF_CHARS; i++) { 
        	if (count[i]%2 != 0) 
                odd++; 
  
            if (odd > 1) 
                return false; 
        }  
        return true; 
	}

	private Boolean checkPalindrome(String word) {

		String rev = new StringBuffer(word).reverse().toString(); 

		if (word.equals(rev))
			return true;
		else
			return false;

	}
}
