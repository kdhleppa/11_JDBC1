package edu.kh.jdbc1.model.vo;

public class Employee {
	
	private String empName;
	private String jobName;
	public Employee(String empName, String hireDate, char gender) {
		super();
		this.empName = empName;
		this.hireDate = hireDate;
		this.gender = gender;
	}


	private int salary;
	private int annualIncome;
	
	private String hireDate;
	private char gender; // 남자 m 여자 f
	
	public String getHireDate() {
		return hireDate;
	}

	public Employee(String empName, String jobName, int salary, int annualIncome, String hireDate, char gender) {
		super();
		this.empName = empName;
		this.jobName = jobName;
		this.salary = salary;
		this.annualIncome = annualIncome;
		this.hireDate = hireDate;
		this.gender = gender;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public Employee() {}
	
	public Employee(String empName, String jobName, int salary, int annualIncome) {
		super();
		this.empName = empName;
		this.jobName = jobName;
		this.salary = salary;
		this.annualIncome = annualIncome;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getJobName() {
		return jobName;
	}


	public void setJobName(String jobName) {
		this.jobName = jobName;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public int getAnnualIncome() {
		return annualIncome;
	}


	public void setAnnualIncome(int annualIncome) {
		this.annualIncome = annualIncome;
	}


	@Override
	public String toString() {
		return "사원명 : " + empName + "/ 직급 : " + jobName + "/ 봉급" + salary + "/ 연봉"
				+ annualIncome;
	}
	
	
	
	
	
}
