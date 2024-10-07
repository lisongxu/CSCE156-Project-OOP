package unl.soc;

public interface PostContentFormatter {
	/** This method returns a string of exactly 42 characters
	 * the first character is |
	 * then 40 characters of the content
	 * the last character is |
	 */ 
	String getFormattedContent();
}
