package week1.day2;

public class LearnSwitchCase {

	public static void main(String[] args) {

		String browserName="Sa";
		//switch -ctrl+space
		//key -variable name
		//value-Chrome
		switch (browserName) {
		case "Edge":System.out.println("Edge browser is opened");
			break;
		case "Chrome":System.out.println("Chrome browser is opened");	
            break;
		case "Firefox":System.out.println("Firefox browser is opened");
		break;
		case "Safari": System.out.println("Safari browser is opened");
		break;
		case "IE": System.out.println("IE browser is opened");
		break;
		default:System.out.println("BrowserName is not in the case");
			break;
		}
		
		
	}

}
