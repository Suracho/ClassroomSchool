package com.example.schoolclassroom.repository;

import com.example.schoolclassroom.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
