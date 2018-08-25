package com.ERP.Payroll.Salary;

import org.springframework.web.bind.annotation.RequestMapping;

public class EnterSalary {

	@RequestMapping("/EnterSalary")
    public String SignIn(){
        return "Views/EnterSalary.html";
    }
}
