package dom.order.com;

import java.util.ArrayList;

public class OrderTest {

	public static void main(String[] args) {
		ArrayList<Order> order=new ArrayList<Order>();
		order.add(new Order(100000,"Accepted"));
		order.add(new Order(20000,"Accepted"));
		order.add(new Order(50000,"Accepted"));
		order.add(new Order(110000,"Completed"));
		
		order.forEach((i)->{
			if(i.getPrice()>10000 && (i.getStatus() == "Accepted" || i.getStatus()=="Completed" )) 
			{
				System.out.println(i);
				}
		});

	}

}
