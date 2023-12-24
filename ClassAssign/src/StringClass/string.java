package StringClass;

public class string {

	public static void main(String[] args) {
		String s="java is a programming language        ";
		String s1="hi ";
		System.out.println("toLowerCase output   "+s.toLowerCase());
		System.out.println("=============================");
		System.out.println("toUppercase "+s.toUpperCase());
		System.out.println("=============================");
		System.out.println("concat String  "+s.concat(s1));
		System.out.println("=============================");
		System.out.println("substring  "+s.substring(2));
		System.out.println("=============================");
		System.out.println("substring range   >>  "+s.substring(2,6));
		System.out.println("=============================");
		System.out.println("length of the String >>>>  "+s.length());//
		System.out.println("=============================");
		System.out.println("given string is empty or not  >>>>   "+s.isEmpty());//false
		System.out.println("=============================");
		System.out.println("given char is present or not >>   "+s.indexOf('d'));//false
		System.out.println("=============================");
		System.out.println("given string to start position  >>>  "+s.indexOf('a',4));
		System.out.println("=============================");
		System.out.println("given string sequence isreturn int values "
				+ "from the sequence  >>  "+s.indexOf("am",4));
		System.out.println("=============================");
		System.out.println("given string to present or not  >>>   "+s.contains("amm"));
		System.out.println("=============================");
		System.out.println("removes the first and last space "+s.trim());//remove the both first and last space values
		System.out.println("=============================");
		System.out.println("given positon it checks and give the char  >>  "+s.charAt(5));//char return
		System.out.println("=============================");
		System.out.println("convert string to char  >>>>>    "+s.toCharArray());//char array return
		System.out.println("=============================");
		System.out.println("split string to string in multiples stringg>>>    "+s.split("shankar"));//String array return
		System.out.println("=============================");
		System.out.println("replace the char>>>   "+s.replace('a','a'));
		System.out.println("=============================");
		System.out.println("replace the string  >>  "+s.replace("a","aa"));
		System.out.println("=============================");
		System.out.print(  "gives the byte array  >>  "+s.getBytes()+" ");
		System.out.println("=============================");
		System.out.println("equals string compare  >>  "+s.equals(s1));
		System.out.println("=============================");
		System.out.println("ignore case  >>   "+s.equalsIgnoreCase(s1));
		System.out.println("=============================");
		System.out.println("compare To strings  >> "+"Abcd".compareTo("abcd"));
		System.out.println("=============================");
		System.out.println("manual".compareTo("manual"));
	}

}
