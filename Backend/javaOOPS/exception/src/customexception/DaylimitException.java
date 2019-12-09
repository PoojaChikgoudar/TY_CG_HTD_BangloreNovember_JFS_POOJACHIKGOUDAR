package customexception;

public class DaylimitException extends RuntimeException{
	String msg="Exceeds day limit";
	DaylimitException(){
		
	}
	public DaylimitException(String msg) {
		super();
		this.msg = msg;
	}
	public String getMessage() {
		return this.msg;
		
	}
	
	

}
