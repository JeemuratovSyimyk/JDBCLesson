package org.example.Service;

import org.example.Entity.Student;

import java.util.List;

public interface StudentService {
    void createTableStudent();
    void saveStudent(Student student);
    List<Student> getAllStudents();
    void updateStudent(Long id,Student student);
    void cleanTable();
    void dropTable();
}
