package Unit7_Arrays;

public class StringsWithMethod {

	public static void main(String[] args) {
		String emeraldIq="extremely low";
		System.out.println("emerald\'s Iq was: "+emeraldIq);
		changeIntelligence(emeraldIq);
		System.out.println("Will emerald\'s Iq change?\nEmerald\'s Iq: "+emeraldIq);
	}

	private static void changeIntelligence(String emeraldIq) {
		emeraldIq="low";
	}

}
