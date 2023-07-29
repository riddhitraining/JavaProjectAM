package day2;

public class Operators {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		//Arithmatic operators --> + - * / %
		System.out.println("-------Arithmatic operator-------");
		
		System.out.println("sum of a and b:" +(a+b));
		System.out.println("Diff of a and b:" +(b-a));
		System.out.println("Mul of a and b:" +(a*b));
		System.out.println("Div of a and b:" +(a/b));
		System.out.println("Mod of a and b:" +(a%b));
		
		//Relational operators (comparison operators) --> ==< > <= >= !=
		//Always return boolean value
		System.out.println("-------Relational operator-------");
		System.out.println(a==b);//false
		System.out.println(a>b);//false
		System.out.println(a<b);//true
		System.out.println(a>=b);//false
		System.out.println(a<=b);//true
		System.out.println(a!=b);//true
		
		//Logical operators &&   ||   !
		//works between two boolean
		
		boolean x=true;
		boolean y=false;
		System.out.println("-------Logical operator-------");
		System.out.println(x && y); //false
		System.out.println(x || y); //true
		System.out.println(! x); //false
		System.out.println(! y); //true
		
		//increment/decrement operators ++ -- 
		
		a=10;
		a++; //a=a+1;
		System.out.println(a);
		
		b=20;
		b--;  //b=b-1;
		System.out.println(b);
		
			
		
	}

}
