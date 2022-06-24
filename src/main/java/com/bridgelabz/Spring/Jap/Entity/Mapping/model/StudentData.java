package com.bridgelabz.Spring.Jap.Entity.Mapping.model;

import javax.persistence.*;

@Entity
@Table
public class StudentData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "student_id")
    private int studentId;

//    @Column(name = "name")
    private String name;
    private String branch;

    public StudentData() {
    }

    public StudentData(String name, String branch) {
        this.name = name;
        this.branch = branch;
    }

}
