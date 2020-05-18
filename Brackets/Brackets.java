
public class Brackets {	
	public static boolean isValid(String textToCheck) {
	    int textLength = textToCheck.length();
	    int topPosition = 0;
	    int stackSize = 0;
	    char[] stack = new char[textLength];
	    
	    if (textLength == 0) {
	        return true;
	    }
	    
	    if (textLength % 2 != 0) {
	        return false;
	    }
	    
	    for (char c : textToCheck.toCharArray()) {	        
	        if (c == '(' || c == '[' || c == '{') {
	            stack[topPosition] = c;
	            stackSize++;
	        } else {
	            if (c == ')') {
	                if (stack[topPosition] != '(') {
	                    return false;
	                }
	            }
	            else if (c == ']') {
	                if (stack[topPosition] != '[') {
	                    return false;
	                }
	            }
	            else if (c == '}') {
	                if (stack[topPosition] != '{') {
	                    return false;
	                }
	            }
                
	            stackSize--;
	        }
	        
	        if (stackSize > 0) {
	            topPosition = stackSize - 1;
	        } else {
	            topPosition = 0;
	        }
	        
	    }
	    
	    return true;
	}
}