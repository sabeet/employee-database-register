public class Employee extends Person{
  
  private int empNum;
  private int empSalary;
  private int empSocial;
  private String empDepartment;
  
  
  public Employee(){
    
    super();
    empNum=0;
    empSalary=0;
    empSocial=0;
    empDepartment="Unavailable";
  }
  
  public Employee(String empName, int empNum, int empSalary, int empSocial, String empDepartment){
    
    super(empName);
    setEmpNum(empNum);
    setEmpSal(empSalary);
    setEmpSoc(empSocial);
    setEmpDept(empDepartment);
  }
  
  
  private void setEmpNum(int empNum){
    
    this.empNum=empNum;
  
}
  
  private void setEmpSal(int empSalary){
	    
	    this.empSalary=empSalary;
	  
	}
  
  private void setEmpSoc(int empSocial){
	    
	    this.empSocial=empSocial;
	  
	}
  
  private void setEmpDept(String empDepartment){
    
    this.empDepartment=empDepartment;
  
}

private int getEmpNum(){
  return empNum;
}

private int getEmpSal(){
	  return empSalary;
	}

private int getEmpSoc(){
	  return empSocial;
	}

private String getEmpDept(){
  return empDepartment;
}

public void writeOutput() {
	System.out.println("Employee ID: " + empNum);
	super.writeOutput();
	System.out.println("Employee Salary: " + empSalary);
	System.out.println("Employee SSN: " + empSocial);
	System.out.println("Employee Department : " + empDepartment);
}

public String toString() {
	return "Employee Name: "+ getName() + 
			"\nEmployee ID: " + getEmpNum() +
			"\nEmployee Salary: " + getEmpSal() +
			"\nEmployee Social Security Number: " + getEmpSoc() +
			"\nEmployee Department: " + getEmpDept(); 
}

}