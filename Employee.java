package jai;
	public abstract class Employee {
		int employeeId;
	    String employeeName;
	    double salary;
	 
	    public Employee(int employeeId, String employeeName, double salary) {
	        super();
	        this.employeeId = employeeId;
	        this.employeeName = employeeName;
	        this.salary = salary;
	    }
	    
	    public static void main (String[] args){
	    Manager m1=new Manager(1,"Amit" ,30000);
	    Labour l1=new Labour(1,"Krish" ,30000);
	    System.out.println("Employee:" +m1.getEmployeeName()+"--->"+"Salary with Incentives:"+m1.getSalary());
        System.out.println("Employee:" +l1.getEmployeeName()+"--->"+"Salary with Extrawork:"+l1.getSalary());
	    }
	 
	    public int getEmployeeId() {
	        return employeeId;
	    }
	    public void setEmployeeId(int employeeId) {
	        this.employeeId = employeeId;
	    }
	    public String getEmployeeName() {
	        return employeeName;
	    }
	    public void setEmployeeName(String employeeName) {
	        this.employeeName = employeeName;
	    }
	    public double getSalary() {
	        return salary;
	    }
	    public void setSalary(double salary) {
	       this.salary = salary;
	    }
	}