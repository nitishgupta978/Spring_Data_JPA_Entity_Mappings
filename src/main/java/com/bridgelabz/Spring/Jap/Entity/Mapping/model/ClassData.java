package com.bridgelabz.Spring.Jap.Entity.Mapping.model;
import lombok.Data;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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
    @OneToMany(cascade = CascadeType.ALL)

    private List<StudentData> studentData=new ArrayList<>();

    public List<StudentData> getStudentData() {
        return studentData;
    }

    public void setStudentData(List<StudentData> studentData) {
        this.studentData = studentData;
    }
}
