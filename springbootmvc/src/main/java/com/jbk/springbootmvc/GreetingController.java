package com.jbk.springbootmvc;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
    @GetMapping("/getAllEmployees")
    public String getAllEmployees(Model model) {
    	List<Employee> listEmp=new ArrayList<>(); 
    	listEmp.add(new Employee(34, "pune karvenagar"));
        model.addAttribute("listEmployees",listEmp);
        return "employeeList";
    }
    @GetMapping("/getOneEmployees")
    public String getOneEmployees(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
    	Employee employee= new Employee(34, "pune karvenagar11");
    	model.addAttribute("employee", employee);
        return "employee";
    }
    @GetMapping("/insertEmployeesPage")
    public String insertEmployeesPage() {
        return "insertEmployee";
    }
    @PostMapping("/insertEmployees")
    public String insertEmployees(@ModelAttribute Employee employee,Model model) {
      System.out.println("emplpoyee >> "+employee);
      model.addAttribute("employeeData",employee);
      
        return "employeeData";
    }

}
