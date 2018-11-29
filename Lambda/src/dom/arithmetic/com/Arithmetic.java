package dom.arithmetic.com;



public class Arithmetic {

	public static void main(String[] args) {
		//Addition
				Test add = (int a, int b)->{
					System.out.println("The Addition:" + a+b) ;
				};
				add.addition(2,2);
		
		//Subtraction.....
				Test1 sub = (int a, int b)->{
					
					System.out.println("The Substraction:" +  (a-b)) ;
				};
				sub.substraction(15,8);
		
		//Division.....
				Test2 div = (int a, int b)->{
					System.out.println("The Divison:" + a/b) ;
				};
				div.divison(20,2);
		//Multiply.....
				Test3 mul = (int a, int b)->{
					System.out.println("The Multiplication:" + a*b) ;
				};
				mul.multiply(2,5);
	}

}