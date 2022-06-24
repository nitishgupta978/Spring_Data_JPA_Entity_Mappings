package com.bridgelabz.Spring.Jap.Entity.Mapping;

import com.bridgelabz.Spring.Jap.Entity.Mapping.model.ClassData;
import com.bridgelabz.Spring.Jap.Entity.Mapping.model.StudentData;
import com.bridgelabz.Spring.Jap.Entity.Mapping.repository.ClassDataRepository;
import com.bridgelabz.Spring.Jap.Entity.Mapping.repository.StudentDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJapEntityMappingApplication implements CommandLineRunner {
	@Autowired
	private StudentDataRepository studentDataRepository;

	@Autowired
	private ClassDataRepository classDataRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringJapEntityMappingApplication.class, args);
	}

	public void run(String...args) throws Exception{

		ClassData classData= new ClassData("Backend","SpringBoot");
		StudentData studentData1= new StudentData("FRONTED","MECHANICAL");
		StudentData studentData2= new StudentData("fronted","Civil");


		classData.getStudentData().add(studentData1);
		classData.getStudentData().add(studentData2);
		classDataRepository.save(classData);

	}

}
