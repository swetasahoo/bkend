package com.company.rest.service;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.company.rest.model.Employee;

@Path("/employees")
public class EmployeeService {
	EmployeeDao employeeDAO;

	public EmployeeService() {
		employeeDAO = new EmployeeDao();
	}

	@POST
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Employee addEmployee(Employee emp) {
		return employeeDAO.addEmployee(emp);
	}
	
	 @GET
	    @Path("/{empNo}")
	    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	    public String displayEmployeeHierachy(@PathParam("empNo") String empNo) {
	        return employeeDAO.displayHierachy(empNo);
	    }
	 
	 @DELETE
	    @Path("/{empNo}")
	    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	    public String deleteEmployee(@PathParam("empNo") String empNo) {
	        return employeeDAO.deleteEmployee(empNo);
	    }

	 
	  @GET
	    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	    public Employee getEmployeeSalaryRatio() {
	        return employeeDAO.displaySalaryRatio();
	    }


}
