package com.bridgelabz.Spring.Jap.Entity.Mapping.model;
import lombok.Data;
import javax.persistence.*;
@Entity
@Table
public @Data class ClassData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "class-id")
    private int classId;
   // @Column(name = "className")
    private String className;
    private String subjects;

    public ClassData() {
    }
    public ClassData( String className, String subjects) {

        this.className =className;
        this.subjects = subjects;
    }
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_student")

    private StudentData studentData;

    public StudentData getStudentData() {
        return studentData;
    }

    public void setStudentData(StudentData studentData) {
        this.studentData = studentData;
    }
}
