package com.bridgelabz.Spring.Jap.Entity.Mapping.repository;

import com.bridgelabz.Spring.Jap.Entity.Mapping.model.ClassData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassDataRepository extends JpaRepository<ClassData,Integer> {
}
