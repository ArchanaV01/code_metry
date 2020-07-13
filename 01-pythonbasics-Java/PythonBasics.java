// Write a non static method called "show_excitement" where the string
// "I am super excited for this course!" is returned exactly
// 5 times, where each sentence is separated by a single space.
// Return the string with "return".
// You can only have the string once in your code.
// Don't just copy/paste it 5 times into a single variable!

public class PythonBasics {
	public static void main(String[] args) {

	}

	public String show_excitement() {
		// your code goes here
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 5; i++) {
			sb.append("I am super excited for this course! ");
		}
		return sb.toString();
	}
}