package dom.sample.com;

public class Sample {
		
	public static void main(String[] args) {
		//interface implementations
//		abc zzz = (int a, int b)->{
//			System.out.println(a+b) ;
//		};
//		zzz.a(2,2);
		//Type inference Variable
		//when u have single declaration we can declare as "s"
		lol my = s-> s.length();
		my.xyz("Hello");
		System.out.println(my.xyz("Hello"));
		
		//Runnable interface with lambda
		//instead of using annomanous  class we can use this way 
//		Thread th=new Thread(()->System.out.println("Hello"));
//		th.run();
	}

}

