package oops.gl.assignment.admin;
import oops.gl.assignment.department.Department;

public class AdminDepartment extends Department{
	/*Admin department will contain 3 methods of return type String and 
	 	will not accept any parameter
               i)  departmentName 
              ii)  getTodaysWork  
              iii) getWorkDeadline
              
	departmentName will return “ Admin Department “
	getTodaysWork will return “Complete your documents Submission”
	getWorkDeadline will return “ Complete by EOD “
	 */
	public static void departmentName() {
		System.out.println("Welcome to Admin Department");
	}
	public static void getTodaysWork() {
		System.out.println("complete your Documents Submission");
	}
	public static void getWorkDeadline() {
		System.out.println("Complete by EOD");		
	}
	
}
