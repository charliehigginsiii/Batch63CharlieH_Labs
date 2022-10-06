package Exception;

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
	
}

}
