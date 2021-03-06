
public class EmployeeInfo implements Comparable<EmployeeInfo>
{
	 private int id;
	 private String firstName;
    private String lastName;
    private double salary;
    
    public EmployeeInfo()
    {
	     this(0, "Unknown", "Unknown", 0.0);
    }

    public EmployeeInfo(int id, String firstName, String lastName, double salary)
    {
	     this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
	 
	 public void setId( int id ) {
	     this.id = id;
    }		  
	 
	 public int getId() {
	     return id;
	 }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setSalary(double salary)
    {
       this.salary = salary;
    }

    public double getSalary() {
	    return salary;
	 }

    private double calculatePayCheck()
    {
		  //It is supposed to calculate the pay after deduction
		  return 0.0;
    }
    
    //override the compareTo method
    public int compareTo( EmployeeInfo other ) {
    
       int result;
       
       if( this.lastName.equals( other.lastName) ) {
          result = this.firstName.compareTo( other.firstName );
       }
       else
          result = this.lastName.compareTo( other.lastName );
          
       return result;
    }
		 
    public String toString()
    {
		return String.format("%-5d  %-11s %-12s %7.2f", id, firstName,
                             lastName, salary);
    }
	
}


