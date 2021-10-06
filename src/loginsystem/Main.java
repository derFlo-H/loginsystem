package loginsystem;

/*
 * Loginsystem
 * 
 * simple login screen with GUI
 * able to create and login to accounts
 * 
 * Date: 041021
 * Author: Florian
 */

public class Main {

	public static void main(String[] args) {
		
		GUI e;
		e = new GUI("e", 320, 180);
		login("flo", "1234");
		
	}
	
	// SignIn logic
	public static void signin(String name, String password) {
		FileIO.output(name + ".txt", password);
		login(name, password);
		
	}
	
	// Login logic
	public static boolean login(String name, String password) {
		if(password.equals(FileIO.input(name + ".txt"))) {
			return true;
			
		}
		
		return false;
		
	}

}
