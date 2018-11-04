/**
 * INSTRUCTIONS.
 * 
 * Welcome to Problem Set 4, where we'll dive into writing our own methods with
 * parameters and return values. The focus, this time, will be on the built-in @String
 * and @Math classes.
 * 
 * You'll note that most of the methods have not been included. Instead, you'll see
 * specifications pertaining to their signatures (i.e., the method name, as well as
 * its return type and parameter list). You'll need to be sure to meet these
 * specifications exactly.
 * 
 * As always, please be mindful of your output (in this case, returned values rather
 * than printed text). Your solutions will be tested against a set of expected
 * values, and the grading script will expect an exact match.
 * 
 * This problem set contains 10 exercises worth 50 points. It is due no later than
 * 11:59pm on Sunday, November 4, 2018. Good luck! 
 */

public class ProblemSet4 {
	
	public static void main(String[] args) {
		ProblemSet4 ps = new ProblemSet4();
		ps.surroundMe("inen", "abc");
		ps.endsMeet("abcdef", 2);
		ps.middleMan("abcdefghijk");
		ps.doubleVision("abcd");
		ps.centered("candy", "and");
		ps.upOrDown(12.2, 'r');
		ps.countMe("happy birthday", 'g');
		ps.isNotEqual("is not is not is not");
		ps.triplets("abbbccccd");
		ps.addMe("123ab456ab789a123", true);
	}
	public String surroundMe(String out, String in) {
		if (out.length() != 4 || in.length() != 3 || out == null || in == null) {
			return null;
		}
		else {
			String output = out.substring(0, 2) + in + out.substring(2, 4);
			return output;
		}
	}
	public String endsMeet(String str, int n) {
		if (str == null || !(str.length() >= 1 && str.length() <= 10) || !(n >= 1 && n <= str.length())) {
			return null;
		}
		else {
			String output = str.substring(0, n) + str.substring(str.length()- n, str.length());
			return output;
		}
	}
	public String middleMan(String str) {
		if (str == null || str.length() % 2 == 0) {
			return null;
		}
		else {
			int n = str.length() / 2;
			String output = str.substring(n-1, n+2);
			return output;
		}
	}
	public String doubleVision(String str) {
		if (str == null) {
			return null;
		}
		else {
			String output = "";
			for(int n = 0; n < str.length(); n++) {
				output = output + str.charAt(n) + str.charAt(n);
			}
			return output;
		}
	}
	public boolean centered(String str, String target) {
		if ( str == null || target == null || target.length() != 3) {
			return false;
		}
		else {
			int n = str.length() / 2;
			if (target.equals( str.substring(n-2, n+1)) ) {
				return true;
			}
			else if (target.equals(str.substring(n-1, n+2)) ) {
				return true;
			}
			else if (target.equals(str.substring(n, n+3)) )  {
				return true;
			}
			else {
				return false;
			}
		}
	}
	public int upOrDown(double number, char operation) {
		if (operation == 'r'|| operation == 'f' || operation == 'c') {
			if(operation == 'r') {
				int output = (int)Math.round(number);
				return output;
			}
			else if(operation == 'f') {
				int output = (int)number;
				return output;
			}
			else if(operation == 'c') {
				int output = (int)number + 1;
				return output;
			}
			else {
				return -1;
			}
		}
		else {
			return -1;
		}
	}
	public int countMe(String text, char end) {
		if (text == null || Character.isLetter(end) == false) {
			return -1;
		}
		else {
			int count = 0;
			for (int i = 0; i < text.length(); i++) {
				if (text.charAt(i) == end) {
					count++;
			    }
			}
			return count;
		}
	}
	public boolean isNotEqual(String str) {
		if(str == null) {
			return false;
		}
		else {
			int counti = 0;
			int counts = 0;
			int countn = 0;
			int counto = 0;
			int countt = 0;
			for (int i = 0;i < str.length(); i++) {
				if (str.charAt(i) == 'i') {
					counti++;
				}
				if (str.charAt(i) == 's') {
					counts++;
				}
				if (str.charAt(i) == 'n') {
					countn++;
				}
				if (str.charAt(i) == 'o') {
					counto++;
				}
				if (str.charAt(i) == 't') {
					countt++;
				}
			}
			if (counti == counts && counti == countn && counti == counto && counti == countt) {
				return true;
			}
			else {
				return false;
			}
		}
	}
	public int triplets(String str) {
		boolean alpha = true;
		for (int i = 0; i != str.length(); i++) {
	        if (!Character.isLetter(str.charAt(i))) {
	        	alpha = false;
	        }
	    }
		if (str == null || str.contains(" ") == true || alpha == false ) {
			return -1;
		}
		else {
			int count = 0;
			for (int i = 0;i < str.length(); i++) {
				if(i > 0 ) {
					if (str.charAt(i) == str.charAt(i-1) && str.charAt(i) == str.charAt(i+1)) {
					count++;
					}
				}
			}
			return count;
		}
	}
	public int addMe(String str, boolean digits) {
		if (str == null || str.contains(" ") == true) {
			return -1;
		}
		else {
			int sum = 0;
			if (digits == true) {
				for (int i = 0;i < str.length(); i++) {
					if (Character.isDigit(str.charAt(i))) {
			        	sum = Integer.valueOf(String.valueOf(str.charAt(i))) + sum;
					}
				}
				return sum;
			}
			else {
				String[] arraystring = new String[10];
				arraystring[0] = "0";
				arraystring[1] = "0";
				arraystring[2] = "0";
				arraystring[3] = "0";
				arraystring[4] = "0";
				arraystring[5] = "0";
				arraystring[6] = "0";
				arraystring[7] = "0";
				arraystring[8] = "0";
				arraystring[9] = "0";
				int counter = 0;
				int max = 0;
				for (int i = 0;i < str.length(); i++) {
					if (Character.isDigit(str.charAt(i))) {
						arraystring[counter] += String.valueOf(str.charAt(i));
					}
					else if ((Character.isLetter(str.charAt(i))&& !Character.isLetter(str.charAt(i-1))) || i == str.length() -1){
						counter++;
					}
					max = counter;
				}
				for (counter = 0; counter < max+1; counter++) {
					sum = Integer.valueOf(String.valueOf(arraystring[counter])) + sum;
				}
				return sum;
			}
		}
	}
}