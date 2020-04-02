package zjavacollections;

class Driver {


	static Driver d;

	
	
	// Forcing not to Give an Object Of this Class 
	private Driver() {
		
	}
	
	// Singleton Mechanism
	public static Driver getDriver() {

		if(d==null) {
			d=new Driver();
		}
		return d;
	}


	public static Driver removeDriver() {
		d=null;
		return d;
	}


}
