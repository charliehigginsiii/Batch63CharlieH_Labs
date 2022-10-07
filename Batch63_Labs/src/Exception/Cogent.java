package Exception;
/**
 * 
 * @authorofclassfile Charlie 
 * @date   Oct 6, 2022
 */
//Cogent University Lab 01
//Author: Jayant Kumar Surya
public class Cogent {
	int test1() {
		int k=0;
		try {
			int i=7;
			int j=0;
			k=i/j;
		}catch(ArithmeticException ex) {
			
		}
		finally {
			
		}
		return 10;
	}
	int test2() {
		try {
			
		}catch(ArithmeticException ex) {
			
		}finally {
			return 30;
		}
	}
	static int test() {
		try {
			return 10;
		}catch(NumberFormatException ex) {
			return 20;
		}finally {
			return 30;
		}
		//return 40;
	}
	static int test01() {
		try {
			
		}catch(NumberFormatException ex) {
			return 20;
		}finally{
			
		}
		return 40;
	}
	public static int test001() {
		try {
			return 0;
		}finally {
			System.out.println("Inside Finally block");
		}
	}
	static int test02() {
		try {
			
		}catch(NumberFormatException ex) {
			return 20;
		}finally {
			return 30;
		}
		//return 40;
	}
	public static void main(String[]args) throws ClassNotFoundException{
		//1
		try {
			int a, b;
			b=0;
			a=5/b;
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		//2
		try {
			int a[]= {1,2,3,4,5};
			for(int i=0;i<7;++i)
				System.out.println(a[i]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		//3
		try {
			System.out.println(1);
			int i=10/0;
			System.out.println(2);
		}catch(ArithmeticException ex) {
			System.out.println(3);
			System.out.println(ex.getMessage());
			System.out.println(4);
		}
		System.out.println(5);
		//4
		try {
			int i;
			return;
		}catch(Exception e) {
			System.out.println("inCatchBlock");
		}
		finally {
			System.out.println("inFinallyBlock");
		}
		//5
		System.out.println(1);
		if(true) {
			throw new ClassNotFoundException();
		}
		System.out.println(2);
		//6
		try {
			System.out.println(1);
			int i=10/0;
			System.out.println(2);
		}catch(NumberFormatException ex) {
			System.out.println(4);
			System.out.println(ex.getMessage());
			System.out.println(5);
		}finally {
			System.out.println(6);
		}
		System.out.println(5);
	
	//7
	try {
		System.out.println(1);
		String s=null;
		System.out.println(s);
		System.out.println(s.length());
	System.out.println(2);
	}catch(NullPointerException ex) {
		System.out.println(4);
		System.out.println(5);	
	}
	System.out.println(6);
	//8
	try {
		System.out.println(1);
		String s=null;
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(2);
	}catch(NullPointerException ex) {
		System.out.println(4);
		//System.out.println(s);
		System.out.println(5);
	}
	System.out.println(5);
	//9
	new Cogent().test1();
	new Cogent().test2();
	//10
	try {
		for(int i=5;i>=0;i--) {
			System.out.println(10/i);
		}
	}catch(Exception ex) {
		System.out.println("Exception Message: "+ex.getMessage());
		ex.printStackTrace();
	}
	System.out.println("After for loop...");
	//11
	try {
		int i=10/0;
	}catch(Exception ex) {
		System.out.println("Inside 1st catch Block");
	}finally {
		System.out.println("Inside 1st finally Block");
	}
	try {
		int i=10/10;
	}catch(Exception ex) {
		System.out.println("Inside 2nd catch Block");
	}finally {
		System.out.println("Inside 2nd finally block");
	}
	//12
	String languages[]= {"C","C++","Java",".Net","C#"};
	try {
		for(int i=1;i<=5;i++) {
			System.out.println(languages[i]);
		}
	}catch(Exception e) {
		System.out.println(e);
	}
	//13
		System.out.println(1);
		System.out.println(Cogent.test());
		System.out.println(2);
	//14
		System.out.println(1);
		System.out.println(Cogent.test01());
		System.out.println(2);
	//15
		System.out.println(Cogent.test001());
	//16
		try {
			long data[]=new long[1000000000];
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("finally block will execute always");
		}
	//17
		try{
			Cogent.badMethod();
		}catch(RuntimeException ex) {
			System.out.print("B");
		}catch(Exception ex1) {
			System.out.println("C");
		}finally {
			System.out.println("D");
		}
		System.out.println("E");
		//18
		System.out.println(1);
		if(true) {
			throw new ClassNotFoundException();
		}
		System.out.println(2);
		//19
		/*try {
			return; 
		}finally {
			System.out.println("Finally");
		}*/
		//20
		try {
			System.out.println(1);
			int i=10/0;
		}catch(NullPointerException ex) {
			System.out.println(4);
		}
		try {
			int i=23/0;
		}catch(ArithmeticException ex) {
			System.out.println(5);
		}finally {
			System.out.println(6);
		}
		System.out.println(7);
		//21
		System.out.println(1);
		System.out.println(Cogent.test02());
		System.out.println(2);
		//22
		try {
			System.out.println(1);
			String s=null;
			System.out.println(s.length());
		}catch(NullPointerException ex) {
			System.out.println(4);
		}
		try {
			int i=23/0;
			System.out.println(5);
		}finally {
			System.out.println(6);
		}
		System.out.println(7);
		//23
		try {
			int a[]=new int[5];
			a[5]=30/0;
		}catch(ArithmeticException e) {
			System.out.println("task1 is completed");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("task 2 completed");
		}catch(Exception e) {
			System.out.println("common task completed");
		}
		System.out.println("rest of the code");
	//24
		try {
			int a[]=new int[5];
			a[5]=30/0;
		}catch(Exception e) {
			System.out.println("Common task completed");
		}
	}
	public static void badMethod() {
		throw new RuntimeException();
	}
	
	
}
