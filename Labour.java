package jai;

public class Labour extends Employee {


	public static  double Extrawork =0.2;
    public Labour(int employeeId, String employeeName, double salary) {
        super(employeeId, employeeName, salary);
    }
    public double getSalary() {
        return salary+salary*Extrawork;
    }
	}
	

