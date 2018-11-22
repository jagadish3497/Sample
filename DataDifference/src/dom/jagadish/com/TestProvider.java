package dom.jagadish.com;

public class TestProvider {
	
	private MyDate startDate;
	private MyDate endDate;
	 private int calculatedDifference;

	public TestProvider(MyDate startDate, MyDate endDate, int calculatedDifference) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.calculatedDifference = calculatedDifference;
	}
	public MyDate getStartDate() {
		return startDate;
	}
	public MyDate getEndDate() {
		return endDate;
	}
	public int getCalculatedDifference() {
		return calculatedDifference;
	}
	}