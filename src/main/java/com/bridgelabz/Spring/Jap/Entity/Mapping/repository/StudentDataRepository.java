package com.bridgelabz.Spring.Jap.Entity.Mapping.repository;

import com.bridgelabz.Spring.Jap.Entity.Mapping.model.StudentData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDataRepository extends JpaRepository<StudentData,Integer> {
}
