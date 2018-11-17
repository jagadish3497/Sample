package jai;

public class Singleton {
		private static Singleton single = null; 
		 public String s;
		 
			private Singleton() 
			{ 
				s = "Hello I am Singleton class"; 
			} 

			public static Singleton getInstance() 
			{ 
				if (single == null) 
					single = new Singleton(); 
					return single; 
			} 
			
		public static void main(String[] args) {
			Singleton y = Singleton.getInstance(); 
			System.out.println(y.s); 
		}

	}

	
