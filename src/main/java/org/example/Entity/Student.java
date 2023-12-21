package org.example.Entity;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class Student {
    private Long id;
    private String firstname;
    private String lastname;
    private int age;

    public Student(Long id, String firstname, String lastname, int age) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public Student(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;

    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                '}';
    }
}
