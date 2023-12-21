package org.example;

import org.example.Config.Config;
import org.example.Entity.Student;
import org.example.Service.ServiceImpl.StudentServiceImpl;
import org.example.Service.StudentService;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num;
        StudentService studentService = new StudentServiceImpl();
        while (true) {
            switch (num = scanner.nextInt()) {

                case 1: studentService.createTableStudent();
                case 2: studentService.saveStudent(new Student("Syimyk", "Ulukbek Uulu", 21));
                case 3: studentService.getAllStudents().forEach(System.out::println);
                case 4: studentService.updateStudent(2L, new Student("Aizat", "Asanova", 20));
                case 5: studentService.cleanTable();
                case 6: studentService.dropTable();
            }
        }
    }
}