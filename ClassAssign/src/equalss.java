import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

class equalsMet {
	String sname;
	int sid;
	
	public equalsMet(String sname, int sid) {
		super();
		this.sname = sname;
		this.sid = sid;
	}
	@Override
	public String toString() {
		
		return "sname : "+sname+"  sid  : "+sid;
	}
	@Override
	public boolean equals(Object o) {
		equalsMet s=(equalsMet)o;
		return this.sname.equals(s.sname) && this.sid==s.sid;
		}
	@Override
	public int hashCode() {
		return Objects.hash(sname,sid);
	}
}
public class equalss{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		equalsMet em=new equalsMet("smith", 22);
		equalsMet em1=new equalsMet("shankar", 2);
		equalsMet em2=em1;
		equalsMet em3=new equalsMet("shankar", 2);
		System.out.println(em.toString());
		System.out.println(em3.equals(em1));
		System.out.println(em1.hashCode()==em3.hashCode());
		int[][] vn=new int[2][3];
		vn[1][1]=10;
		vn[1][2]=20;
		System.out.println(vn);
		for(int i=0;i<vn.length;i++) {
			for(int j=0;j<vn[i].length;j++) {
				System.out.print(vn[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<vn.length;i++) {
			for(int j=0;j<vn[i].length;j++) {
				vn[i][j]=s.nextInt();
			}
		}
		
	
	}
}
