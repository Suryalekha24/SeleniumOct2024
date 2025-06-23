package week6.day1;

public class LearnEncapsulation {
	
	private int ssn;
	private String empName;
	private int empAge;
	
	public static void main(String[] args) {
		LearnEncapsulation le= new LearnEncapsulation();
		le.setSsn(123);
		System.out.println("ssn number is:"+le.getSsn());
		le.setEmpName("Dhachu");
		System.out.println("Emp name is:"+le.getEmpName());
		le.setEmpAge(10);
		System.out.println("Emp Age is:"+le.getEmpAge());
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

}
