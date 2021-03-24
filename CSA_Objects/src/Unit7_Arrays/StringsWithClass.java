package Unit7_Arrays;

class Emerald{
	String intelligence="low";
}
  class StringsWithClass {
	
	public static void changeIntelligence(Emerald x) {
		x.intelligence="extremely low";
	}
	
	public static void main(String[] args) {
		Emerald iq=new Emerald();
		System.out.println("Emerald\'s Iq was: "+iq.intelligence);
		changeIntelligence(iq);
		System.out.println("Will Emerald\'s Iq change?\nEmerald\'s Iq is: "+iq.intelligence);
		
	}

}
