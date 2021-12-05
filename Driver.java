package oops.gl.assignment.dirver;
import oops.gl.assignment.department.Department;
import oops.gl.assignment.admin.AdminDepartment;
import oops.gl.assignment.tech.TechDepartment;
import oops.gl.assignment.hr.HrDepartment;

public class Driver {
	public static void main(String[] args) {
		AdminDepartment adm= new AdminDepartment();
		adm.departmentName();
		adm.getTodaysWork();
		adm.getWorkDeadline();
		adm.isTodayAHoliday();
		System.out.println();
		
		HrDepartment hr= new HrDepartment();
		hr.departmentName();
		hr.doActivity();
		hr.getTodaysWork();
		hr.getWorkDeadline();
		hr.isTodayAHoliday();
		System.out.println();
		
		TechDepartment tech= new TechDepartment();
		tech.departmentName();
		tech.getTodaysWork();
		tech.getWorkDeadline();
		tech.getTechStackInformation();
		tech.isTodayAHoliday();
	}

}
