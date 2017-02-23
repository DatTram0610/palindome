
public class palinDromeFunction {
	boolean checkPalindrome(String inputString) {
	    int start = 0;
	    int end = inputString.length() - 1;
	    boolean condition = false;
	    
	    while (end > start) {
	        if (inputString.charAt(start) == inputString.charAt(end)) {
	            start ++;
	            end --;
	        }
	        else {
	            break;
	        }
	    if (inputString.charAt(start) == inputString.charAt(end) ) {
	        condition = true;
	        }
	    else {
	        condition = false;
	    }
	    }
	    return condition;
	}

}
