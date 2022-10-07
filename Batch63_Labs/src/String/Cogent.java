package String;
/**
 * 
 * @authorofclassfile Charlie 
 * @date   Oct 6, 2022
 */
//Cogent University Lab 01
//Author: Jayant Kumar Surya
class D{
	public static void main(String[]args) {
		String s1="cogent";
		String s2=new String("Jayant");
		System.out.println(s1.toString());
		System.out.println(s2.equals(s2));
	}
}
class I{
	public static void main(String[]args) {
		String s1="cogent";
		String s2="cogent";
		String s3=new String(s1);
		String s4=new String(s2);
		System.out.println("--------------");
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		System.out.println(s1==s4);
		System.out.println(s3==s4);
		System.out.println("--------------");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	}
}
class K{
	public static void main(String[]args) {
		String s1="COGENT";
		String s2="cogent";
		System.out.println(s1.equals(s2));
		System.out.println("====");
		System.out.println(s1.equals(s2.toUpperCase()));
		System.out.println(s1.toLowerCase().equals(s2));
		System.out.println("========");
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println("done");
	}
}
class Q{
	public static void main(String[]args) {
		System.out.println(2+4);
		System.out.println(2+"cogent");
		System.out.println("cogent"+null);
		System.out.println("cogent"+2+null);
	}
}
class T{
	public static void main(String[]args) {
		String s1="ja";
		String s2="va";
		String s3=s1.concat(s2);
		String s4="java";
		System.out.println(s3==s4);
	}
}
class V{
	public static void main(String[]args) {
		String s1="null";
		System.out.println(s1.length());
	}
}
class Z{
	public static void main(String[]args) {
		String s1="abc123xyz";
		System.out.println(s1.length());
		System.out.println("--------");
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(3));
		System.out.println(s1.charAt(8));
	}
}
class A{
	public static void main(String[]args) {
		String s1="a1b2c3x1y2x3";
		System.out.println(s1.length());
		System.out.println(s1.indexOf('2'));
		System.out.println(s1.indexOf('x'));
		System.out.println(s1.indexOf('x',8));
		System.out.println(s1.indexOf(2,3));
	}
}
class C{
	public static void main(String[]args) {
		String s1="cogent technology";
		String s2=s1.substring(5);
		String s3=s1.substring(5,9);
		System.out.println(s2);
		System.out.println("--------");
		System.out.println(s3);
		System.out.println("---------");
	}
}
class E{
	public static void main(String[]args) {
		String s1="abc";
		String s2="Abc";
		String s3="xyz";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareToIgnoreCase(s2));
	}
}
class G{
	public static void main(String[]args) {
		String s1="cogent tech";
		System.out.println(s1.startsWith("cogent"));
		System.out.println(s1.startsWith("123"));
		System.out.println(s1.startsWith("te"));
		System.out.println("done");
	}
}
class J{
	public static void main(String[]args) {
		StringBuffer sb1=new StringBuffer("abc");
		sb1.append("xyz");
		sb1.append("\n");
		sb1.append("hello\t");
		sb1.append("test");
		System.out.println(sb1);
	}
}
class M{
	public static void main(String[]args) {
		StringBuffer sb1=new StringBuffer();
		sb1.append("abc");
		sb1.append("xyz");
		StringBuffer sb2=new StringBuffer();
		sb1.append("abc");
		sb1.append("xyz");
		System.out.println(sb1.equals(sb2));
		System.out.println("done");
	}
}
class P{
	public static void main(String[]args) {
		String s1="abc xyz";
		s1.trim();
		System.out.println(s1.length());
		s1=s1.trim();
		System.out.println(s1.trim().length());
		
	}
}
class T1{
	public static void main(String[]args) {
		StringBuffer sb=new StringBuffer();
		sb.append("abc");
		sb.append("hello");
		System.out.println(sb);
		System.out.println("---------");
		System.out.println(sb.delete(0, 3));
		System.out.println("---------");
		System.out.println(sb.deleteCharAt(4));
	}
}
class A1{
	public static void main(String[]args) {
		System.out.printf("hello %s","india");
		System.out.println("");
		String s1="indian";
		System.out.printf("hi %s", s1);
	}
}
class I1{
	public static void main(String[]args) {
		String s1="hello";
		String s2="hello";
		String s3=new String("hello");
		String s4=new String("hello");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s3==s4);
	}
}
class reverseString{
	public static void main(String[]args) {
		String s1="cogent technology";
		char c[]=new char[5];
		System.out.printf("given string: %s", s1);
		System.out.printf("\nlength of string: %d",s1.length());
		System.out.println("\n the reversed string is: ");
		for(int count=s1.length()-1;count>=0;count--) {
			System.out.printf("%s", s1.charAt(count));
		}
	}
}
class H1{
	public static void main(String[]args) {
		String s1=new String("cogent technology");
		System.out.println(s1.substring(2,8));
		System.out.println(s1.length());
	}
}
class E1{
	public static void main(String[]args) {
		String s1="abc 123";
		s1.trim();
		String s2="abc 123";
		System.out.println(s1.equals(s2));
	}
}
public class Cogent {
	public static void main(String[]args) {
		D.main(args);
		I.main(args);
		K.main(args);
		Q.main(args);
		T.main(args);
		V.main(args);
		Z.main(args);
		C.main(args);
		E.main(args);
		G.main(args);
		J.main(args);
		M.main(args);	
		P.main(args);
		T1.main(args);
		A1.main(args);
		reverseString.main(args);
		I1.main(args);
		H1.main(args);
		E1.main(args);
		
	}
}
