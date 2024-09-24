package org.example;

import jakarta.persistence.*;

@Entity
@Table (name = "person")
public class Person {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    public Long id;

    @Column (name = "fName")
    public String fName;

    @Column (name = "lName")
    public String lName;

    @Column (name = "age")
    public int age;

    public Person(String fName, String lName, int age) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
    }

    public Person() {
        this.fName = "Bob";
    }
}
