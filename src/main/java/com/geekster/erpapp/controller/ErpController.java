package com.geekster.erpapp.controller;

import com.geekster.erpapp.dto.StudenntPercentageDTO;
import com.geekster.erpapp.model.Student;
import com.geekster.erpapp.service.ErpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;


//http://localhost:8080/api/v1/erp-app
@RestController
@RequestMapping("/api/v1/erp-app")
public class ErpController {

@Autowired
private ErpService erpService;

//http://localhost:8080/api/v1/erp-app/find-all-students
   @GetMapping("find-all-students")
   public List<Student> findAllStudents(){
        return erpService.findAll();

    }

//http://localhost:8080/api/v1/erp-app/find-student/rollno/4
    @GetMapping("/find-student/rollno/{rollno}")
    public Student findStudentById(@PathVariable int rollno){
      return erpService.findById(rollno);

    }

    @GetMapping("topper")
    public Student findTopper(){

       return erpService.findTopper();
    }

    @GetMapping("all-percentage")
    public List<StudenntPercentageDTO> findPercentage(){

       return erpService.findPercentage();
    }

    @PostMapping("/add-student-details")
    public void addStudentDetails(@RequestBody Student student){

       erpService.addStudentDetails(student);
    }

    @PutMapping("/update-student-details/rollno/{rollno}")
    public Student updateStudentDetails(@PathVariable int rollno, @RequestBody Student student){
       erpService.updateStudentDetails(rollno,student);

        return student;
    }

    @DeleteMapping("/delete-student-details/rollno/{rollno}")
    public String deleteStudentDetails(@PathVariable int rollno){

       return  erpService.deleteStudentDetails(rollno);
    }

}
