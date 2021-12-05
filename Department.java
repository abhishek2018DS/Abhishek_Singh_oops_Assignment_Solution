package oops.gl.assignment.department;

public class Department {
	/*Super department will contain 4 methods of return type String
	  			 and will not accept any parameter
               i)  departmentName 
              ii)  getTodaysWork  
              iii) getWorkDeadline
              iv) isTodayAHoliday
	 
	 */
	
	public static void departmentName() {

		String superdepartment = "SuperDepartment";
		System.out.println(superdepartment); 
		
	}
	public static void getTodaysWork() {
		String work= "Now work as of now";
		System.out.println(work);
		
	}
	public static void getWorkDeadline() {
		String num= "null";
		System.out.println(num);
		
	}
	public static void isTodayAHoliday() {
		String holiday= "Today is not holiday";
		System.out.println(holiday); 
		
	}
	

}
