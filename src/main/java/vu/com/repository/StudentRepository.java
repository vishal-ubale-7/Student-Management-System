package vu.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vu.com.Entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long>
{}
