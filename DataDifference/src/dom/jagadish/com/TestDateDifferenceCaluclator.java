package dom.jagadish.com;

public class TestDateDifferenceCaluclator {
	public static void main(String[] args) {
		
		TestProvider [] TestProviders=new TestProvider[15];
		TestProviders[0]=new TestProvider(new MyDate(4,6,2011), new MyDate(4,6,2011),0);
		TestProviders[1]=new TestProvider(new MyDate(6,4,2011), new MyDate(18,4,2011),12);
		TestProviders[2]=new TestProvider(new MyDate(6,4,2011), new MyDate(18,5,2011),42);
		TestProviders[3]=new TestProvider(new MyDate(6,4,2011), new MyDate(18,6,2011),73);
		TestProviders[4]=new TestProvider(new MyDate(6,4,2011), new MyDate(18,12,2011),256);
		TestProviders[5]=new TestProvider(new MyDate(6,4,2011), new MyDate(18,12,2012),622);
		TestProviders[6]=new TestProvider(new MyDate(6,4,2011), new MyDate(18,12,2013),987);
		TestProviders[7]=new TestProvider(new MyDate(6,4,2011), new MyDate(18,12,2113),37511);
		TestProviders[8]=new TestProvider(new MyDate(6,4,2011), new MyDate(18,12,2413),147084);
		TestProviders[9]=new TestProvider(new MyDate(6,4,2011), new MyDate(18,12,2813),293181);
		TestProviders[10]=new TestProvider(new MyDate(6,1,2011), new MyDate(6,3,2011),59);
		TestProviders[11]=new TestProvider(new MyDate(6,1,2012), new MyDate(6,3,2012),60);
		TestProviders[12]=new TestProvider(new MyDate(6,2,2012), new MyDate(6,3,2012),29);
		TestProviders[13]=new TestProvider(new MyDate(22,1,2012), new MyDate(15,11,2012),298);
		TestProviders[14]=new TestProvider(new MyDate(6,2,2012), new MyDate(6,12,2012),304);
		
		
		for(int index=0;index<TestProviders.length;index++){
			DateDifferenceProvider DT=new DateDifferenceProvider();
			int calculateddiff=DT.differeceCalculator(TestProviders[index].getStartDate(), TestProviders[index].getEndDate());
			if(calculateddiff==TestProviders[index].getCalculatedDifference()){
				System.out.println("test case passed");
				
			}
			else{
				
				System.out.println("test case failed");
				System.err.println("actual:"+TestProviders[index].getCalculatedDifference() +"calculated:"+calculateddiff);
			}
			
		}

		
		
	}
	}