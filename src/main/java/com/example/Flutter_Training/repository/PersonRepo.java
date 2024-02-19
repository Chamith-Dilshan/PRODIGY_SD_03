package com.example.Flutter_Training.repository;
import com.example.Flutter_Training.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepo extends JpaRepository<Person,Long> {
}
