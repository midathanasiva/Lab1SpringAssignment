package com.cg.spring.lab1;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String args[])
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		Employee employee=(Employee) context.getBean("employee");
		System.out.println("EMPLOYEE Details:");
		System.out.println("Employee ID:"+employee.getEmployeeId());
		System.out.println("Employee Name:"+employee.getEmployeeName());
		System.out.println("Employee Salary:"+employee.getSalary());
		System.out.println("Employee BU:"+employee.getBusinessUnit());
		System.out.println("Employee Age:"+employee.getAge());
		System.out.println("SBU Details:");
		System.out.println("SBU ID"+employee.getSbu().getSbuId());
		System.out.println("SBU Head Name"+employee.getSbu().getSbuName());
		System.out.println("SBU Position"+employee.getSbu().getSbuHead());
		SBU sbu=(SBU) context.getBean("sbu");
		System.out.println("******************************************");
		System.out.println("Enter the Employee Id to search:");
		Scanner scanner=new Scanner(System.in);
		int employeeId=scanner.nextInt();
		boolean b=false;
		for(Employees employee1:sbu.employees)
		{
			if(employeeId==employee1.getEmployeeId())
			{
				System.out.println("Employee Name"+employee1.getEmployeeName());
				System.out.println("Salary"+employee1.getSalary());
				b=true;
			}
			
		}
		if(b==false)
		{
			System.out.println("EmployeeId doesnot Exists");
		}
		
		
		
	}

}
