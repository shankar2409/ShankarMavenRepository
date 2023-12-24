package stringBuffer;

public class string {

	public static void main(String[] args) throws Exception {
		StringBuilder sb=new StringBuilder("Shankar");
		sb.append('s');
		System.out.println(sb);
		sb.append("aa");
		System.out.println(sb);
		sb.capacity();
		System.out.println(sb);
		sb.append(sb, 2, 4);
		System.out.println(sb);
		sb.append(sb);
		System.out.println(sb);
		sb.append(12345678l);
		System.out.println(sb);
		System.out.println(sb.hashCode());
		System.out.println(sb.isEmpty());
		System.out.println(sb.codePointBefore(5));
		System.out.println(sb.substring(2, 5));
		System.out.println(sb.delete(0, 3));
		System.out.println(sb.reverse());
		System.out.println();
		sb.lastIndexOf("ad",5);
		System.out.println(sb);
		System.out.println(sb.replace(3,4, "shan"));
		sb.trimToSize();
		System.out.println(sb.deleteCharAt(2));
		String s="abcde".toUpperCase();
		byte[] a=s.getBytes();
		for(byte c:a)
		{
			System.out.print(c+ " ");
		}	
	}
	

}
