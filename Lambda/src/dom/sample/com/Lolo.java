package dom.sample.com;

public abstract class Lolo {
	public static void main(String[] args) {
		Runnable r = new Runnable(){
			@Override
			public void run() {
				System.out.println("My Runnable");
			}};
			r.run();
			
			Runnable myr =()->System.out.println("Printed Inside");
			myr.run();
	}

}
