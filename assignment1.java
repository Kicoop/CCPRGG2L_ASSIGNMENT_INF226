import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class kikostudentchecker {
	  public static void main(String[] args) {
	
	    Scanner s = new Scanner(System.in);
	    System.out.println("Enter your National University email");
	    String email = s.nextLine();

	    String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@students\\.national-u\\.edu\\.ph";
	    Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(email);

	    if (matcher.matches()) {
	      System.out.println("The Email " + email + " is valid");
	    } else {
	      System.out.println("The Email you entered is invalid");
	    }
	  }
}
