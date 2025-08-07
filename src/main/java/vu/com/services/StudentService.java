package vu.com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vu.com.Entities.Student;
import vu.com.repository.StudentRepository;
import java.util.List;
import java.util.Optional;


@Service
public class StudentService
{
    @Autowired
    StudentRepository studentRepository;

    //add student
    public List<Student> addStudents (List<Student> students)
    {
        return studentRepository.saveAll(students);
    }

    // getAllStudent
    public List<Student> getAllStudent()
    {
        return studentRepository.findAll();
    }

    //getStudentById
    public Optional<Student> getStudentById(Long id)
    {
        return studentRepository.findById(id);
    }
    // updateStudent
    public Student updateStudent(Long id, Student updatedStudent)
    {
        Student student = studentRepository.findById(id).orElseThrow();
        student.setName(updatedStudent.getName());
        student.setUsername(updatedStudent.getUsername());
        student.setEmail(updatedStudent.getEmail());
        student.setCity(updatedStudent.getCity());
        student.setAge(updatedStudent.getAge());
        student.setGender(updatedStudent.getGender());
        return studentRepository.save(student);
    }

    // deleteStudent
    public void deleteStudent(Long id)
    {
        studentRepository.deleteById(id);
    }
}

