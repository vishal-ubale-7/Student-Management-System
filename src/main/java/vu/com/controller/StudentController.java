package vu.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vu.com.Entities.Student;
import vu.com.services.StudentService;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/students")
public class StudentController
{

    @Autowired
    private StudentService studentService;

    // POST: Add student
    @PostMapping
    public List<Student>  createStudent(@RequestBody List<Student> students)
    {
        return studentService.addStudents(students);
    }

    // GET: Get all students
    @GetMapping
    public List<Student> getAllStudent()
    {
        return studentService.getAllStudent();
    }

    // GET: Get student by ID
    @GetMapping("/{id}")
    public Optional<Student> getStudentById(@PathVariable Long id)
    {
        return studentService.getStudentById(id);
    }

    // PUT: Update student
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student student)
    {
        return studentService.updateStudent(id, student);
    }

    // DELETE: Delete student
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id)
    {
        studentService.deleteStudent(id);
        return "Student deleted successfully";
    }
}
