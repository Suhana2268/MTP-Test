package question_2;

public class Vehicle {
	public String setSpeed(int s) throws SpeedInValidException {
		if(s>=30 && s<=90) {
			return "Valid Speed";
		}
		else {
			throw new SpeedInValidException("SpeedInValidException");
		}
	}

}

 class SpeedInValidException extends Exception {
	public SpeedInValidException() {
		super();
	}

	public SpeedInValidException(String s) {
		super(s);
	}

public String toString(){
   return "SpeedInvalidException";
}

}
