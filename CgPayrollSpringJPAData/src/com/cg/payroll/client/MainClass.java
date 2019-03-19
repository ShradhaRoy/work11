 
package com.cg.payroll.client;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.exceptions.AssociateDetailNotfoundException;
import com.cg.payroll.services.PayrollServices;
import com.cg.payroll.services.PayrollServicesImpl;
public class MainClass {
	public static void main(String[] args) {
		
		try {
		ApplicationContext context=new ClassPathXmlApplicationContext("payrollBeans.xml");

		PayrollServices payrollServices=(PayrollServices) context.getBean("payrollServices");
		int associateId=payrollServices.acceptAssociateDetails("Shradha", "Roy", "shradha.roy305@gmail.com", "ECE", "CEO", "12345", 50000, 300000, 1200, 12345, 1001, "sbi", "wqerty");
		System.out.println(associateId);
		
	}catch(Exception e) {
		e.printStackTrace();
	}

	
	}
}
