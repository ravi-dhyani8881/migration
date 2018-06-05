package com.migration.tool.migration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.migration.tool.model.Employe;


@org.springframework.web.bind.annotation.RestController
public class RestController {
	

	
 @RequestMapping("/api/hello")
 public String greet() {
  return "{\"name\":\"hello\"}";
 }
 
 
 @RequestMapping("/api/emp-details")
 public List<Employe> greet2() {
	  
	 
	 List<Employe> ss=new ArrayList<Employe>();
	 Employe emp=new Employe();
	 emp.setLastName("dhyani");
	 emp.setName("ravi");
	 
	 Employe emp2=new Employe();
	 
	 emp2.setLastName("dhyani");
	 emp2.setName("ravi2");
	 
	 ss.add(emp);
	 
	 ss.add(emp2);
	 
  return ss;
 }

 
 
 
   
 @RequestMapping("/api/emp-details-map")
 public Map<String, Employe> greet3() {
	  
	 Map<String, Employe> empMap=new HashMap();
	 
	 
	 Employe emp=new Employe();
	 emp.setLastName("dhyani");
	 emp.setName("ravi");
	 
	 Employe emp2=new Employe();
	 
	 emp2.setLastName("dhyani");
	 emp2.setName("ravi2");
	 
	 empMap.put("ravi", emp);
	 empMap.put("ravi2", emp2);
	 
		 
  return empMap;
 }
 
 
 
 @RequestMapping("/api/emp-details-array")
 public Employe[] greet4() {
	  
	 Employe[] empArray=new Employe[1];
	 
	 Employe emp=new Employe();
	 
	 emp.setLastName("ss");

	 emp.setName("ss");
	 
	 empArray[0]=emp;	 
	 
	 return empArray;
 }
 
 
 
 @CrossOrigin
 @GetMapping("/api/users")
 @ResponseBody
 public ResponseEntity<List<Employe>> getAllEmployee() {
	  
	 List<Employe> ss=new ArrayList<Employe>();
	 Employe emp=new Employe();
	 emp.setLastName("dhyani");
	 emp.setName("ravi");
	 
	 Employe emp2=new Employe();
	 emp2.setLastName("dhyani");
	 emp2.setName("ravi2");
	 
	 
	 Employe emp3=new Employe();
	 emp3.setLastName("dhyani");
	 emp3.setName("ravi3");
	
	 Employe emp4=new Employe();
	 emp4.setLastName("dhyani");
	 emp4.setName("ravi5");
	
	 
	 ss.add(emp);
	 ss.add(emp2);
	 ss.add(emp3);
	 ss.add(emp4);
	 
	 			 
	 return new ResponseEntity<List<Employe>>(ss, HttpStatus.OK);
 }
 

 @RequestMapping("/api/emp-details-string")
 public String getAllEmployee2() {
	  
	 			 
	 return "{\"Employee\":[{\"name\":\"ravi\",\"lastName\":\"dhyani\"},{\"name\":\"ravi2\",\"lastName\":\"dhyani\"}]}";
 }

 
 
}

