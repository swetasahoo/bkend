package com.company.rest.service;

import java.util.HashMap;
import java.util.Map;

import com.company.rest.model.Employee;

public class EmployeeDao  {
	
	  private static final Map<String, Employee> empMap = new HashMap<String, Employee>();
	  
	    static {
	        initEmps();
	    }

	 
	    private static void initEmps() {
	        Employee emp1 = new Employee("E01", "Smith",1236788.67f ,"4","CEO","NULL");
	        
	        Employee emp2 = new Employee("E02", "Allen",563025f,"4.5","VP","E01");
	        Employee emp8 = new Employee("E08", "Paul",543025f,"4.1","VP","E01");
	        
	        Employee emp3 = new Employee("E03", "Jones",45236.5f, "4.3","Director","E02");
	        Employee emp9 = new Employee("E09", "Mark",50236.5f, "4.6","Director","E08");
	        
	        Employee emp4 = new Employee("E04", "John",55236.5f,"3.5", "Manager","E03");
	        Employee emp10= new Employee("E10", "Jenny",49236.5f,"4.7", "Manager","E09");
	        
	        Employee emp5 = new Employee("E05", "Jones",45236.5f,"3.6", "SDE","E04");
	        Employee emp6 = new Employee("E06", "Alice",35236.5f,"3.5", "SDE","E04");
	        Employee emp7 = new Employee("E07", "Maria",40236.5f,"3.6", "SDE","E10");
	        
	        
	        
	 
	        empMap.put(emp1.getEid(), emp1);
	        empMap.put(emp2.getEid(), emp2);
	        empMap.put(emp3.getEid(), emp3);
	        empMap.put(emp4.getEid(), emp3);
	        empMap.put(emp5.getEid(), emp3);
	        empMap.put(emp6.getEid(), emp3);
	        empMap.put(emp7.getEid(), emp3);
	        empMap.put(emp8.getEid(), emp3);
	        empMap.put(emp9.getEid(), emp3);
	        empMap.put(emp10.getEid(), emp3);
	    }
	    
	    public static Employee getEmployee(String empNo) {
	        return empMap.get(empNo);
	    }
	    
	    public static Employee addEmployee(Employee emp) {
	    	 empMap.put(emp.getEid(), emp);
		        return emp;

	    }
	    //display employee name 

	    public String getEmployeeName(String eid)
	    {
	    	Employee obj=(Employee) empMap.get(eid);
	    	return obj.getEname();
	    }
	    
	    
	    //return the supervisor name
	   
	 public String getSupervisorId(String eid)
	 {
		Employee obj=(Employee) empMap.get(eid);
		String id= obj.getSupervisorId(); 
		
		String supervisorName=getEmployeeName(id);
		return supervisorName;
		
	 }
	 
	
		public String displayHierachy(String eid) {
			
			if(eid.equals("E01"))
			{
				return getEmployeeName(eid);
			}
				
			return getEmployeeName(eid)+"-->"+displayHierachy(eid);
		}

		public Employee displaySalaryRatio() {
			// TODO Auto-generated method stub
			// Have to write the logic
			return null;
		}

		public String deleteEmployee(String empNo) {
			//logic missing
			
			// TODO Auto-generated method stub
			return null;
		}




}
