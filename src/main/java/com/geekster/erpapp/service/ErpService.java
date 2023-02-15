package com.geekster.erpapp.service;

import com.geekster.erpapp.dto.StudenntPercentageDTO;
import com.geekster.erpapp.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ErpService {

    private static final List<Student> students = new ArrayList<>();// In memory Database
    private static int rollno = 0;

    static {

        Student s1 = new Student(++rollno, "Pratik", "Male", List.of(80.0, 90.0, 87.0, 60.0), "Delhi");
        students.add(s1);
        Student s2 = new Student(++rollno, "Nitin", "Male", List.of(82.0, 70.0, 67.0, 80.0), "Punjab");
        students.add(s2);
        Student s3 = new Student(++rollno, "Vishal", "Male", List.of(60.0, 80.0, 30.0, 70.0), "Prayagraj");
        students.add(s3);
        Student s4 = new Student(++rollno, "Poonam", "Female", List.of(76.0, 65.0, 87.0, 88.0), "Allahabad");
        students.add(s4);
        Student s5 = new Student(++rollno, "Pranjal", "Male", List.of(76.0, 89.0, 55.0, 45.0), "Lucknow");
        students.add(s5);
    }

    public List<Student> findAll() {

        return students;
    }

    public Student findById(int rollno) {
        for (Student student : students) {
            if (student.getRollNumber() == rollno) {
                return student;
            }

        }
        return null;
    }

    public Student findTopper() {
        return null;
    }

    public List<StudenntPercentageDTO> findPercentage() {
        List<StudenntPercentageDTO> percentages = new ArrayList<>();

        for (Student student:students){
            List<Double> marks = student.getMarks();
            double perc = 0.0;
            for (Double mark:marks){
                perc+= mark;
            }
            perc*=0.04;

            StudenntPercentageDTO studenntPercentageDTO = new StudenntPercentageDTO(
                    student.getRollNumber(),student.getName(),perc);

            percentages.add(studenntPercentageDTO);
        }
        return percentages;

    }

    public void addStudentDetails(Student student) {
        students.add(student);

    }

    public String updateStudentDetails(int rollno, Student newstudent) {
        for(int i=0;i<students.size();i++){
            Student student1 = students.get(i);
            if (student1.getRollNumber()==rollno){
                students.set(i,student1);
                return "Data Updated";
            }
        }

        return null;
    }

    public String deleteStudentDetails(int rollno) {
        for (int i=0;i<students.size();i++){
            Student student2 = students.get(i);
            if (student2.getRollNumber()==rollno){
                students.remove(i);
                return "Data Deleted";
            }
        }
        return null;
    }
}
