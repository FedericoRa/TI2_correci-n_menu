package exceptions;

public class CountryDoesNotExist extends Exception {
	private static final long serialVersionUID = 123124121L;

	public CountryDoesNotExist(String message){
	    super(message);
	  }
}