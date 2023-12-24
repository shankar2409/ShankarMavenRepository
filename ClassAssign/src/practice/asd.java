package practice;

 class aar {
	String s;
	String b;
	public aar()
	{
		this("s","s");
		new aar("ss","aa");
	}
	private aar(String s, String b) {
		super();
		this.s = s;
		this.b = b;
	}
	
}
 public class asd extends aar{
	public static void main(String[] args) {
		aar a=new aar();
	}
	asd()
	{
		super();
	}
}
